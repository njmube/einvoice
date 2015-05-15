/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.einvoice.core.tasks.sign;

import pe.labtech.einvoice.core.tasks.tools.ServiceCommons;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import pe.labtech.einvoice.core.entity.Document;
import pe.labtech.einvoice.core.model.DocumentLoaderLocal;
import pe.labtech.einvoice.core.model.PrivateDatabaseManagerLocal;
import static pe.labtech.einvoice.core.tasks.tools.ParseCommons.map;
import static pe.labtech.einvoice.core.tasks.tools.ServiceCommons.signOnlineOrSync;
import pe.labtech.einvoice.core.tasks.tools.Tools;
import pe.labtech.einvoice.core.ws.generated.EBizGenericInvoker;
import pe.labtech.einvoice.core.ws.messages.response.DocumentInfo;
import pe.labtech.einvoice.core.ws.model.SummaryItem;

/**
 *
 * @author Carlos
 */
@Stateless
@LocalBean
public class OnlineSummary {

    @EJB
    private DocumentLoaderLocal loader;

    @EJB
    private PrivateDatabaseManagerLocal db;

    @Inject
    private EBizGenericInvoker invoker;

    public DocumentInfo handle(Document document) {
        String request = buildSignSummaryCommand(document.getId());
        return signOnlineOrSync(db, loader, invoker, document, request);
    }

    private String buildSignSummaryCommand(Long id) {
        pe.labtech.einvoice.core.ws.model.Summary target = new pe.labtech.einvoice.core.ws.model.Summary();
        Document entity = loader.loadForWork(id, source -> {
            map(source, () -> target, () -> new SummaryItem(), (d, il) -> d.setItems(il));
        });
        return ServiceCommons.BUILDER.buildSignSummary(Tools.buildClientID(entity.getClientId()), entity.getDocumentType(), "", target);
    }
}