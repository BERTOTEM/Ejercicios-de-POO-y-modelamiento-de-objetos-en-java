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
public class Bicycle extends Vehicle{
    private final Integer rimsize;
    public Bicycle(String Type, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer rimsize) {
        super(Type, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.rimsize = rimsize;
    }
    public void ForMountain(){
        System.out.println("Se utilizara para actividades de montaña");  
    }
    public void ForExercise(){
        System.out.println("Se utilizara para actividades de ejercicio cardiovascular");
    }
    public void ForBmx(){
         System.out.println("Se utilizara para actividades de BMX");
    }

    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"Trek,Merida,Giant,Cube,Protek,Megamo";
    }

  

    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println(Type +" en este momento  ");
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : ForMountain();break;
            case 1 : ForExercise();break;
            case 2 : ForBmx();break;
            default : System.out.println("nada");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ " Con rin "+rimsize;
    }
    
    
}
    

