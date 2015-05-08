/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.einvoice.replication.invoice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import pe.labtech.einvoice.commons.model.ModelTools;
import pe.labtech.einvoice.commons.model.RecurrentHelper;
import pe.labtech.einvoice.commons.recurrent.AbstractRecurrentTask;
import pe.labtech.einvoice.core.entity.Document;
import pe.labtech.einvoice.core.entity.DocumentResponse;
import pe.labtech.einvoice.core.model.PrivateDatabaseManagerLocal;
import pe.labtech.einvoice.replicator.entity.DocumentHeaderPK;
import pe.labtech.einvoice.replicator.model.PublicDatabaseManagerLocal;

/**
 *
 * @author Carlos
 */
@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class PushInvoiceRecurrent extends AbstractRecurrentTask<Long> {

    @EJB
    private PublicDatabaseManagerLocal pub;

    @EJB
    private PrivateDatabaseManagerLocal prv;

    /**
     * Bloquear una respuesta de documento para ser replicada
     */
    private Function<DocumentResponse, Boolean> tryLockSingle;

    /**
     * Retorna los document response pendientes de repplicar en un documento.
     */
    private Function<Long, List<DocumentResponse>> findTasksSingle;

    @Override
    @Schedule(hour = "*", minute = "*", second = "*/1", persistent = false)
    public void timeout() {
        super.timeout();
    }

    @Override
    @PostConstruct
    public void init() {
        super.init();
        this.findTasks = () -> RecurrentHelper.lookupAllResponses(prv, "F", "B");
        this.findTasksSingle = t -> RecurrentHelper.lookupResponse(prv, DocumentResponse.class, t);
        this.tryLock = t -> true;
        this.tryLockSingle = t -> RecurrentHelper.lockResponse(prv, t.getDocument().getId(), t.getName());
        this.getId = t -> RecurrentHelper.buildId(t, "replicate");
        this.consumer = t -> {
            DocumentHeaderPK id = createId(prv.seek(e -> e.find(Document.class, t)));
            Map<String, String> responses = this.findTasksSingle.apply(t).stream()
                    .filter(r -> this.tryLockSingle.apply(r))
                    .filter(r -> ModelTools.mapResponseName(r.getName()) != null)
                    .collect(Collectors.toMap(r -> ModelTools.mapResponseName(r.getName()), r -> r.getValue()));
            if (responses.isEmpty()) {
                return;
            }
            RecurrentHelper.sendResponses(pub, id, responses);
        };
    }

    private DocumentHeaderPK createId(Document t) {
        DocumentHeaderPK id = new DocumentHeaderPK(
                t.getClientId().split("-")[0],
                t.getClientId().split("-")[1],
                t.getDocumentType(),
                t.getDocumentNumber()
        );
        return id;
    }

}
