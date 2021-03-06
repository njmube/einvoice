/*
* Producto elaborado para Alignet S.A.C.
*
*/

package pe.labtech.einvoice.core.tasks.tools;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.beanutils.BeanUtils;
import pe.labtech.einvoice.commons.model.DatabaseManager;
import pe.labtech.einvoice.core.entity.Document;
import pe.labtech.einvoice.core.entity.DocumentData;
import static pe.labtech.einvoice.core.model.DocumentDataLoaderLocal.DATA_LOADED;
import pe.labtech.einvoice.core.ws.messages.response.CommonBody;
import pe.labtech.einvoice.core.ws.messages.response.DocumentInfo;
import pe.labtech.einvoice.core.ws.messages.response.Response;
import pe.labtech.einvoice.core.ws.messages.response.ResponseMessage;

/**
* Clase Tools.
*
* @author Labtech S.R.L. (info@labtech.pe)
*/

public class Tools {

    
    /**
     * Arma un número.
     * 
     * @param amount monto
     * @return número
     */
    public static BigDecimal buildNumber(String amount) {
        if (amount == null) {
            return null;
        }
        return new BigDecimal(amount);
    }

    /**
     * Graba un requerimiento en la base de datos.
     * 
     * @param db Manejador de base de datos.
     * @param document documento
     * @param request requerimiento 
     */
    public static void saveRequest(DatabaseManager db, Document document, String request) {
        //save request
        db.handle(e -> {
            List<DocumentData> list = e.createNamedQuery("DocumentData.findById", DocumentData.class)
                    .setParameter("document", document)
                    .setParameter("name", "signXml")
                    .getResultList();

            if (list.isEmpty()) {
                final DocumentData data = new DocumentData();
                data.setDocument(document);
                data.setName("signXml");
                data.setData(request.getBytes());
                data.setStatus(DATA_LOADED);
                data.setReplicate(Boolean.TRUE);
                e.persist(data);
            } else {
                final DocumentData data = list.get(0);
                data.setData(request.getBytes());
                data.setReplicate(Boolean.TRUE);
                data.setStatus(DATA_LOADED);
            }
        });
    }

    /**
     * Convierte una excepción en texto descriptivo.
     * 
     * @param ex excepción 
     * @param headers cabecera 
     * @return texto descriptivo 
     */
    public static String exToString(Exception ex, String... headers) {
        try (StringWriter sw = new StringWriter(); PrintWriter pw = new PrintWriter(sw)) {
            Arrays.stream(headers).forEach(s -> pw.println(s));
            pw.println();
            pw.println(ex.getMessage());
            pw.println();
            pw.println("Stack Trace");
            ex.printStackTrace(pw);
            pw.flush();
            pw.close();
            return sw.toString();
        } catch (IOException ioex) {
            throw new RuntimeException(ioex);
        }
    }

    /**
     * Covierte un objeto en un mapa.
     * 
     * @param di objeto
     * @return mapa de datos
     */
    public static Map<String, String> describe(DocumentInfo di) {
        try {
            Map<String, String> responses = BeanUtils.describe(di).entrySet().stream()
                    .filter(e -> !e.getKey().equals("class"))
                    .filter(e -> e.getValue() != null)
                    .collect(
                            Collectors.toMap(
                                    e -> e.getKey(),
                                    e -> e.getValue()
                            )
                    );
            return responses;
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            //this condition should never happen since the bean is always describable
            throw new RuntimeException(ex);
        }
    }

    /**
     * Obtiene el RUC a partir del identificador del emisor.
     * 
     * @param clientId identificador del emisor
     * @return RUC del emisor
     */
    public static String buildClientID(String clientId) {
        if (clientId.contains("-")) {
            return clientId.split("-")[1];
        }
        return clientId;
    }

    //<editor-fold defaultstate="collapsed" desc="metodos para interpretar las respuestas del servicio">
    public static boolean noRecordsFound(Response r) {
        if (r.getResponseBody() == null) {
            return false;
        }
        CommonBody c = r.getResponseBody().getCommon();
        if (c == null || c.getSummary() == null) {
            //si no hay common body o no hay summary es firma
            return false;
        }
        if (c.getSummary().getTotal() == null) {
            //no hay como comprobar
            return false;
        }
        return c.getSummary().getTotal() == 0;
    }

    public static DocumentInfo getDocumentInfo(Response response) {
        return response.getResponseBody().getXml().getDocuments().get(0);
    }

    public static boolean isSigned(DocumentInfo di) {
        return "SIGNED".equals(di.getStatus());
    }

    public static boolean wasSignedBefore(DocumentInfo di) {
        //if error check if it was for signed before
        boolean signedBefore = false;
        if (di.getMessages() != null) {
            Optional<ResponseMessage> messageAlreadySigned = di.getMessages().stream()
                    .filter(m -> "400".equals(m.getStatusCode()) && "7074".equals(m.getDetailCode()))
                    .findAny();
            signedBefore = messageAlreadySigned.isPresent();
        }
        return signedBefore;
    }

    public static boolean wasReplicatedBefore(Response r) {
        try {
            return r.getResponseBody().getCommon().getMessages().stream()
                    .filter(m -> "400".equals(m.getStatusCode()) && "7213".equals(m.getDetailCode()))
                    .findFirst()
                    .isPresent();
        } catch (RuntimeException ex) {
            return false;
        }
    }

    public static boolean isInvalid(Response response) {
        return response.getResponseBody() == null
                || response.getResponseBody().getXml() == null
                || response.getResponseBody().getXml().getDocuments() == null
                || response.getResponseBody().getXml().getDocuments().isEmpty();
    }

    /**
     * Checks if sunatStatus is not in a terminal state
     *
     * @param sunatStatus
     * @return
     */
    public static boolean isNotFinishedInSunat(String sunatStatus) {
        return !(isFinishedInSunat(sunatStatus));
    }

    /**
     * Checks if the status is finished in sunat
     *
     * @param sunatStatus
     * @return
     */
    public static boolean isFinishedInSunat(String sunatStatus) {
        return sunatStatus != null && (sunatStatus.startsWith("RC") || sunatStatus.startsWith("AC"));
    }

    public static boolean isRelatedToInvoice03(String documentNumber) {
        return documentNumber != null && documentNumber.startsWith("B");
    }

    public static boolean isPending(String sunatStatus) {
        return sunatStatus != null && sunatStatus.startsWith("PE");
    }

    public static boolean isAccepted(String sunatStatus) {
        return sunatStatus != null && sunatStatus.startsWith("AC");
    }

    public static boolean isRejected(String sunatStatus) {
        return sunatStatus != null && sunatStatus.startsWith("RC");
    }

//</editor-fold>
    /**
     * Serializa el mensaje de respuesta.
     * 
     * @param r respuesta
     * @return mensaje serializado 
     */
    public static String serializeMessages(Response r) {
        List<Map<String, String>> errors = new LinkedList<>();
        try {
            r.getResponseBody().getCommon().getMessages().stream().forEach(m -> errors.add(
                    toMap(
                            String.class, String.class,
                            "statusCode", m.getStatusCode(),
                            "statusDescription", m.getStatusDescription(),
                            "detailCode", m.getDetailCode(),
                            "detailDescription", m.getDetailDescription()
                    )
            ));

        } catch (RuntimeException ex) {
        }
        try {
            r.getResponseBody().getXml().getDocuments().get(0).getMessages().stream().forEach(m -> errors.add(
                    toMap(
                            String.class, String.class,
                            "statusCode", m.getStatusCode(),
                            "statusDescription", m.getStatusDescription(),
                            "detailCode", m.getDetailCode(),
                            "detailDescription", m.getDetailDescription()
                    )
            ));
        } catch (RuntimeException ex) {
        }
        return new Gson().toJson(errors);
    }

    /**
     * Convierte una lista de atributos en un mapa.
     * 
     * @param <K> tipo de la llave
     * @param <V> tipo del valor
     * @param k clase base de la llave
     * @param v clase base del valor
     * @param values valores
     * @return  mapa
     */
    public static <K, V> Map<K, V> toMap(Class<K> k, Class<V> v, Object... values) {
        Map<K, V> map = new LinkedHashMap<>();
        for (int i = 0; i < values.length; i += 2) {
            map.put((K) values[i], (V) values[i + 1]);
        }
        return map;
    }

}
