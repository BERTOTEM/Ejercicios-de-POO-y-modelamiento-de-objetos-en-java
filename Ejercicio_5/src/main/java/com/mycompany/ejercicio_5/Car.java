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
public class Car extends Vehicle {
    private final String gearboxtype;

    public Car(String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,String gearboxtype) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.gearboxtype = gearboxtype;
    }
    
    
    
    public void Transportation(){
        System.out.println("Se utilizara para actividades de transporte");  
    }
    public void Races(){
        System.out.println("Se utilizara para actividades de carreras");  
    }

    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"\ncarro son BMW Group,Daimler,FCA,Ford,Geely";
    }

    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println("\nEn este momento "+id);
        int upperbound = 1;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Transportation();break;
            case 1 : Races();break;
            default : System.out.println("nada");break;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"con caja de cambios tipo "+gearboxtype; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
