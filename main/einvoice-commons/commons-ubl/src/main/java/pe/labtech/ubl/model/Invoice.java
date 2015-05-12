/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.ubl.model;

import java.util.LinkedList;
import pe.labtech.ubl.model.aggregate.TaxTotal;
import pe.labtech.ubl.model.aggregate.Signature;
import pe.labtech.ubl.model.aggregate.DocumentReference;
import pe.labtech.ubl.model.extensions.UBLExtensions;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import pe.labtech.ubl.model.aggregate.AccountingParty;
import pe.labtech.ubl.model.aggregate.BillingReference;
import pe.labtech.ubl.model.aggregate.DiscrepancyResponse;
import pe.labtech.ubl.model.aggregate.InvoiceLine;
import pe.labtech.ubl.model.aggregate.LegalMonetaryTotal;

/**
 *
 * @author carloseg
 */
@XmlRootElement(name = "Invoice", namespace = Namespaces.DEFAULT)
@XmlAccessorType(XmlAccessType.FIELD)
public class Invoice {

    @XmlElement(namespace = Namespaces.EXT)
    private UBLExtensions UBLExtensions;

    //Siempre 2.0
    @XmlElement(namespace = Namespaces.CBC)
    private String UBLVersionID;

    //Siempre 1.0
    @XmlElement(namespace = Namespaces.CBC)
    private String CustomizationID;

    //mapea a serie numero
    @XmlElement(namespace = Namespaces.CBC)
    private String ID;

    //mapea a fecha de emision en GMT-5
    @XmlElement(namespace = Namespaces.CBC)
    private String IssueDate;

    //mapea a tipoDocumento
    @XmlElement(namespace = Namespaces.CBC)
    private String InvoiceTypeCode;

    //mapea a moneda documento
    @XmlElement(namespace = Namespaces.CBC)
    private String DocumentCurrencyCode;

    //campos adicionales para la nota de crédito
    @XmlElement(namespace = Namespaces.CAC)
    private List<DiscrepancyResponse> DiscrepancyResponse;

    @XmlElement(namespace = Namespaces.CAC)
    private BillingReference BillingReference;

    //holder para la firma
    @XmlElement(namespace = Namespaces.CAC)
    private Signature Signature;

    //guías de remisión
    @XmlElement(namespace = Namespaces.CAC)
    private List<DocumentReference> DespatchDocumentReference;

    //otros documentos asociados
    @XmlElement(namespace = Namespaces.CAC)
    private List<DocumentReference> AdditionalDocumentReference;
    //datos de la firma digital

    //datos el emisor
    @XmlElement(namespace = Namespaces.CAC)
    private AccountingParty AccountingSupplierParty;

    //datos del receptor
    @XmlElement(namespace = Namespaces.CAC)
    private AccountingParty AccountingCustomerParty;

    //impuestos
    @XmlElement(namespace = Namespaces.CAC)
    private List<TaxTotal> TaxTotal;

    @XmlElement(namespace = Namespaces.CAC)
    private LegalMonetaryTotal LegalMonetaryTotal;

    @XmlElement(namespace = Namespaces.CAC)
    private List<InvoiceLine> InvoiceLine;

    public Invoice() {
    }

    public UBLExtensions getUBLExtensions() {
        return UBLExtensions;
    }

    public void setUBLExtensions(UBLExtensions UBLExtensions) {
        this.UBLExtensions = UBLExtensions;
    }

    public String getUBLVersionID() {
        return UBLVersionID;
    }

    public void setUBLVersionID(String UBLVersionID) {
        this.UBLVersionID = UBLVersionID;
    }

    public String getCustomizationID() {
        return CustomizationID;
    }

    public void setCustomizationID(String CustomizationID) {
        this.CustomizationID = CustomizationID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public String getInvoiceTypeCode() {
        return InvoiceTypeCode;
    }

    public void setInvoiceTypeCode(String InvoiceTypeCode) {
        this.InvoiceTypeCode = InvoiceTypeCode;
    }

    public String getDocumentCurrencyCode() {
        return DocumentCurrencyCode;
    }

    public void setDocumentCurrencyCode(String DocumentCurrencyCode) {
        this.DocumentCurrencyCode = DocumentCurrencyCode;
    }

    public List<DiscrepancyResponse> getDiscrepancyResponse() {
        if (DiscrepancyResponse == null) {
            return new LinkedList<>();
        }
        return DiscrepancyResponse;
    }

    public void setDiscrepancyResponse(List<DiscrepancyResponse> DiscrepancyResponse) {
        this.DiscrepancyResponse = DiscrepancyResponse;
    }

    public BillingReference getBillingReference() {
        return BillingReference;
    }

    public void setBillingReference(BillingReference BillingReference) {
        this.BillingReference = BillingReference;
    }

    public Signature getSignature() {
        return Signature;
    }

    public void setSignature(Signature signature) {
        this.Signature = signature;
    }

    public List<DocumentReference> getDespatchDocumentReference() {
        if (DespatchDocumentReference == null) {
            DespatchDocumentReference = new LinkedList<>();
        }
        return DespatchDocumentReference;
    }

    public void setDespatchDocumentReference(List<DocumentReference> DespatchDocumentReference) {
        this.DespatchDocumentReference = DespatchDocumentReference;
    }

    public List<DocumentReference> getAdditionalDocumentReference() {
        if (AdditionalDocumentReference == null) {
            AdditionalDocumentReference = new LinkedList<>();
        }
        return AdditionalDocumentReference;
    }

    public void setAdditionalDocumentReference(List<DocumentReference> AdditionalDocumentReference) {
        this.AdditionalDocumentReference = AdditionalDocumentReference;
    }

    public AccountingParty getAccountingSupplierParty() {
        return AccountingSupplierParty;
    }

    public void setAccountingSupplierParty(AccountingParty AccountingSupplierParty) {
        this.AccountingSupplierParty = AccountingSupplierParty;
    }

    public AccountingParty getAccountingCustomerParty() {
        return AccountingCustomerParty;
    }

    public void setAccountingCustomerParty(AccountingParty AccountingCustomerParty) {
        this.AccountingCustomerParty = AccountingCustomerParty;
    }

    public List<TaxTotal> getTaxTotal() {
        if (TaxTotal == null) {
            TaxTotal = new LinkedList<>();
        }
        return TaxTotal;
    }

    public void setTaxTotal(List<TaxTotal> TaxTotal) {
        this.TaxTotal = TaxTotal;
    }

    public LegalMonetaryTotal getLegalMonetaryTotal() {
        return LegalMonetaryTotal;
    }

    public void setLegalMonetaryTotal(LegalMonetaryTotal LegalMonetaryTotal) {
        this.LegalMonetaryTotal = LegalMonetaryTotal;
    }

    public List<InvoiceLine> getInvoiceLine() {
        if (InvoiceLine == null) {
            InvoiceLine = new LinkedList<>();
        }
        return InvoiceLine;
    }

    public void setInvoiceLine(List<InvoiceLine> InvoiceLine) {
        this.InvoiceLine = InvoiceLine;
    }

}
