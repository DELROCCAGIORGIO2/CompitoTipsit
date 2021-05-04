package compitotipsit;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author informatica
 */
public class Semaforo {

    int g; /*inizializzo una variabile che usero per indicargli quanti Thread possono entrare contemporaneamente*/

    public Semaforo(int g) {
        this.g = g;
    }

    synchronized public void p() {
        while (g == 0) {    /*Quando g sarà 0 fara aspettare il Thread*/
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        g--;/*ogni volta che un Thread entrerà e g non sara 0 g verra decrementato fino ad arrivare a 0*/
    }
    synchronized public void v(){
    g++;     /*Quando richiameremo questo metodo vorrà dire che il Thread ha finito di utilizzare la risorsa e percio incrementeremo g per liberare la risorsa e useremoo notify per svegliare i Thread*/
    notify();
    }
}
