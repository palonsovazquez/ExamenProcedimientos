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
public class ClaseHilosEj1 extends Thread{

    
    private short short_numIteraciones = 25;
    public ClaseHilosEj1(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < short_numIteraciones; i++) {
            System.out.println(this.getName()+" iteracion nº "+ i);
            // pausamos el hilo un numero aleatorio de  segundos entre 0 y 2
            try {
                sleep(rand.nextInt(3)*1000 );
            } catch (InterruptedException ex) {
                Logger.getLogger(ClaseHilosEj1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
        
    }
    
    
    
    
}
