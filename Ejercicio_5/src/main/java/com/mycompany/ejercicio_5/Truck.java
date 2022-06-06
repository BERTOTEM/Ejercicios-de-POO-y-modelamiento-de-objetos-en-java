/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

import java.util.Random;

/**
 * Representa un camion con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Truck extends Vehicle {
    /**
     * representa el peso de la carga del camion
     */
    private final Integer weightofcargo;
    /**
     * Crea una instancia de la clase Truck.
     * @param id numero de identificacion
     * @param numberofpassengers numeor de pasajeros
     * @param height alto
     * @param width peso
     * @param length longitud
     * @param numberDoors numero de puertas
     * @param mark marca
     * @param meansoftransport medio donde se usa
     * @param weightofcargo carga del camion
     */
    public Truck(String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer weightofcargo ) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.weightofcargo = weightofcargo;
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void Tugs(){
        System.out.println("Se utilizara para actividades de Remolcar");  
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void Moving(){
        System.out.println("Se utilizara para actividades de mudanza");  
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void DeliveryService(){
        System.out.println("Se utilizara para actividades de servicios de entrgas");  
    }
    /**
     * metodo que devuelve las marcas mas conocidas del  vehiculo
     * @return 
     */
    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"\ncamion son Scania,Daf Trucks,Man,Mercedes Benz,Renault"; 
    }
    /**
     * Metodo abstracto para escoger al azar una funcion a cumplir del vehiculo o proposito
     */
    @Override
    public void whattheVehicleDoes() {
        Random rand = new Random(); //instance of random class
        System.out.println( "\nEn este momento  "+id);
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 :{ Tugs();
                      break;}
            case 1 : {Moving();
                      break;}
            case 2 : {DeliveryService();
                      break;}
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
        return super.toString()+"con una carga de "+weightofcargo; 
    }
    
    
    
    
    
    
    
    
    
    
}
