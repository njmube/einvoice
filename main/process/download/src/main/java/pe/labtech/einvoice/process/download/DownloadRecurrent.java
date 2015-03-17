/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.einvoice.process.download;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import pe.labtech.einvoice.commons.recurrent.AbstractRecurrentTask;
import pe.labtech.einvoice.core.entity.DocumentData;
import pe.labtech.einvoice.core.model.DocumentDataLoaderLocal;
import static pe.labtech.einvoice.core.model.DocumentDataLoaderLocal.*;

/**
 *
 * @author Carlos
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@TransactionManagement(TransactionManagementType.BEAN)
public class DownloadRecurrent extends AbstractRecurrentTask<DocumentData> {

    @EJB
    DocumentDataLoaderLocal loader;

    public DownloadRecurrent() {

    }

    @Override
    @PostConstruct
    public void init() {
        super.init();
        this.findTasks = () -> loader.find(DATA_MISSING);
        this.tryLock = t -> loader.changeStatus(t, DATA_MISSING, DATA_DOWNLOADING);
        this.getId = t -> t.getDocument().getClientId() + "-" + t.getDocument().getDocumentType() + "-" + t.getDocument().getDocumentNumber() + "[download:" + t.getName() + "]";
        this.consumer = t -> {
            try {
                URL url = new URL(t.getSource());
                byte[] data = loader.download(url);
                loader.addData(t, data);
                loader.changeStatus(t, DATA_DOWNLOADING, DATA_LOADED);
            } catch (IOException ex) {
                logger.log(Level.SEVERE, null, ex);
            }
        };
    }

    //TODO ajustar el tiempo de llamada luego de pruebas
    @Override
    @Schedule(hour = "*", minute = "*", second = "*/15", persistent = false)
    protected void timeout() {
        super.timeout();
    }

}
