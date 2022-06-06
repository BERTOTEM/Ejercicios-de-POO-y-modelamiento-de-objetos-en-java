/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

import java.util.Random;

/**
 * Representa una bicicleta con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Bicycle extends Vehicle{
    /**
     * representa el rin de la bici
     */
    private final Integer rimsize;
    /**
      * Crea una instancia de la clase Bicycle.
     * @param id numero de identificacion
     * @param numberofpassengers numeor de pasajeros
     * @param height alto
     * @param width peso
     * @param length longitud
     * @param numberDoors numero de puertas
     * @param mark marca
     * @param meansoftransport medio donde se usa
     * @param rimsize 
     */
    public Bicycle(String id, Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport,Integer rimsize) {
        super(id, numberofpassengers, height, width, length, numberDoors, mark, meansoftransport);
        this.rimsize = rimsize;
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void ForMountain(){
        System.out.println("Se utilizara para actividades de montaña");  
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void ForExercise(){
        System.out.println("Se utilizara para actividades de ejercicio cardiovascular");
    }
    /**
     * metodo que se usa dentro de  whattheVehicleDoes para escoger un proposito o funcion del vehiculo
     */
    public void ForBmx(){
         System.out.println("Se utilizara para actividades de BMX");
    }
    /**
     * metodo que devuelve las marcas mas conocidas del  vehiculo
     * @return 
     */
    @Override
    public String ImportantBrands() {
        return super.ImportantBrands()+"\nbicicleta son Trek,Merida,Giant,Cube,Protek,Megamo";
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
            case 0 : ForMountain();break;
            case 1 : ForExercise();break;
            case 2 : ForBmx();break;
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
        return super.toString()+ " Con rin "+rimsize;
    }
    
    
}
    

