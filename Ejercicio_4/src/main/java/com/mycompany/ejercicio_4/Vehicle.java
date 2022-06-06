/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4;

/**
 * Representa un vehiculo  con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Vehicle {
    /**
     * Representa el tipo de vehiculo
     */
    private final  String Type;
    /**
     * Representa el numeor de pasajeros
     */
    private Integer numberofpassengers;
    /**
     * Representa la altura
     */
    private final double height;
    /**
     * Repreenta el peso
     */
    private final double width;
    /**
     * Representa la longitud
     */
    private final double length;
    /**
     * Representa el numeor de ruedas
     */
    private final Integer numberofwheels;
    /**
     * Representa el numeor de puertas
     */
    private final Integer numberDoors;
    /**
     * Representa la marca
     */
    private final String mark;
    /**
     * repreenta donde se puede usar el vehiculo
     */
    private final String meansoftransport;
    /**
     * Crea una instancia de la clase Vehicle
     * @param Type tipo de vehiculo
     * @param numberofpassengers numeor de pasajeros
     * @param height altura
     * @param width peso
     * @param length longirud
     * @param numberofwheels nuemor de ruedas
     * @param numberDoors numeor de puertas
     * @param mark marca
     * @param meansoftransport donde se moviliza
     */
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
    /**
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * se obtiene un aprado de informacion de la clase vehiculo
     * @return Datos de la clase vehiculo
     */
    @Override
    public String toString() {
        return "Vehicle: " + Type + ", con " + numberofpassengers + " pasajeros de  altura=" + height + ", peso=" + width + " y longitud=" + length + "\ncon " + numberofwheels + " ruedas y " + numberDoors + " puertas, marca " + mark + " que se trasporta en el " + meansoftransport+".\n" ;
    }

   
    
    
    
    
}
