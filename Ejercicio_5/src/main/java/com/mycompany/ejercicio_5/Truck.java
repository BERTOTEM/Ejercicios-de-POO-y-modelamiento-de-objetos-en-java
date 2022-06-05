/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

import java.util.Random;

/**
 *
 * @author julian mazo
 */
public class Truck extends Vehicle {
    private final Integer weightofcargo;

    public Truck(String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer weightofcargo ) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.weightofcargo = weightofcargo;
    }
    
    public void Tugs(){
        System.out.println("Se utilizara para actividades de Remolcar");  
    }
    public void Moving(){
        System.out.println("Se utilizara para actividades de mudanza");  
    }
    public void DeliveryService(){
        System.out.println("Se utilizara para actividades de servicios de entrgas");  
    }
    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"\ncamion son Scania,Daf Trucks,Man,Mercedes Benz,Renault"; 
    }

    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println( "\nEn este momento  "+id);
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 :{ Tugs();
                      break;}
            case 1 : {Moving();
                      break;}
            case 2 : {DeliveryService();
                      break;}
            default : System.out.println("nada");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"con una carga de "+weightofcargo; 
    }
    
    
    
    
    
    
    
    
    
    
}
