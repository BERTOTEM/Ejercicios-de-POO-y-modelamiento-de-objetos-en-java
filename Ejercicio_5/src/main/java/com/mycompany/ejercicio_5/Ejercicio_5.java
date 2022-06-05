/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author julian mazo
 */
public class Ejercicio_5 {


        /**
     * Creación de una lista de arreglos donde se van a guardar las naves creadas.
     */
    static ArrayList SpH = new ArrayList();
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Representa la eleccion de la nave
         */
        String choice="0";
        /**
         * Representa la eleccion de salida o creacion de otra nave
         */
        char R;
        /**
         * Nombre de la nave espacial
         */
        String Name;
        /**
         * Peso de la nave
         */
        String Weight;
        /**
         * combustible de la nave
         */
        String Fuel;
        /**
         * pais o organizacion de la nave
         */
        String CountryorOrganization;

        /**
         * carga util de la ShuttleVehicles
         */
        String  Payload;  
        /**
         * peso de la carga util de la nave ShuttleVehicles
         */
        String WeightCarried;
        /**
         * Numero de pasajeros de la nave  MannedSpaceship
         */
        String NumberOfPassengers;
        /**
         * funciones del satelite
         */

        String SatelliteFunctions;
        /**
         * planeta de destino de la sonda
         */
        String  DutysStation;
        /**
         * Spaceship sirve para guardar las entras por teclado
         */
        Scanner Spaceship = new Scanner(System.in);
        /**
         * ciclo do while para la creacion de naves y sus caracteristicas
         */
        do{
         /**
         * ciclo do while para escoger el tipo de nave que deseas caracterizar
         */    
        do {
          System.out.println("Bienvenido que vehiculo desea crear?\n");
          System.out.println("1. ShuttleVehicles");
          System.out.println("2. MannedSpaceship");
          System.out.println("3. UnMannedSpaceship(Satellite)");
          System.out.println("4. UnMannedSpaceship(Probe)");
          System.out.print("Ingrese el numero de la opcion de desea:");
          choice = Spaceship.nextLine();
          } while (!( (choice.contentEquals("1"))||(choice.contentEquals("2"))
                    ||(choice.contentEquals("3"))||(choice.contentEquals("4")))); 
        
        
        
        
        
        
        System.out.print("Ingrese el nombre de la nave:");
        /**
         *Guarda el contenido ingresado por teclado en nombre
         */
        Name = Spaceship.nextLine();
        System.out.print("cuanto pesa "+Name+" en Kg:");
        /**
         *Guarda el contenido ingresado por teclado en Peso
         */
        Weight = Spaceship.nextLine();
        System.out.print("Que tipo de combustible usa " +Name+" : ");
        /**
         *Guarda el contenido ingresado por teclado en combustible
         */
        Fuel = Spaceship.nextLine();
        System.out.print("Digite a que pais o organizacion pertenece " +Name+" :");
        /**
         *Guarda el contenido ingresado por teclado en pais o organizacion
         */
        CountryorOrganization = Spaceship.nextLine();
        /**
         * switch case para ingresar la informacion que no sea comun de las naves, informacion que depende del tipo de nave
         */
        switch (choice) {
            case "1" -> {
                System.out.print("Que carga util lleva "+Name+": ");
                /**
                *Guarda el contenido ingresado por teclado carga util
                */
                Payload = Spaceship.nextLine();
                System.out.print("cuanto pesa la carga en Kg "+Payload+": ");
                /**
                *Guarda el contenido ingresado por teclado del peso de la carga util
                */
                WeightCarried = Spaceship.nextLine();
                /**
                * Creación de un objeto de la clase ShuttleVehicles con siete parámetros.
                */
                ShuttleVehicles S= new ShuttleVehicles(Payload,WeightCarried,Name,Weight,Fuel,CountryorOrganization);
                /**
                *Se guarda la nave  S dentro de la lista de arreglos de naves espaciales.
                */
                SpH.add(S);
                }
                
            case "2" -> {
                System.out.print("cuantos pasajeros lleva "+Name+": ");
                /**
                *Guarda el contenido ingresado por teclado numero de pasajeros
                */
                NumberOfPassengers = Spaceship.nextLine();
                /**
                * Creación de un objeto de la clase MannedSpaceship con cinco parámetros.
                */
                MannedSpaceship M =new MannedSpaceship(NumberOfPassengers, Name, Weight, Fuel, CountryorOrganization);
                /**
                *Se guarda la nave M dentro de la lista de arreglos de naves espaciales.
                */
                SpH.add(M);
                }
                
            case "3" -> {
                System.out.print("Que funciones va a cumplir el satelite "+Name+": ");
                /**
                *Guarda el contenido ingresado por teclado funciones del satelite
                */
                SatelliteFunctions = Spaceship.nextLine();
                 /**
                * Creación de un objeto de la clase Satellite con cinco parámetros.
                */
                Satellite SE= new Satellite(SatelliteFunctions, Name,  Weight, Fuel, CountryorOrganization);
                /**
                *Se guarda la nave SE dentro de la lista de arreglos de naves espaciales.
                */
                SpH.add(SE);
                }
             case "4" -> {
                 System.out.print("Que destino tiene la sonda "+Name+": ");
                /**
                *Guarda el contenido ingresado por teclado planeta de destino
                */
                 DutysStation = Spaceship.nextLine();
                /**
                * Creación de un objeto de la clase Probe con cinco parámetros.
                */
                 Probe P = new Probe(DutysStation, Name, Weight, Fuel,CountryorOrganization);
                /**
                *Se guarda la nave P dentro de la lista de arreglos de naves espaciales.
                */
                 SpH.add(P);
                }
            default -> System.out.print("Nave no definida");
                
        }
        System.out.print("\nDesea crear otra nave(s/n): ");
            /**
            *Guarda la decision para seguir creando naves o no
            */
            R = Spaceship.nextLine().charAt(0);
                    
            

       
        
        }while (R =='s' || R =='S');
        
        
       
        System.out.print("\nEstas son tus naves creadas \n\n");
        /**
         * ciclo para mostrar toda la informacion dentro de la lista de arreglos donde estan las naves creadas
         */
        for (int j = 0; j < SpH.size()  ; j ++) {
            /**
             *se crea it objeto que se puede usar para recorrer colecciones y nuestra lista
             */       
            Iterator it = SpH.listIterator(j);
            /**
             *se crea nave T que tomara las cualidades y tipo de la nave que este en la pocios de la lista en ese momento  
             */
            Spaceship T = (Spaceship) it.next();
            /**
             * muestra las naves mas importantes de ese tipo
             */
            System.out.print(T.HisorialOfImportantShips());
            /**
             * muestra la razon o misison de cada tipo de nave
             */
            System.out.print("SpacecraftReason: "+T.SpacecraftReason());
            /**
             * obtiene y muestra la informacion de la nave y sus parametros de cracion
             */
            System.out.print(SpH.get(j));}
        
        
        }
     
        
}
    }
}
