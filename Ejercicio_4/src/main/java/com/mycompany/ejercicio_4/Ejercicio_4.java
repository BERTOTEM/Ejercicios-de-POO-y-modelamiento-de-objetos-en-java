/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author julian mazo
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        /**
         * crea una ArryList para los datos de los vehiculos
         */
        ArrayList<Vehicle> Datos =new ArrayList();
        /**
         * contador para los 10 vehiculos
         */
        int i = 0;
        /**
         * atributos de vehiculo para la creacion de estos mismos
         */
        String type;
        Integer numberofpassengers;
        double height;
        double width;
        double length;
        Integer numberofwheels;
        Integer numberDoors;
        String mark;
        String meansoftransport;
        /**
         * Ciclo do while para generar 10 vehiculos
         */
        do{ 
             /**
            *Creacion un objeto de la clase Scanner para la entrada de datos
            */
            Scanner entry = new Scanner(System.in);
            System.out.println("Tipo de vehiculo" ); 
            type = entry.nextLine();
            System.out.println("cuantos pasajeroso caben"); 
            try {
                numberofpassengers = Integer.parseInt(entry.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Parametro digitado erroneo se guardara en su lugar 0 pasajeroso ");
                numberofpassengers = 0;
            }
            System.out.println("Altura del vehiculo en metros, por favor solo digite un dato numerico " ); 
            try {
                height = Double.parseDouble(entry.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("parametro digitado erroneo se guardara en su lugar 0 en altura ");
                height = 0;
            }
            System.out.println("Peso del vehiculo en Kg, por favor solo digite un dato numerico "); 
            try {
                width = Double.parseDouble(entry.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("parametro digitado erroneo se guardara en su lugar 0 en peso ");
                width = 0;
            }
            System.out.println("Longitud del vehiculo en metros, por favor solo digite un dato numerico  "); 
            try {
                length = Double.parseDouble(entry.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("parametro digitado erroneo se guardara en su lugar 0 en longitud ");
                length = 0;
            }
            System.out.println("Numero de ruedas, por favor solo digite un dato numerico "); 
            try {
                numberofwheels = Integer.parseInt(entry.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("parametro digitado erroneo se guardara en su lugar 0 en numero de ruedas ");
                numberofwheels = 0;
            }
            System.out.println("Cuantas puertas tiene, por favor solo digite un dato numerico "); 
            try {
                numberDoors = Integer.parseInt(entry.nextLine());
            }catch(NumberFormatException e){
                System.out.println("parametro digitado erroneo se guardara en su lugar 0 en numero de puertas ");
                numberDoors = 0;
            }
            System.out.println("Cual es la Marca del vehiculo"); 
            mark = entry.nextLine();
            System.out.println("Donde se puede usar"); 
            meansoftransport = entry.nextLine();
            Vehicle V= new Vehicle(type,numberofpassengers,height,width,length,numberofwheels,numberDoors,mark,meansoftransport);
            System.out.println("Vehiculo guardado");
            Datos.add(V);
            i++;
            System.out.println("Si desea salir digite *salir*, si no solo oprima enter");
            String option = entry.nextLine();
            /**
             * concion por si el usuario no quiere crear los 10 vehiculos si no un numero menor
             */
            if(option.equalsIgnoreCase("salir")){
                i=10;
            }
            
        }while(!(i==10));
        System.out.println("Los vehiculos guardados son:\n");
        /**
         * ciclo for para recorrer toda la ArrayList de los vehiculos creados
         */
        for(Vehicle vehicle: Datos){
            System.out.println(vehicle.toString());
        }
    }
}
