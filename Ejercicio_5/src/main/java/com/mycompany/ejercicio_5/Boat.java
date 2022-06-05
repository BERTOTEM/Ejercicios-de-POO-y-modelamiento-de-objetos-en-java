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
public class Boat extends Vehicle {
    private final String typeofrudder;
    private final String typeofanchor;

    public Boat( String Type, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,String typeofrudder, String typeofanchor) {
        super(Type, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.typeofrudder = typeofrudder;
        this.typeofanchor = typeofanchor;
    }
    public void Tower(){
        System.out.println("Se utilizara para actividades de Remolcar");  
    }
    public void SurveillanceBoat(){
        System.out.println("Se utilizara para actividades de defensa de nuestras aguas");  
    }
    public void Cruising(){
        System.out.println("Se utilizara para actividades de crucero");  
    }
    

    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"Baja,Bayliner,Chaparral,Sea Ray"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println(Type +" en este momento  ");
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Tower();break;
            case 1 : SurveillanceBoat();break;
            case 2 : Cruising();break;
            default : System.out.println("nada");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"con tipo de ancla "+typeofanchor+"y timon tipo"+typeofrudder; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
