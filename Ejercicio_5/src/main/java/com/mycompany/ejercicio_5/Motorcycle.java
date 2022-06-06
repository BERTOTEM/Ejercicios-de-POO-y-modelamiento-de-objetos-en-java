/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

import java.util.Random;

/**
 * Representa una motocicleta con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Motorcycle extends Vehicle {
    /**
     * Representa el cilindraje de la moto
     */
    private final Integer cylindercapacity;
     /**
     * Crea una instancia de la clase Motorcycle.
     * @param id numero de identificacion
     * @param numberofpassengers numeor de pasajeros
     * @param height alto
     * @param width peso
     * @param length longitud
     * @param numberDoors numero de puertas
     * @param mark marca
     * @param meansoftransport medio donde se usa
     * @param cylindercapacity  cilindraje de la moto
     */
    public Motorcycle(String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer cylindercapacity) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.cylindercapacity = cylindercapacity;
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void Transportation(){
        System.out.println("Se utilizara para actividades de transporte");  
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void Races(){
        System.out.println("Se utilizara para actividades de carreras");  
    }
    /**
     * metodo que devuelve las marcas mas conocidas del  vehiculo
     * @return 
     */
    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"\nmoto son AKT,Apollo Motors,Ayco,Bajaj,Benelli,BMW."; 
    }
    /**
     * Metodo abstracto para escoger al azar una funcion a cumplir del vehiculo o proposito
     */
    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println("\nEn este momento  "+id);
        int upperbound = 1;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Transportation();break;
            case 1 : Races();break;
            default : System.out.println("nada");}
    }
   /**
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * se obtiene un aprado de informacion de la clase vehiculo
     * @return Datos de la clase vehiculo
     */
    @Override
    public String toString() {
        return super.toString()+"con cilindraje "+cylindercapacity; 
    }
    
    
    
}
