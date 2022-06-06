/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

/**
 *Representa un vehiculo  con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Vehicle implements ImportantBrands {
    /**
     * Representa el id del vehiculo
     */
    protected final  String id;
    /**
     * Representa el numero de pasajeros qeu caben en el vehiculo
     */
    protected Integer numberofpassengers;
    /**
     * Representa la altura del vehiculo
     */
    protected final double height;
    /**
     * Representa el peso del vehiculo
     */
    protected final double width;
    /**
     * Representa la longitud del vehiculo
     */
    protected final double length;
    /**
     * Representa el numero de puertas del vehiculo
     */
    protected final Integer numberDoors;
    /**
     * Represeta la marca del vehiculo
     */
    protected final String mark;
    /**
     * Representa el medio donde se puede utilizar el vehiculo
     */
    protected final String meansoftransport;
    /**
     * Crea una instancia de la clase Vehicle.
     * @param id numero de identificacion
     * @param numberofpassengers numeor de pasajeros
     * @param height alto
     * @param width peso
     * @param length longitud
     * @param numberDoors numero de puertas
     * @param mark marca
     * @param meansoftransport medio donde se usa
     */
    public Vehicle(String id,Integer numberofpassengers, double height, double width, double length, Integer numberDoors, String mark, String meansoftransport) {
        this.numberofpassengers = numberofpassengers;
        this.height = height;
        this.width = width;
        this.length = length;
        this.numberDoors = numberDoors;
        this.mark = mark;
        this.meansoftransport = meansoftransport;
        this.id=id;
    }
    /**
     * cambia el numero de pasajeros
     * @param numberofpassengers numero de pasajeros
     */
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
        return "Datos de"+id + ", numero de pasajeros: " + numberofpassengers + " altura: " + height + ", peso: " + width + " longitud=" + length + "\nnumeor de puertas: " + numberDoors + ", marca: " + mark + ", medio de trasporte: " + meansoftransport+".\n" ;
    }
    /**
     * metodo abstracto para escoger al azar una funcion a cumplir del vehiculko o proposito
     */
    public void whattheVehicleDoes(){
      }
    /**
     * metodo que devuelve las marcas mas conocidas de cada vehiculo
     * @return 
     */
    @Override
    public String ImportantBrands(){
        return "las Marcas mas reconocidas del vehiculo ";
    }
        
    
   }

   
    
    
    
    

