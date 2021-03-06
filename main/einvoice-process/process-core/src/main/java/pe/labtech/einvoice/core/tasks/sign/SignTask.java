/*
 * Producto elaborado para Alignet S.A.C.
 *
 */
package pe.labtech.einvoice.core.tasks.sign;

import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import pe.labtech.einvoice.commons.model.InvoiceType;
import static pe.labtech.einvoice.commons.model.InvoiceType.*;
import pe.labtech.einvoice.core.entity.Document;
import pe.labtech.einvoice.core.entity.SecurityValues;
import pe.labtech.einvoice.core.model.PrivateDatabaseManagerLocal;
import pe.labtech.einvoice.core.ws.messages.response.DocumentInfo;

/**
 *
 * @author Carlos
 */
@Stateless
public class SignTask implements SignTaskLocal {

    @EJB
    PrivateDatabaseManagerLocal db;
    @EJB
    private OfflineSummary offlineSummary;
    @EJB
    private OnlineSummary onlineSummary;
    @EJB
    private OfflineInvoice offlineInvoice;
    @EJB
    private OnlineInvoice onlineInvoice;

    /**
     * Firma un documento.
     *
     * @param document documento
     */
    @Asynchronous
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    @Override
    public void handle(Document document) {
        sign(document);
    }

    /**
     * Firma un documento.
     *
     * @param id identificador del documento
     * @return informacion del documento
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    @Override
    public DocumentInfo handle(Long id) {
        Document document = db.seek(e -> e.find(Document.class, id));
        return sign(document);
    }

    private DocumentInfo sign(Document document) {
        InvoiceType type = InvoiceType.getType(document.getDocumentNumber());
        SecurityValues sv = db.seek(e -> e.find(SecurityValues.class, document.getClientId()));
        if (sv != null) {
            //hay un keystore... firma offline
            switch (type) {
                case Document:
                    return this.offlineInvoice.handle(document);
                case Summary:
                case Cancel:
                    return this.offlineSummary.handle(document);
            }
        } else {
            //no hay un keystore... firma online
            switch (type) {
                case Document:
                    return this.onlineInvoice.handle(document);
                case Summary:
                case Cancel:
                    return this.onlineSummary.handle(document);
            }
        }
        return null;
    }
}
