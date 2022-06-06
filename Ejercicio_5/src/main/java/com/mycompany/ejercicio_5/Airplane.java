/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

import java.util.Random;

/**
 * Representa una avion con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Airplane extends Vehicle {
    /**
     * Representa el numero de turbinas
     */
    
    private Integer numberofturbines;
    /**
     * Representa la Superficies de sustentación
     */
    private String liftsurfaces;
    /**
    * Crea una instancia de la clase Airplane.
     * @param id numero de identificacion
     * @param numberofpassengers numeor de pasajeros
     * @param height alto
     * @param width peso
     * @param length longitud
     * @param numberDoors numero de puertas
     * @param mark marca
     * @param meansoftransport medio donde se usa
     * @param liftsurfaces 
     */

    public Airplane( String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer numberofturbines, String liftsurfaces) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.numberofturbines = numberofturbines;
        this.liftsurfaces = liftsurfaces;
    }
    
    
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void Cargo() {
         System.out.println("Se utilizara para actividades de carga y descarga de productos");
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void PassengerTransport() {
         System.out.println("Se utilizara para trasporte de pasajeros ");
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void InFlightRefueling() {
         System.out.println("Se utilizara para actividades de Reabastecimiento En Vuelo Militares");
    }
    
    /**
     * metodo que devuelve las marcas mas conocidas del  vehiculo
     * @return 
     */
    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"\navion son  Airbus, Boeing 73,Boeing 787 Dreamliner,A320 de Airbu"; 
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
            case 0 : Cargo();break;
            case 1 : PassengerTransport();break;
            case 2 : InFlightRefueling();break;
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
        return super.toString()+"con "+numberofturbines+"turbinas y sustentación"+liftsurfaces;
    }
    
}
