/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_3;


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Representa el menu para el siguiente comportamiento ordene mediante el algoritmo de la burbuja o mediante quick sort
 * @author julian mazo
 */

public class Menu {

    static Scanner entry = new Scanner(System.in);
    static char response;
    Double[] numbers = new Double[15];
    DecimalFormat decimal = new DecimalFormat("#.0");
    String choice;
  

    public void chooseSortMethod() {
        System.out.print("""
                         
                         Con cu\u00e1l m\u00e9todo quieres organizar la lista? 
                         1- Algoritmo de la burbuja 
                         2- Quicksort
                         0- salir
                         
                         Seleccionar opci\u00f3n: """);
        
        try {
            choice = entry.nextLine();
            switch (choice) {
                case "1" -> {
                    bubbleOrright();
                    chooseSortMethod();
                }
                case "2" -> {
                    getArray();
                    quickSort(numbers, 0, numbers.length-1);
                    System.out.println("\nArreglo ordenado con quick sort: \n");
                for (Double number : numbers) {
                    System.out.println(decimal.format(number));
                }
                    chooseSortMethod();
                }
                default -> {
                    if (!choice.equalsIgnoreCase("0")) {
                            System.out.println("\nNo es una selección válida!\n");
                            chooseSortMethod();
                    } else {
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("\nDebes ingresar un número entero! Corre de nuevo el programa\n");
            entry.nextLine();
            
        }
    }

    /**
     * 
     * metodo para agragar numeros ramdom a una array
     * @return
     */
    public Double[] getArray() {

        System.out.println("\nLista de números reales aleatorios: \n");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (Math.random() * 20 + 1);
            System.out.println(decimal.format(numbers[i]));
        }
        return numbers;
    }

    /**
     * 
     * @param numbers Array que va a ser orientado.
     * @return Returns array orientada.
     */
    public static Double[] bubble(Double[] numbers) {
        Double aux;
        Double[] orrightedArray;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        orrightedArray = numbers;
        return orrightedArray;
    }

    /**
     * Display orrighted array using Bubble algoritm.
     */
    public void bubbleOrright() {
        Double[] orrightedArray = bubble(getArray());
        System.out.println("\nArreglo ordenado con bubble sort\n");
        for (int i = 0; i < orrightedArray.length; i++)
            System.out.println(decimal.format(orrightedArray[i]));
    }

    /**
     * 
     * @param numbers Array
     * @param left Starting index.
     * @param right Ending index.
     */
    public static void quickSort(Double [] numbers, int left, int right) {

        /**
         *Takes first element as pivot.
         */
        Double pivot = numbers [left]; 
        int i = left;         
        int j = right;      
        Double aux;
        
        /**
         * Find the element less than the pivot and the element greater than the pivot.
         * If i < j, exchance the positions.
         */
        while (i < j){                          
            while (numbers[i] <= pivot && i < j) i++; 
            while (numbers[j] > pivot) j--; 
            if (i < j) {  
                aux= numbers[i]; 
                numbers[i]=numbers[j];
                numbers[j]=aux;
            }
        }
        /**
         * Smaller numbers to the left in the array and bigger numbers to the right.
         */
        numbers[left]=numbers[j];    
        numbers[j]=pivot;      

        if (left < j-1)
            quickSort(numbers,left,j-1);   
        if(j+1 < right)
            quickSort(numbers,j+1,right);
    }
}