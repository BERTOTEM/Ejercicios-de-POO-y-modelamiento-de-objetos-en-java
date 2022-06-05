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
        ArrayList<Vehicle> Datos =new ArrayList();
        int i = 0;
        Integer np;
        do{
            Scanner entry = new Scanner(System.in);
            System.out.println("Tipo de vehiculo" ); 
         
            String t = entry.nextLine();
           
            
            System.out.println("cuntos pasajeroso caben"); 
            try {np = Integer.parseInt(entry.nextLine());
            }catch(NumberFormatException e){
                System.out.println("parametro digitado errone se guardara en su lugar 0 pasajeroso ");
                np = 0;
            }
            System.out.println("altura del vehiculo?" ); 
            double h = Double.parseDouble(entry.nextLine());
            System.out.println("peso del vehiculo  "); 
            double w = Double.parseDouble(entry.nextLine());
            System.out.println("longitud del vehiculo "); 
            double l = Double.parseDouble(entry.nextLine());
            System.out.println("numero de ruedas "); 
            Integer nw = Integer.parseInt(entry.nextLine());
            System.out.println("cuantas puertas tiene? "); 
            Integer mt = Integer.parseInt(entry.nextLine());
            System.out.println("cual es la amrca"); 
            String m = entry.nextLine();
            System.out.println("Donde se puede usar"); 
            String nd = entry.nextLine();
            Vehicle V= new Vehicle(t,np,h,w,l,nw,mt,nd,m);
            System.out.println("Vehiculo guardado");
            Datos.add(V);
            i++;
            System.out.println("Si desea salir digite *salir* ");
        }while(!(i==10));
        for(Vehicle vehicle: Datos){
            System.out.println(vehicle.toString());
        }
    }
}
