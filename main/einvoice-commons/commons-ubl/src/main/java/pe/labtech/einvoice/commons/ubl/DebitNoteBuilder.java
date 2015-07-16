/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.einvoice.commons.ubl;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.w3c.dom.Document;
import pe.labtech.ubl.model.DebitNotePrefixMapper;
import pe.labtech.ubl.model.DebitNote;
import pe.labtech.ubl.model.aggregate.AccountingParty;
import pe.labtech.ubl.model.aggregate.Address;
import pe.labtech.ubl.model.aggregate.Attachment;
import pe.labtech.ubl.model.aggregate.BillingReference;
import pe.labtech.ubl.model.aggregate.Country;
import pe.labtech.ubl.model.aggregate.DebitNoteLine;
import pe.labtech.ubl.model.aggregate.DiscrepancyResponse;
import pe.labtech.ubl.model.aggregate.DocumentReference;
import pe.labtech.ubl.model.aggregate.ExternalReference;
import pe.labtech.ubl.model.aggregate.InvoiceDocumentReference;
import pe.labtech.ubl.model.aggregate.LegalMonetaryTotal;
import pe.labtech.ubl.model.aggregate.Party;
import pe.labtech.ubl.model.aggregate.PartyLegalEntity;
import pe.labtech.ubl.model.aggregate.PartyName;
import pe.labtech.ubl.model.aggregate.Signature;
import pe.labtech.ubl.model.aggregate.TaxCategory;
import pe.labtech.ubl.model.aggregate.TaxScheme;
import pe.labtech.ubl.model.aggregate.TaxSubtotal;
import pe.labtech.ubl.model.aggregate.TaxTotal;
import pe.labtech.ubl.model.basic.Amount;
import pe.labtech.ubl.model.extensions.ExtensionContent;
import pe.labtech.ubl.model.extensions.UBLExtension;
import pe.labtech.ubl.model.extensions.UBLExtensions;
import pe.labtech.ubl.model.sunat.AdditionalInformation;
import pe.labtech.ubl.model.sunat.AdditionalMonetaryTotal;
import pe.labtech.ubl.model.sunat.AdditionalProperty;

/**
 *
 * @author Carlos
 */
public class DebitNoteBuilder implements Builder<DebitNote> {

    private static final JAXBContext JAXB_CONTEXT;
    private static final DocumentBuilderFactory DOCUMENT_BUILDER_FACTORY;

    private DebitNote document;

    static {
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(DebitNote.class);
        } catch (JAXBException ex) {
            Logger.getAnonymousLogger().log(Level.SEVERE, null, ex);
            context = null;
        }
        JAXB_CONTEXT = context;
        DOCUMENT_BUILDER_FACTORY = DocumentBuilderFactory.newInstance();
        DOCUMENT_BUILDER_FACTORY.setNamespaceAware(true);

    }

    public DebitNoteBuilder init(final String invoiceNumber, final String invoiceDate, final String currency, final String supplierType, final String supplierId, final String supplierName, final String clientType, final String clientId, final String clientName) {
        this.document = createDebitNote(invoiceNumber, invoiceDate, currency, supplierType, supplierId, supplierName, clientType, clientId, clientName);
        return this;
    }

    private static DebitNote createDebitNote(final String invoiceNumber, final String invoiceDate, final String currency, final String supplierType, final String supplierId, final String supplierName, final String clientType, final String clientId, final String clientName) {
        DebitNote i = new DebitNote();
        i.setUBLExtensions(new UBLExtensions());
        i.getUBLExtensions().getUBLExtension().addAll(
                Arrays.asList(
                        new UBLExtension("SUNAT", new ExtensionContent(new AdditionalInformation(), null)),
                        new UBLExtension("EBIZ", new ExtensionContent(null, new AdditionalInformation()))
                )
        );
        //valores constantes
        i.setUBLVersionID("2.0");
        i.setCustomizationID("1.0");
        //valores variables pero mandatorios
        i.setID(invoiceNumber);
        i.setIssueDate(invoiceDate);
        //el valor de la moneda del documento es mandatorio antes de iniciar todo el proceso
        i.setDocumentCurrencyCode(currency);
        //estructura obligatoria
        i.setSignature(new Signature());
        i.getSignature().setID("IDSignKG");
        i.getSignature().setSignatoryParty(new Party(supplierId, supplierName));
        i.getSignature().setDigitalSignatureAttachment(new Attachment(new ExternalReference("#signatureKG")));
        //datos del emisor
        i.setAccountingSupplierParty(
                new AccountingParty(
                        supplierType,
                        supplierId,
                        new Party(
                                new Address(),
                                new PartyLegalEntity(supplierName)
                        )
                )
        );
        //datos del cliente
        i.setAccountingCustomerParty(
                new AccountingParty(
                        clientType,
                        clientId,
                        new Party(
                                null,
                                new PartyLegalEntity(clientName)
                        )
                )
        );
        return i;
    }

    public DebitNoteBuilder addAmount(String id, String amount) {
        if (amount == null) {
            return this;
        }
        return this.addAmount(id, new BigDecimal(amount));
    }

    public DebitNoteBuilder addAmount(String id, BigDecimal amount) {
        if (amount != null && id != null) {
            AdditionalMonetaryTotal amt = new AdditionalMonetaryTotal(
                    id,
                    null,
                    null,
                    new Amount(document.getDocumentCurrencyCode(), amount),
                    null,
                    null
            );
            document
                    .getUBLExtensions()
                    .getUBLExtension()
                    .get(0)
                    .getExtensionContent()
                    .getSunatAdditionalInformation()
                    .getAdditionalMonetaryTotal()
                    .add(amt);
        }
        return this;
    }

    public DebitNoteBuilder addNote(String id, String value) {
        if (id != null && value != null) {
            document
                    .getUBLExtensions()
                    .getUBLExtension()
                    .get(0)
                    .getExtensionContent()
                    .getSunatAdditionalInformation()
                    .getAdditionalProperty()
                    .add(new AdditionalProperty(id, null, value));
        }
        return this;
    }

    public DebitNoteBuilder addCustomNote(String id, String value) {
        if (id != null && value != null) {
            document
                    .getUBLExtensions()
                    .getUBLExtension()
                    .get(1)
                    .getExtensionContent()
                    .getBasicAdditionalInformation()
                    .getAdditionalProperty()
                    .add(new AdditionalProperty(id, null, value));
        }
        return this;
    }

    public DebitNoteBuilder addTax(String id, String name, String typeCode, String amount) {
        if (amount == null) {
            return this;
        }
        return addTax(id, name, typeCode, new BigDecimal(amount));
    }

    public DebitNoteBuilder addTax(String id, String name, String typeCode, BigDecimal amount) {
        TaxTotal tt = new TaxTotal();
        tt.setTaxAmount(new Amount(this.document.getDocumentCurrencyCode(), amount));

        TaxSubtotal tst = new TaxSubtotal();
        tst.setTaxAmount(new Amount(this.document.getDocumentCurrencyCode(), amount));
        TaxCategory tc = new TaxCategory();
        TaxScheme ts = new TaxScheme();
        ts.setID(id);
        ts.setName(name);
        ts.setTaxTypeCode(typeCode);
        tc.setTaxScheme(ts);
        tst.setTaxCategory(tc);
        tt.setTaxSubtotal(tst);
        this.document.getTaxTotal().add(tt);
        return this;
    }

    public DebitNoteBuilder addTotalAllowance(String amount) {
        if (amount != null) {
            addTotalAllowance(new BigDecimal(amount));
        }
        return this;
    }

    public DebitNoteBuilder addTotalAllowance(BigDecimal amount) {
        if (amount != null) {
            if (this.document.getRequestedMonetaryTotal() == null) {
                this.document.setRequestedMonetaryTotal(new LegalMonetaryTotal());
            }
            this.document.getRequestedMonetaryTotal().setAllowanceTotalAmount(
                    new Amount(
                            this.document.getDocumentCurrencyCode(),
                            amount
                    )
            );
        }
        return this;
    }

    public DebitNoteBuilder addTotalCharge(String amount) {
        if (amount != null) {
            addTotalCharge(new BigDecimal(amount));
        }
        return this;
    }

    public DebitNoteBuilder addTotalCharge(BigDecimal amount) {
        if (amount != null) {
            if (this.document.getRequestedMonetaryTotal() == null) {
                this.document.setRequestedMonetaryTotal(new LegalMonetaryTotal());
            }
            this.document.getRequestedMonetaryTotal().setChargeTotalAmount(
                    new Amount(
                            this.document.getDocumentCurrencyCode(),
                            amount
                    )
            );
        }
        return this;
    }

    public DebitNoteBuilder addTotalPayable(String amount) {
        if (amount != null) {
            addTotalPayable(new BigDecimal(amount));
        }
        return this;
    }

    public DebitNoteBuilder addTotalPayable(BigDecimal amount) {
        if (amount != null) {
            if (this.document.getRequestedMonetaryTotal() == null) {
                this.document.setRequestedMonetaryTotal(new LegalMonetaryTotal());
            }
            this.document.getRequestedMonetaryTotal().setPayableAmount(
                    new Amount(
                            this.document.getDocumentCurrencyCode(),
                            amount
                    )
            );
        }
        return this;
    }

    public DebitNoteBuilder setIssuerName(String name) {
        if (name == null) {
            return this;
        }
        document.getAccountingSupplierParty().getParty().setPartyName(new PartyName(name));
        return this;
    }

    /**
     * Establece la dirección del emisor.
     *
     * @param id ubigeo
     * @param address dirección postal
     * @param zone urbanización o zona
     * @param disctrict distrito
     * @param city provincia
     * @param state departamento
     * @param country código iso del país
     * @return
     */
    public DebitNoteBuilder setIssuerAddress(String id, String address, String zone, String disctrict, String city, String state, String country) {

        Address a = document.getAccountingSupplierParty().getParty().getPostalAddress();

        a.setID(id);
        a.setStreetName(address);
        a.setCitySubdivisionName(zone);
        a.setDistrict(disctrict);
        a.setCountrySubentity(city);
        a.setCityName(state);

        if (country != null) {
            a.setCountry(new Country());
            a.getCountry().setIdentificationCode(country);
        }

        return this;
    }

    public DebitNoteBuilder addPerception(String reference, String payable, String total, String percent) {
        if (payable != null) {
            AdditionalMonetaryTotal amt = new AdditionalMonetaryTotal(
                    "2001",
                    null,
                    reference == null ? null : new Amount(document.getDocumentCurrencyCode(), new BigDecimal(reference)),
                    new Amount(document.getDocumentCurrencyCode(), new BigDecimal(payable)),
                    percent,
                    total == null ? null : new Amount(document.getDocumentCurrencyCode(), new BigDecimal(total))
            );

            document
                    .getUBLExtensions()
                    .getUBLExtension()
                    .get(0)
                    .getExtensionContent()
                    .getSunatAdditionalInformation()
                    .getAdditionalMonetaryTotal()
                    .add(amt);
        }
        return this;
    }

    public DebitNoteBuilder addRetention(String payable, String percent) {
        if (payable != null) {
            AdditionalMonetaryTotal amt = new AdditionalMonetaryTotal(
                    "2003",
                    null,
                    null,
                    new Amount(document.getDocumentCurrencyCode(), new BigDecimal(payable)),
                    percent,
                    null
            );

            document
                    .getUBLExtensions()
                    .getUBLExtension()
                    .get(0)
                    .getExtensionContent()
                    .getSunatAdditionalInformation()
                    .getAdditionalMonetaryTotal()
                    .add(amt);
        }
        return this;
    }

    public DebitNoteBuilder addDetraction(String reference, String payable, String percent, String description) {
        if (payable != null) {
            AdditionalMonetaryTotal amt = new AdditionalMonetaryTotal(
                    "2003",
                    description,
                    reference == null ? null : new Amount(document.getDocumentCurrencyCode(), new BigDecimal(reference)),
                    new Amount(document.getDocumentCurrencyCode(), new BigDecimal(payable)),
                    percent,
                    null
            );

            document
                    .getUBLExtensions()
                    .getUBLExtension()
                    .get(0)
                    .getExtensionContent()
                    .getSunatAdditionalInformation()
                    .getAdditionalMonetaryTotal()
                    .add(amt);
        }
        return this;
    }

    public DebitNoteBuilder addDespatchReference(String type, String number) {
        if (type != null && number != null) {
            document.getDespatchDocumentReference().add(
                    new DocumentReference(type, number)
            );
        }
        return this;
    }

    public DebitNoteBuilder addAdditionalReference(String type, String number) {
        if (type != null && number != null) {
            document.getAdditionalDocumentReference().add(
                    new DocumentReference(type, number)
            );
        }
        return this;
    }

    public DebitNoteBuilder addDiscrepancyResponse(String ReferenceID, String ResponseCode, String Description) {
        //la descripción es olbigatoria siempre
        if (Description == null) {
            return this;
        }
        if ((ReferenceID != null && ResponseCode != null) || ("03".equals(ResponseCode))) {
            document
                    .getDiscrepancyResponse()
                    .add(
                            new DiscrepancyResponse(ReferenceID, ResponseCode, Description)
                    );
        }
        return this;
    }

    public DebitNoteBuilder addBillingReference(String ID, String DocumentTypeCode) {
        if (ID != null && DocumentTypeCode != null) {
            if (document.getBillingReference() == null) {
                document.setBillingReference(new BillingReference());
            }
            document
                    .getBillingReference()
                    .getInvoiceDocumentReference()
                    .add(
                            new InvoiceDocumentReference(ID, DocumentTypeCode)
                    );
        }
        return this;
    }

    public DebitNoteBuilder addLine(DebitNoteLine line) {
        document.getDebitNoteLine().add(line);
        return this;
    }

    /**
     *
     *
     * @return
     */
    @Override
    public DebitNote compile() {
        return document;
    }

    /**
     * Final operation used in order to get the XML representation of the UBL
     * document.
     *
     * @param charsetName
     * @return
     */
    public Document document(String charsetName) {
        try {
            Marshaller marshaller = getMarshaller(charsetName);
            DocumentBuilder db = getDocumentBuilder();
            Document document = db.newDocument();
            marshaller.marshal(this.compile(), document);
            return document;
        } catch (JAXBException ex) {
            throw new InvoiceBuilderException(ex);
        }
    }

    public JAXBContext getContext() {
        return JAXB_CONTEXT;
    }

    //TODO migrate to pooled implementation to enhance memmory usage
    public Marshaller getMarshaller(String charsetName) {
        try {
            Marshaller marshaller = getContext().createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, charsetName);
            marshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, new DebitNotePrefixMapper());
            return marshaller;
        } catch (JAXBException ex) {
            throw new InvoiceBuilderException(ex);
        }
    }

    public DocumentBuilderFactory getDocumentBuilderFactory() {
        return DOCUMENT_BUILDER_FACTORY;
    }

    //this works for xml... should be implemented as shared memmory
    //TODO migrate to pooled implementation to enhance memmory usage
    public DocumentBuilder getDocumentBuilder() {
        try {
            return getDocumentBuilderFactory().newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            throw new InvoiceBuilderException(ex);
        }
    }
}