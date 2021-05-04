package compitotipsit;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 

/**
 *
 * @author Giorgio Del Rocca
 */
public class Persone extends Thread {
    public String sesso;
    private Bagni bagno;
    
    public Persone(String sesso, Bagni bagno) {
        this.sesso=sesso;      /*dichiaro il sesso della persona e gli passo il bagno appartenente*/
        this.bagno = bagno;   
    }
    
    @Override
    public void run() {
        try {
            bagno.run();      /*richiammo il metodo run situato in Bagni*/
        } catch (InterruptedException ex) {
            Logger.getLogger(Persone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}