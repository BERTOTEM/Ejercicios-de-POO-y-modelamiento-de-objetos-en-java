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

    static SolarSystem SSL = new SolarSystem("Solar System");
    static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {

        try {
            String opc;
            System.out.println("""
                               1- Calcular la atracci\u00f3n gravitatoria
                               0- Salir del programa""");
            
            do {
                System.out.println("\nSelect the option: ");
                opc = entry.nextLine();
               

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
                        mainMenu();
                        break;
                    case "0":
                        System.out.println("\nsaliendo del programa!\n");
                        break;    

                    default:
                        System.out.println("\nNo es una selección válida!\n");
                        mainMenu();
                                        
                      
                }
            } while ((!opc.equalsIgnoreCase("0")));
            System.out.println("\nEl programa termino.");

        } catch (InputMismatchException e) {
            System.out.println("\nDebes ingresar un número entero! Corre de nuevo el programa\n");
            entry.nextLine();
        }
    }
}