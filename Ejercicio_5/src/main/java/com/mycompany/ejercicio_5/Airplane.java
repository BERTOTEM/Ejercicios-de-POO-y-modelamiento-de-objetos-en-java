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
public class Airplane extends Vehicle {
    
    private Integer numberofturbines;
    private String liftsurfaces;

    public Airplane( String Type, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer numberofturbines, String liftsurfaces) {
        super(Type, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.numberofturbines = numberofturbines;
        this.liftsurfaces = liftsurfaces;
    }
    
    
    
    public void Cargo() {
         System.out.println("Se utilizara para actividades de carga y descarga de productos");
    }
    public void PassengerTransport() {
         System.out.println("Se utilizara para trasporte de pasajeros ");
    }
    public void InFlightRefueling() {
         System.out.println("Se utilizara para actividades de Reabastecimiento En Vuelo Militares");
    }
    

    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"Airbus, Boeing 73,Boeing 787 Dreamliner,A320 de Airbu"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println(Type +" en este momento  ");
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Cargo();
            case 1 : PassengerTransport();
            case 2 : InFlightRefueling();
            default : System.out.println("nada");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"con "+numberofturbines+" y sustentación"+liftsurfaces;
    }
    
}
