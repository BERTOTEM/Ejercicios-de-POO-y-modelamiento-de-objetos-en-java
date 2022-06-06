/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_6;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/** 
 * Creación clase Menu.
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Menu {

    /**
     * Creación de vector de números enteros.
     */
    Vector<Integer> vector = new Vector<Integer>();
    /**
     * iniciacion de variable previous
     */
    Integer previous = null;
    /**
     * Metodo que recibe un numero por teclado y lo compara con el anterio para saber si en consola se ingresaron seguido
     * si esto es verdad el me muestra el vector con TODOS los numeros ingresados.
     */
    public void enternumbers() {
        System.out.println("Este programa lee numeros del teclado hasta que se introduce\nDos veces SEGUIDAS el mismo número\n");
        try (Scanner entry = new Scanner(System.in)) {
            do{
                try{
                    System.out.println("\nintroduce un numero\n");
                    int number = entry.nextInt();
                    if (previous != null && previous == number){
                        vector.add(number);
                        break;
                    }
                    vector.add(number);
                    previous = number;
                }
                catch (InputMismatchException J){
                    System.out.println("¡Cuidado! Solo puedes agregar numeros. ");
                    previous = null;
                    entry.next();}
            }while (true);
      
        }		
        System.out.println("los numeros digitados son:" + vector);
    }
}

