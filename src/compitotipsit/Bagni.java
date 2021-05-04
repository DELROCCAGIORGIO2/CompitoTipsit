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
public class Bagni {

    Semaforo bagno;

    public Bagni(Semaforo bagno) {
        this.bagno = bagno;
        /*Gli passo un semaforo per dirgli quante persone far entrare */
    }

    public void run() throws InterruptedException {
        bagno.p();/*decrementa la variabile g in Semaforo (che in questo caso è uno e perciò metterà in attesa gli altri Thread)*/
        System.out.println(Thread.currentThread().getName() + " è entrato in bagno");
        Thread.sleep((long) (Math.random() * 8000));/*Tempo di attesa*/
        System.out.println(Thread.currentThread().getName() + " è uscito dal bagno");
        bagno.v();
        /*aumenta la variabile g in Semaforo*/
    }
}
