/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.time.LocalDateTime;

/**
 *
 * @author Paloma Lobo
 */
public class Cliente {
    private String nombre;
    private LocalDateTime fecha;

    public Cliente(String nombre, LocalDateTime fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
       return "Cliente: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFecha() {
        return fecha.now();
    }
    
}
