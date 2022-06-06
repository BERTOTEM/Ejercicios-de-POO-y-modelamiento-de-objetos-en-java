/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author julian mazo
 */
public class Ejercicio_1 {
    
    /**
    * Creación de un objeto de la clase SolarSystem con cuatro parámetros.
    */
    static SolarSystem SSL = new SolarSystem("Solar System");
    /**
    * Creación de un objeto de la clase Scanner para la entrada de parametros
    */
    static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * variable qeu guarda la opcion que escoje el usuario 
         */
        String opc;
        try {
            
            /**
             * ciclo do while para la repeticon del meno hasta el usuario decida salir
             */
            do {
                
                System.out.println("""
                               1- Calcular la atracci\u00f3n gravitatoria
                               0- Salir del programa""");
                System.out.println("\nSelect the option: ");
                opc = entry.nextLine();
               
                /**
                 * switch para es coger entre el calcula de la atraccion y salir del programa
                 */
                switch (opc) {
                    case "1":
                        SSL.displaySolarSystem();
                        System.out.println("\nIntroduce el nombre del primer planeta: ");
                        String str3 = entry.nextLine();
                        String str4 = "";
                        SystemObject obj3 = SSL.getObject(str3);
                        SystemObject obj4 = null;
                        if (obj3 == null) {
                            System.out.println("\nPlaneta inexistente.");
                        } else {
                            System.out.println("\nIntroduce el nombre del primer planeta:: ");
                            str4 = entry.nextLine();
                            obj4 = SSL.getObject(str4);
                            if (obj4 == null) {
                                System.out.println("\nPlaneta inexistente.");
                            } else {
                                double calculo = obj3.getAttraction(obj4);
                                System.out.println("\nLa atraciion gravitacional es: " + calculo + " Newton");
                            }
                        }
                        
                        break;
                    case "0":
                        System.out.println("\nsaliendo del programa!\n");
                        break;    

                    default:
                        System.out.println("\nNo es una selección válida!\n");
                      
                                        
                      
                }
            } while ((!opc.equalsIgnoreCase("0")));
            System.out.println("\nEl programa termino.");

        } catch (InputMismatchException e) {
            System.out.println("\nDebes ingresar un número entero! Corre de nuevo el programa\n");
            entry.nextLine();
        }
    }

}