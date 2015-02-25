/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.einvoice.bizlinks.replicator.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Carlos
 */
public class CancelHeaderPK implements Serializable {

    @Size(min = 1, max = 1)
    @NotNull
    @Basic(optional = false)
    @Column(name = "tipoDocumentoEmisor", length = 1, nullable = false, updatable = false)
    private String tipoDocumentoEmisor;
    @Size(min = 1, max = 20)
    @NotNull
    @Basic(optional = false)
    @Column(name = "numeroDocumentoEmisor", length = 20, nullable = false, updatable = false)
    private String numeroDocumentoEmisor;
    @Size(min = 1, max = 17)
    @NotNull
    @Basic(optional = false)
    @Column(name = "resumenId", length = 17, nullable = false, updatable = false)
    private String resumenId;

    public CancelHeaderPK() {
    }

    public CancelHeaderPK(String tipoDocumentoEmisor, String numeroDocumentoEmisor, String resumenId) {
        this.tipoDocumentoEmisor = tipoDocumentoEmisor;
        this.numeroDocumentoEmisor = numeroDocumentoEmisor;
        this.resumenId = resumenId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.tipoDocumentoEmisor);
        hash = 19 * hash + Objects.hashCode(this.numeroDocumentoEmisor);
        hash = 19 * hash + Objects.hashCode(this.resumenId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CancelHeaderPK other = (CancelHeaderPK) obj;
        if (!Objects.equals(this.tipoDocumentoEmisor, other.tipoDocumentoEmisor)) {
            return false;
        }
        if (!Objects.equals(this.numeroDocumentoEmisor, other.numeroDocumentoEmisor)) {
            return false;
        }
        if (!Objects.equals(this.resumenId, other.resumenId)) {
            return false;
        }
        return true;
    }

    public String getTipoDocumentoEmisor() {
        return tipoDocumentoEmisor;
    }

    public void setTipoDocumentoEmisor(String tipoDocumentoEmisor) {
        this.tipoDocumentoEmisor = tipoDocumentoEmisor;
    }

    public String getNumeroDocumentoEmisor() {
        return numeroDocumentoEmisor;
    }

    public void setNumeroDocumentoEmisor(String numeroDocumentoEmisor) {
        this.numeroDocumentoEmisor = numeroDocumentoEmisor;
    }

    public String getResumenId() {
        return resumenId;
    }

    public void setResumenId(String resumenId) {
        this.resumenId = resumenId;
    }

}