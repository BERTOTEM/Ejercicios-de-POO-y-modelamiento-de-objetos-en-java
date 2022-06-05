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

    public Airplane( String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer numberofturbines, String liftsurfaces) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
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
        return super.ImportantBrands()+"\navion son  Airbus, Boeing 73,Boeing 787 Dreamliner,A320 de Airbu"; 
    }

    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println("\nEn este momento  "+id);
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Cargo();break;
            case 1 : PassengerTransport();break;
            case 2 : InFlightRefueling();break;
            default : System.out.println("nada");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"con "+numberofturbines+"turbinas y sustentación"+liftsurfaces;
    }
    
}
