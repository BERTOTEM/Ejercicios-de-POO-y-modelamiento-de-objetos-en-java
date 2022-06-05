/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

/**
 *
 * @author julian mazo
 */
public class Vehicle implements ImportantBrands {
    protected final  String Type;
    protected Integer numberofpassengers;
    protected final double height;
    protected final double width;
    protected final double length;
    protected final Integer numberDoors;
    protected final String mark;
    protected final String meansoftransport;

    public Vehicle(String Type,Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport) {
        this.numberofpassengers = numberofpassengers;
        this.height = height;
        this.width = width;
        this.length = length;
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
        return "Vehicle: " + Type + ", con " + numberofpassengers + " pasajeros de  altura=" + height + ", peso=" + width + " y longitud=" + length + "\ncon " + numberDoors + " puertas, marca " + mark + " que se trasporta en el " + meansoftransport+".\n" ;
    }
    
    public void whattheVehicleDoes(){
      }

    @Override
    public String ImportantBrands(){
        return "las Marcas mas reconocidas en el mundo de este vehiculo son";
    }
        
    
   }

   
    
    
    
    

