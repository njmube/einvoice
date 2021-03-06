/*
* Producto elaborado para Alignet S.A.C.
*
*/

package pe.labtech.ubl.model.aggregate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import pe.labtech.ubl.model.Namespaces;

/**
* Clase AccountingParty.
*
* @author Labtech S.R.L. (info@labtech.pe)
*/

@XmlAccessorType(XmlAccessType.FIELD)
public class AccountingParty {

    @XmlElement(namespace = Namespaces.CBC)
    private String CustomerAssignedAccountID;

    @XmlElement(namespace = Namespaces.CBC)
    private String AdditionalAccountID;

    @XmlElement(namespace = Namespaces.CAC)
    Party Party;

    public AccountingParty() {
    }

    public AccountingParty(String AdditionalAccountID, String CustomerAssignedAccountID, String RegistrationName) {
        this(AdditionalAccountID, CustomerAssignedAccountID, new Party(null, new PartyLegalEntity(RegistrationName)));
    }

    public AccountingParty(String AdditionalAccountID, String CustomerAssignedAccountID, Party Party) {
        this.CustomerAssignedAccountID = CustomerAssignedAccountID;
        this.AdditionalAccountID = AdditionalAccountID;
        this.Party = Party;
    }

    public String getCustomerAssignedAccountID() {
        return CustomerAssignedAccountID;
    }

    public void setCustomerAssignedAccountID(String CustomerAssignedAccountID) {
        this.CustomerAssignedAccountID = CustomerAssignedAccountID;
    }

    public String getAdditionalAccountID() {
        return AdditionalAccountID;
    }

    public void setAdditionalAccountID(String AdditionalAccountID) {
        this.AdditionalAccountID = AdditionalAccountID;
    }

    public Party getParty() {
        return Party;
    }

    public void setParty(Party Party) {
        this.Party = Party;
    }

}
