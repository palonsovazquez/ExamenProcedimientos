/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palonsovazquez;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class PAlonsoVazquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        boolean salir = false;
        Scanner sca = new Scanner(System.in);
        do {
            System.out.println("Examen de Pablo Alonso Vazquez. \n Elige un ejercicio a ejecutar:");
            System.out.println("1. Ejercicio 1.");
            System.out.println("2. Ejercicio 2.");
            System.out.println("3. Ejercicio 3.");
            System.out.println("0. Salir.");
            String texto = sca.next();
            int seleccion = 99;
            try {
                seleccion = Integer.parseInt(texto);
            } catch (Exception e) {
            }
            switch (seleccion) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 0:
                    salir = true;
            }

        } while (salir != true);
    }

    public static void Ejercicio1() throws InterruptedException {
        System.out.println("\n\n------------------------- Ejercicio 1 ---------------------------");
        // Instanciamos los objetos hilo
        ClaseHilosEj1 hilo1 = new ClaseHilosEj1("Hilo 1");
        ClaseHilosEj1 hilo2 = new ClaseHilosEj1("Hilo 2");
        ClaseHilosEj1 hilo3 = new ClaseHilosEj1("Hilo 3");

        // arrancamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

        //esperamos a que acaben los hilos para continuar
        hilo1.join();
        hilo2.join();
        hilo3.join();

        // escribimos el mensaje de que termino
        System.out.println("Terminado");
        System.out.println("\n\n------------------------- Ejercicio 1 ---------------------------");
    }

    public static void Ejercicio2() throws InterruptedException {
        System.out.println("\n\n------------------------- Ejercicio 2 ---------------------------");

// Instanciamos los objetos hilo
        ClaseHilosEj1 hilo1 = new ClaseHilosEj1("Hilo 1");
        ClaseHilosEj1 hilo2 = new ClaseHilosEj1("Hilo 2");
        ClaseHilosEj1 hilo3 = new ClaseHilosEj1("Hilo 3");

        // arrancamos el hilo y con join esperamos a que acabe antes de continuar.
        hilo3.start();
        hilo3.join();

        hilo2.start();
        hilo2.join();

        hilo1.start();
        hilo1.join();

        // escribimos el mensaje de que termino
        System.out.println("Terminado");

        System.out.println("\n\n-------------------------Fin Ejercicio 2 ---------------------------");

    }

    public static void Ejercicio3() throws InterruptedException {
        System.out.println("\n\n------------------------- Ejercicio 3 ---------------------------");

// Instanciamos los objetos hilo
        ClaseHilosEj3 hilo1 = new ClaseHilosEj3("Hilo");

        // arrancamos el hilo y con join esperamos a que acabe antes de continuar.
        hilo1.start();
        hilo1.join();

        // escribimos el mensaje de que termino
        System.out.println("Terminado");

        System.out.println("\n\n-------------------------Fin Ejercicio 3 ---------------------------");

    }
}
