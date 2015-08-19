/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.einvoice.api.restful;

import java.util.logging.Logger;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import static pe.labtech.einvoice.api.restful.RestTools.buildItemId;
import pe.labtech.einvoice.core.ws.messages.response.DocumentInfo;
import pe.labtech.einvoice.replicator.entity.CancelDetail;
import pe.labtech.einvoice.replicator.entity.DocumentHeader;
import pe.labtech.einvoice.replicator.entity.CancelHeader;
import pe.labtech.einvoice.replicator.entity.CancelHeaderPK;
import pe.labtech.einvoice.replicator.entity.DocumentDetail;
import pe.labtech.einvoice.replicator.entity.DocumentHeaderPK;
import pe.labtech.einvoice.replicator.entity.SummaryDetail;
import pe.labtech.einvoice.replicator.entity.SummaryHeader;
import pe.labtech.einvoice.replicator.entity.SummaryHeaderPK;

/**
 * REST Web Service
 *
 * @author Carlos
 */
@Singleton
@Path("{issuerType}/{issuerId}")
@TransactionManagement(TransactionManagementType.BEAN)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class InvoiceResource {

    @EJB
    private RestHelperLocal help;

    /**
     * Creates a new instance of GenericResource
     */
    public InvoiceResource() {
    }

    @GET
    @Path("{documentType}/{documentNumber}")
    @Produces("application/xml")
    public DocumentInfo get(
            @PathParam("issuerType") String issuerType,
            @PathParam("issuerId") String issuerId,
            @PathParam("documentType") String documentType,
            @PathParam("documentNumber") String documentNumber) {
        if (documentType.startsWith("R")) {
            documentNumber = documentType + "-" + documentNumber;
        }
        return help.find(issuerType, issuerId, documentType, documentNumber);
    }

    /**
     *
     *
     * @param issuerType
     * @param issuerId
     * @param documentNumber
     * @param source
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Path("01/{documentNumber}")
    @Consumes({"application/xml"})
    @Produces("application/xml")
    public DocumentInfo sign_01(
            @PathParam("issuerType") String issuerType,
            @PathParam("issuerId") String issuerId,
            //            @PathParam("documentType") String documentType,
            @PathParam("documentNumber") String documentNumber,
            @QueryParam("source") @DefaultValue("##NONE") String source,
            DocumentHeader content
    ) {
        Logger.getLogger(this.getClass().getName()).info("sign_01");
        content.setInHabilitado("1");
        configureId(content, issuerType, issuerId, "01", documentNumber);
        return help.sign(content, source);
    }

    /**
     *
     *
     * @param issuerType
     * @param issuerId
     * @param documentNumber
     * @param source
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Path("03/{documentNumber}")
    @Consumes({"application/xml"})
    @Produces("application/xml")
    public DocumentInfo sign_03(
            @PathParam("issuerType") String issuerType,
            @PathParam("issuerId") String issuerId,
            @PathParam("documentNumber") String documentNumber,
            @QueryParam("source") @DefaultValue("##NONE") String source,
            DocumentHeader content
    ) {
        Logger.getLogger(this.getClass().getName()).info("sign_03");
        content.setInHabilitado("1");
        configureId(content, issuerType, issuerId, "03", documentNumber);
        return help.sign(content, source);
    }

    /**
     *
     *
     * @param issuerType
     * @param issuerId
     * @param documentNumber
     * @param source
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Path("07/{documentNumber}")
    @Consumes({"application/xml"})
    @Produces("application/xml")
    public DocumentInfo sign_07(
            @PathParam("issuerType") String issuerType,
            @PathParam("issuerId") String issuerId,
            @PathParam("documentNumber") String documentNumber,
            @QueryParam("source") @DefaultValue("##NONE") String source,
            DocumentHeader content
    ) {
        Logger.getLogger(this.getClass().getName()).info("sign_07");
        content.setInHabilitado("1");
        configureId(content, issuerType, issuerId, "07", documentNumber);
        return help.sign(content, source);
    }

    /**
     *
     *
     * @param issuerType
     * @param issuerId
     * @param documentNumber
     * @param source
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Path("08/{documentNumber}")
    @Consumes({"application/xml"})
    @Produces("application/xml")
    public DocumentInfo sign_08(
            @PathParam("issuerType") String issuerType,
            @PathParam("issuerId") String issuerId,
            @PathParam("documentNumber") String documentNumber,
            @QueryParam("source") @DefaultValue("##NONE") String source,
            DocumentHeader content
    ) {
        Logger.getLogger(this.getClass().getName()).info("sign_08");
        content.setInHabilitado("1");
        configureId(content, issuerType, issuerId, "08", documentNumber);
        return help.sign(content, source);
    }

    @PUT
    @Path("RC/{documentNumber}")
    @Consumes({"application/xml"})
    @Produces("application/xml")
    public DocumentInfo sign_RC(
            @PathParam("issuerType") String issuerType,
            @PathParam("issuerId") String issuerId,
            @PathParam("documentNumber") String documentNumber,
            @QueryParam("source") @DefaultValue("##NONE") String source,
            SummaryHeader content
    ) {
        Logger.getLogger(this.getClass().getName()).info("sign_RC");
        content.setInHabilitado("1");
        configureId(content, issuerType, issuerId, "RC", documentNumber);
        return help.sign(content, source);
    }

    @PUT
    @Path("RA/{documentNumber}")
    @Consumes({"application/xml"})
    @Produces("application/xml")
    public DocumentInfo sign_RA(
            @PathParam("issuerType") String issuerType,
            @PathParam("issuerId") String issuerId,
            @PathParam("documentNumber") String documentNumber,
            @QueryParam("source") @DefaultValue("##NONE") String source,
            CancelHeader content
    ) {
        Logger.getLogger(this.getClass().getName()).info("sign_RA");
        content.setInHabilitado("1");
        configureId(content, issuerType, issuerId, "RA", documentNumber);
        return help.sign(content, source);
    }

    public static void configureId(DocumentHeader content, String issuerType, String issuerId, String documentType, String documentNumber) {
        content.setId(
                new DocumentHeaderPK(
                        issuerType,
                        issuerId,
                        documentType,
                        documentNumber
                )
        );
        long i = 0l;
        for (DocumentDetail item : content.getItem()) {
            item.setId(buildItemId(content.getId(), ++i));
        }
    }

    public static void configureId(SummaryHeader content, String issuerType, String issuerId, String documentType, String documentNumber) {
        content.setId(new SummaryHeaderPK(issuerType, issuerId, documentType + "-" + documentNumber));
        long i = 0l;
        for (SummaryDetail item : content.getItem()) {
            item.setId(buildItemId(content.getId(), ++i));
        }
    }

    public static void configureId(CancelHeader content, String issuerType, String issuerId, String documentType, String documentNumber) {
        content.setId(new CancelHeaderPK(issuerType, issuerId, documentType + "-" + documentNumber));
        long i = 0l;
        for (CancelDetail item : content.getItem()) {
            item.setId(buildItemId(content.getId(), ++i));
        }
    }
}
