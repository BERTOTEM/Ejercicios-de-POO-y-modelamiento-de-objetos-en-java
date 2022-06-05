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
        String Type;
        Integer numberofpassengers;
        double height;
        double width;
        double length;
        Integer numberDoors;
        String mark;
        String meansoftransport;
        
        
        Integer numberofturbines;
        String liftsurfaces;
        
        Integer rimsize;
        
        String typeofrudder;
        String typeofanchor;
        
        String gearboxtype;
        
        Integer cylindercapacity;
        
        Integer weightofcargo;
       
        Scanner Spaceship = new Scanner(System.in);
       
        do{
          
        do {
          System.out.println("Bienvenido que vehiculo desea crear?\n");
          System.out.println("1. Avion");
          System.out.println("2. Bicicleta");
          System.out.println("3. Bote");
          System.out.println("4. Carro");
          System.out.println("5. Moto");
          System.out.println("6. Camion");
          System.out.print("Ingrese el numero de la opcion de desea:");
          choice = Spaceship.nextLine();
          } while (!( (choice.contentEquals("1"))||(choice.contentEquals("2"))
                    ||(choice.contentEquals("3"))||(choice.contentEquals("4"))
                    ||(choice.contentEquals("5"))||(choice.contentEquals("6")))); 
        
        
        
        
        

        System.out.print("Ingrese el typo o nombre del vehiculo :");
        Type = Spaceship.nextLine();
        System.out.print("Cuantos pasajeros tiene la/el "+Type+" por favor solo datos numericos: ");
        try {numberofpassengers = Integer.parseInt(Spaceship.nextLine());
        }
        catch(NumberFormatException e){
                System.out.println("Parametro digitado erroneo se guardara en su lugar 0 pasajeroso ");
                numberofpassengers = 0;
        
        }
        System.out.println("Altura del vehiculo en metros, por favor solo digite un dato numerico " );
        try {
             height = Double.parseDouble(Spaceship.nextLine());
            }
            catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 en altura ");
                    height = 0;
            }
        System.out.println("Peso del vehiculo en Kg, por favor solo digite un dato numerico "); 
        try {
                width = Double.parseDouble(Spaceship.nextLine());
            }
            catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 en peso ");
                    width = 0;
            }
        System.out.println("Longitud del vehiculo en metros, por favor solo digite un dato numerico  "); 
        try {
                length = Double.parseDouble(Spaceship.nextLine());
            }
            catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 en longitud ");
                    length = 0;
            }
        System.out.println("Cuantas puertas tiene, por favor solo digite un dato numerico "); 
        try {
                numberDoors = Integer.parseInt(Spaceship.nextLine());
            }catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 en numero de puertas ");
                    numberDoors = 0;}
        System.out.print("marca de la/el " +Type+" :");
        mark = Spaceship.nextLine();
        System.out.print("medio por donde se trasporta la/el " +Type+" :");
        meansoftransport = Spaceship.nextLine();
        switch (choice) {
            case "1" -> {
                System.out.print("cuantas turbinas tien el "+Type+", por favor solo digite un dato numerico ");
                try {numberofturbines =  Integer.parseInt(Spaceship.nextLine());
                }catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 en numero de turbinas ");
                    numberofturbines = 0;}
                System.out.print("que tipo de Superficies de sustentación tiene el/la "+Type+": ");
                liftsurfaces = Spaceship.nextLine();
                Airplane A = new Airplane(Type,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,numberofturbines,liftsurfaces);
                SpH.add(A);
                }
                
            case "2" -> {
                System.out.print("Que rin tien la "+Type+": ");
                try{rimsize = Integer.parseInt(Spaceship.nextLine());
                }catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 tamaño del rin ");
                    rimsize = 0;}
                Bicycle B =new Bicycle(Type,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,rimsize);
                SpH.add(B);
                }
                
            case "3" -> {
                System.out.print("Que tipo de timon tiene "+Type+": ");
                typeofrudder = Spaceship.nextLine();
                System.out.print("Que tipo de ancla tien "+Type+": ");
                typeofanchor = Spaceship.nextLine();
                Boat B= new Boat(Type,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,typeofrudder,typeofanchor);
                SpH.add(B);
                }
             case "4" -> {
                 System.out.print("Que tipo de caja de cambios tiene "+Type+": ");
                 gearboxtype = Spaceship.nextLine();
                 Car C = new Car(Type,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,gearboxtype);
                 SpH.add(C);
                }
             case "5" -> {
                 System.out.print("Que dtipo de cilindraje tiene "+Type+": ");
                 try{cylindercapacity = Integer.parseInt(Spaceship.nextLine());
                 }catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 en cilindraje ");
                    cylindercapacity = 0;}
                 Motorcycle M = new Motorcycle(Type,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,cylindercapacity);
                 SpH.add(M);
                }
             case "6" -> {
                 System.out.print("Caunto pesa la carga que lleva el  "+Type+": ");
                 try{weightofcargo = Integer.parseInt(Spaceship.nextLine());
                 }catch(NumberFormatException e){
                    System.out.println("parametro digitado erroneo se guardara en su lugar 0 peso de la carga ");
                    weightofcargo = 0;}
                 Truck Tu = new Truck(Type,numberofpassengers,height,width,length,numberDoors,mark,meansoftransport,weightofcargo);
                 SpH.add(Tu);
                }
             
            default -> System.out.print("Vehiculo no definido");
                
        }
        System.out.print("\nDesea crear otra nave(s/n): ");
            R = Spaceship.nextLine().charAt(0);
                    

        }while (R =='s' || R =='S');
        System.out.print("\nEstos son tus Vehiculos creados \n\n");
        for (int j = 0; j < SpH.size()  ; j ++) {
            Iterator it = SpH.listIterator(j);
            Vehicle T = (Vehicle) it.next();
            System.out.print(T.ImportantBrands());
            T.whattheVehicleDoes();
            System.out.print(SpH.get(j));}
        }
    
}
    

