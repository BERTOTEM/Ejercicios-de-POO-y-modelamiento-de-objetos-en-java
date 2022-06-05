/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4;

/**
 *
 * @author julian mazo
 */
public class Vehicle {
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
    /**
     * 
     *  
     
    public Vehicle( String mark) {
        this.numberofpassengers =0;
        this.height = 0;
        this.width = 0;
        this.length = 0;
        this.numberofwheels = 0;
        this.numberDoors = 0;
        this.mark = mark;
        this.meansoftransport = "nada";
        this.Type="nada";
    }*/

    
    

    public void setNumberofpassengers(Integer numberofpassengers) {
        this.numberofpassengers = numberofpassengers;
    }

    @Override
    public String toString() {
        return "Vehicle: " + Type + ", con " + numberofpassengers + " pasajeros de  altura=" + height + ", peso=" + width + " y longitud=" + length + "\n con " + numberofwheels + " ruedas y " + numberDoors + " puertas maca" + mark + " que se trasporta en el " + meansoftransport+"\n" ;
    }

   
    
    
    
    
}
