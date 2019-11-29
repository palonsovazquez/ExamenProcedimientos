/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palonsovazquez;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class ClaseHilosEj3 extends Thread{
private static short numMaxHilos = 3;
private static short numHilos = 0;
private short numerodeHilo;
ClaseHilosEj3 hilo;
    
    private short short_numIteraciones = 25;
    public ClaseHilosEj3(String name) {
        super(name);
    }

    @Override
    public void run() {
    // creacion de los hilos extra si no superan el numero maximo de hilos.
        numerodeHilo = nuevoHilo();
        if(numHilos < numMaxHilos){
            
        hilo = new ClaseHilosEj3("Hilo");
        hilo.start();
        
        
        }
        
        Random rand = new Random();
        for (int i = 0; i < short_numIteraciones; i++) {
            System.out.println(this.getName()+" nº "+numerodeHilo+" iteracion nº "+ i);
            // pausamos el hilo un numero aleatorio de  segundos entre 0 y 2
            this.yield();
            try {
                sleep(rand.nextInt(3)*1000 );
            } catch (InterruptedException ex) {
                Logger.getLogger(ClaseHilosEj3.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
        
    }
    public synchronized static short nuevoHilo(){
        
        numHilos++;
    
    return numHilos;
    
    
    
    
    
    }
    
    
    
}
