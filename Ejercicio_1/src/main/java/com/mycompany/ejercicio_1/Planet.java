/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

/**
 *
 * @author julian mazo
 */
public class Planet extends SystemObject {

    /**
     * Instancia del objeto planeta.
     * @param name Nombre del planeta.
     * @param mass Masa del planeta.
     * @param middleDistance Distancia media del planeta al objeto de referencia.
     * @param diameter Diámetro del planeta.
     * @param referenceObject Objeto donde realiza la órbita.
     */
    public Planet(String name, double mass, double middleDistance, 
            double diameter, SystemObject referenceObject) {
        super(name, mass, middleDistance,diameter, referenceObject);
    }
}