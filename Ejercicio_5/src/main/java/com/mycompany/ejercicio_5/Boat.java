/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

import java.util.Random;

/**
 * Representa un bote con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Boat extends Vehicle {
    /**
     * Representa el tipo de timon
     */
    private final String typeofrudder;
    /**
     * Representa el tipo de ancla
     */
    private final String typeofanchor;
    /**
     /**
     * Crea una instancia de la clase Boat.
     * @param id numero de identificacion
     * @param numberofpassengers numeor de pasajeros
     * @param height alto
     * @param width peso
     * @param length longitud
     * @param numberDoors numero de puertas
     * @param mark marca
     * @param meansoftransport medio donde se usa
     * @param typeofrudder tipo de timon
     * @param typeofanchor tipo de ancla
     */

    public Boat( String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,String typeofrudder, String typeofanchor) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.typeofrudder = typeofrudder;
        this.typeofanchor = typeofanchor;
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void Tower(){
        System.out.println("Se utilizara para actividades de Remolcar");  
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void SurveillanceBoat(){
        System.out.println("Se utilizara para actividades de defensa de nuestras aguas");  
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void Cruising(){
        System.out.println("Se utilizara para actividades de crucero");  
    }
    
     /**
     * metodo que devuelve las marcas mas conocidas del  vehiculo
     * @return 
     */
    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"\nbarco son Baja,Bayliner,Chaparral,Sea Ray"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * Metodo abstracto para escoger al azar una funcion a cumplir del vehiculo o proposito
     */
    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println("\nEn este momento  "+id);
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Tower();break;
            case 1 : SurveillanceBoat();break;
            case 2 : Cruising();break;
            default : System.out.println("nada");
        }
    }
    /**
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * se obtiene un aprado de informacion de la clase vehiculo
     * @return Datos de la clase vehiculo
     */
    @Override
    public String toString() {
        return super.toString()+"con tipo de ancla "+typeofanchor+" y timon tipo "+typeofrudder; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
