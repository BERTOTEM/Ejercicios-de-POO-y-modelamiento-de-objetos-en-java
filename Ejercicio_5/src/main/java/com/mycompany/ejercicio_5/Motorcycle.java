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
public class Motorcycle extends Vehicle {
    private final Integer cylindercapacity;

    public Motorcycle(String Type, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer cylindercapacity) {
        super(Type, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.cylindercapacity = cylindercapacity;
    }
    
    public void Transportation(){
        System.out.println("Se utilizara para actividades de transporte");  
    }
    public void Races(){
        System.out.println("Se utilizara para actividades de carreras");  
    }
    
    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"AKT,Apollo Motors,Ayco,Bajaj,Benelli,BMW."; 
    }

    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println(Type +" en este momento  ");
        int upperbound = 1;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Transportation();break;
            case 1 : Races();break;
            default : System.out.println("nada");}
    }

    @Override
    public String toString() {
        return super.toString()+"con cilindraje"+cylindercapacity; 
    }
    
    
    
}
