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
public class Vehicle implements ImportantBrands {
    private final  String Type;
    private Integer numberofpassengers;
    private final double height;
    private final double width;
    private final double length;
    private final Integer numberofwheels;
    private final Integer numberDoors;
    private final String mark;
    private final String meansoftransport;

    public Vehicle(String Type,Integer numberofpassengers, double height, double width, double length, Integer numberofwheels, Integer numberDoors, String mark, String meansoftransport) {
        this.numberofpassengers = numberofpassengers;
        this.height = height;
        this.width = width;
        this.length = length;
        this.numberofwheels = numberofwheels;
        this.numberDoors = numberDoors;
        this.mark = mark;
        this.meansoftransport = meansoftransport;
        this.Type=Type;
    }
    public void setNumberofpassengers(Integer numberofpassengers) {
        this.numberofpassengers = numberofpassengers;
    }

    @Override
    public String toString() {
        return "Vehicle: " + Type + ", con " + numberofpassengers + " pasajeros de  altura=" + height + ", peso=" + width + " y longitud=" + length + "\ncon " + numberofwheels + " ruedas y " + numberDoors + " puertas, marca " + mark + " que se trasporta en el " + meansoftransport+".\n" ;
    }
    
    public String whattheVehicleDoes(){
        return "Nada";
      }

    @Override
    public String ImportantBrands() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   }

   
    
    
    
    

