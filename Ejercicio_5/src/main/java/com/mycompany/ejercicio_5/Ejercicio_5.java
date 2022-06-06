/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *Representa una clase Ejercicio_6 para mostras el siguiete comportamiento; programa c capaz de trabajar con los distintos tipos de vehículos.
 * @author julian mazo
 */
public class Ejercicio_5 {
    /**
     * creacion de una ArrayList para almacenar los vehiculos
     */
    static ArrayList SpH = new ArrayList();
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * choice representa la decision de que vehiculo crear
         */
        String choice="0";
        /***
         * Representa la opcion del usuario para seguir creando vehiculos
         */
        char R;
        /**
         * Atributos que comparten todos los hijos de la clase vehiculo
         */
        String id;
        Integer numberofpassengers;
        double height;
        double width;
        double length;
        Integer numberDoors;
        String mark;
        String meansoftransport;
        
        /**
         *Atributos de avion
         */
        Integer numberofturbines;
        String liftsurfaces;
        /**
         *Atributo de bici
         */
        Integer rimsize;
        /**
         *Atributos de barco
         */
        String typeofrudder;
        String typeofanchor;
        /**
         *Atributos de carro
         */
        String gearboxtype;
        /**
         *Atributo de moto
         */
        Integer cylindercapacity;
        /**
         * atributo de camion
         */
        
        Integer weightofcargo;
        /**
         *Creacion un objeto de la clase Scanner para la entrada de datos
         */
       
        Scanner Vle = new Scanner(System.in);
        /**
        * Ciclo do while para la continua creacion de vehiculos hasta que el usuario decida salir
        */
        do{
            /**
             * Ciclo do while para que el usuario elija un vehiculo valido 
             */
            do{
              System.out.println("Bienvenido que vehiculo desea crear?\n");
              System.out.println("1. Avion");
              System.out.println("2. Bicicleta");
              System.out.println("3. Bote");
              System.out.println("4. Carro");
              System.out.println("5. Moto");
              System.out.println("6. Camion");
              System.out.print("Ingrese el numero de la opcion de desea:");
              choice = Vle.nextLine();
              } while (!( (choice.contentEquals("1"))||(choice.contentEquals("2"))
                        ||(choice.contentEquals("3"))||(choice.contentEquals("4"))
                        ||(choice.contentEquals("5"))||(choice.contentEquals("6")))); 
            System.out.print("Ingrese el id o nombre del vehiculo :");
            id = Vle.nextLine();
            System.out.print("Cuantos pasajeros tiene "+id+" por favor solo datos numericos: ");
            try {numberofpassengers = Integer.parseInt(Vle.nextLine());
            }
            catch(NumberFormatException e){
                    System.out.println("Parametro digitado erroneo se guardara en su lugar 0 pasajeroso ");
                    numberofpassengers = 0;

            }
            System.out.println("Altura del vehiculo en metros, por favor solo digite un dato numerico " );
            try {
                    height = Double.parseDouble(Vle.nextLine());
                }
                catch(NumberFormatException e){
                        System.out.println("parametro digitado erroneo se guardara en su lugar 0 en altura ");
                        height = 0;
                }
            System.out.println("Peso del vehiculo en Kg, por favor solo digite un dato numerico "); 
            try {
                    width = Double.parseDouble(Vle.nextLine());
                }
                catch(NumberFormatException e){
                        System.out.println("parametro digitado erroneo se guardara en su lugar 0 en peso ");
                        width = 0;
                }
            System.out.println("Longitud del vehiculo en metros, por favor solo digite un dato numerico  "); 
            try {
                    length = Double.parseDouble(Vle.nextLine());
                }
                catch(NumberFormatException e){
                        System.out.println("parametro digitado erroneo se guardara en su lugar 0 en longitud ");
                        length = 0;
                }
            System.out.println("Cuantas puertas tiene, por favor solo digite un dato numerico "); 
            try {
                    numberDoors = Integer.parseInt(Vle.nextLine());
                }catch(NumberFormatException e){
                        System.out.println("parametro digitado erroneo se guardara en su lugar 0 en numero de puertas ");
                        numberDoors = 0;}
            System.out.print("marca de " +id+" :");
            mark = Vle.nextLine();
            System.out.print("Medio por donde se trasporta " +id+" :");
            meansoftransport = Vle.nextLine();
            /**
             *Switch case que contiene en Cada caso  un vehiculo del menu y su creacion como tal posteriormente  se agrega a la ArrayList SpH
             */
            switch (choice) {
                case "1" -> {
                    System.out.print("cuantas turbinas tien el "+id+", por favor solo digite un dato numerico ");
                    try {numberofturbines =  Integer.parseInt(Vle.nextLine());
                    }
                    catch(NumberFormatException e){
                        System.out.println("parametro digitado erroneo se guardara en su lugar 0 en numero de turbinas ");
                        numberofturbines = 0;}
                    System.out.print("que tipo de Superficies de sustentación tiene  "+id+": ");
                    liftsurfaces = Vle.nextLine();
                    Airplane A = new Airplane(id,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,numberofturbines,liftsurfaces);
                    SpH.add(A);
                    }

                case "2" -> {
                    System.out.print("Que rin tien la "+id+": ");
                    try{rimsize = Integer.parseInt(Vle.nextLine());
                    }catch(NumberFormatException e){
                        System.out.println("parametro digitado erroneo se guardara en su lugar 0 tamaño del rin ");
                        rimsize = 0;}
                    Bicycle B =new Bicycle(id,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,rimsize);
                    SpH.add(B);
                    }

                case "3" -> {
                    System.out.print("Que tipo de timon tiene "+id+": ");
                    typeofrudder = Vle.nextLine();
                    System.out.print("Que tipo de ancla tien "+id+": ");
                    typeofanchor = Vle.nextLine();
                    Boat B= new Boat(id,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,typeofrudder,typeofanchor);
                    SpH.add(B);
                    }
                case "4" -> {
                    System.out.print("Que tipo de caja de cambios tiene "+id+": ");
                    gearboxtype = Vle.nextLine();
                    Car C = new Car(id,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,gearboxtype);
                    SpH.add(C);
                    }
                case "5" -> {
                    System.out.print("Que tipo de cilindraje tiene "+id+": ");
                    try{cylindercapacity = Integer.parseInt(Vle.nextLine());
                    }catch(NumberFormatException e){
                       System.out.println("parametro digitado erroneo se guardara en su lugar 0 en cilindraje ");
                       cylindercapacity = 0;}
                    Motorcycle M = new Motorcycle(id,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,cylindercapacity);
                    SpH.add(M);
                    }
                case "6" -> {
                    System.out.print("Cuanto pesa la carga que lleva "+id+": ");
                    try{weightofcargo = Integer.parseInt(Vle.nextLine());
                    }catch(NumberFormatException e){
                       System.out.println("parametro digitado erroneo se guardara en su lugar 0 peso de la carga ");
                       weightofcargo = 0;}
                    Truck Tu = new Truck(id,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,weightofcargo);
                    SpH.add(Tu);
                    }

                default -> System.out.print("Vehiculo no definido");

            }
        System.out.print("\nDesea agregar otro vehiculo?(s/n): ");
        R = Vle.nextLine().charAt(0);
        }while (R =='s' || R =='S');
        System.out.print("\nEstos son tus Vehiculos creados \n\n");
        /**
         * Ciclo for para recorrer todo el contenido de la ArrayList creada y llamar algunos metodos abstractos y informacion del vehiculo
         */
        for (int j = 0; j < SpH.size()  ; j ++) {
            
            Iterator it = SpH.listIterator(j);
            
            
            Vehicle T = (Vehicle) it.next();
            System.out.print(T.ImportantBrands());
            T.whattheVehicleDoes();
            System.out.print("\n"+SpH.get(j)+"\n");}
            
        }
    
}
    

