/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotipsit;

/**
 *
 * @author informatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo b = new Semaforo(1);  /*instanzio i due semafori ai quali metterò 1 come varibaile perche possono entrare solo una persona alla volta */
        Semaforo c = new Semaforo(1);
        
        Bagni BagnoUomini= new Bagni(b); /*Instanzio due bagni differenti uno per maschi e uno per femmine */
        Bagni BagnoDonne= new Bagni(c);

        Thread thr1 = new Thread(new Persone("Maschio", BagnoUomini)); /*dichiaro i Thread e do loro il bagno appartenente*/
        Thread thr2 = new Thread(new Persone("Femmina", BagnoDonne));
        Thread thr3 = new Thread(new Persone("Maschio", BagnoUomini));
        Thread thr4 = new Thread(new Persone("Femmina", BagnoDonne));
        Thread thr5 = new Thread(new Persone("Maschio", BagnoUomini));
        Thread thr6 = new Thread(new Persone("Femmina", BagnoDonne));

        thr1.setName("Giorgio"); /*nomino i Thread*/
        thr2.setName("Alessia");
        thr3.setName("Samir");
        thr4.setName("Martina");
        thr5.setName("Angelo");
        thr6.setName("Sofia");

        thr1.start();/*starto i Thread*/
        thr2.start(); 
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
    }

}
