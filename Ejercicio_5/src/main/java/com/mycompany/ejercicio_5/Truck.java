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

    public Truck(String Type, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer weightofcargo ) {
        super(Type, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
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
        return super.ImportantBrands()+"Scania,Daf Trucks,Man,Mercedes Benz,Renault"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void whattheVehicleDoes() {
         Random rand = new Random(); //instance of random class
        System.out.println(Type +" en este momento  ");
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Tugs();
            case 1 : Moving();
            case 2 : DeliveryService();
            default : System.out.println("nada");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"con una carga de "+weightofcargo; 
    }
    
    
    
    
    
    
    
    
    
    
}