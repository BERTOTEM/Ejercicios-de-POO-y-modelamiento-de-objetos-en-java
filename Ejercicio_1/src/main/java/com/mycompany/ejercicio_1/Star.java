/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

/**
 *
 * @author julian mazo
 */
public class Star extends SystemObject {
    
    /**
     * Instancia del objeto Estrella
     * @param name Nombre de la estrella.
     * @param mass Masa de la estrella.
     * @param diameter Diametro de la estrella.
     */
    public Star(String name, double mass, double diameter) {
        super(name, mass, diameter);
        this.setReferenceObject(this);
    }
}

