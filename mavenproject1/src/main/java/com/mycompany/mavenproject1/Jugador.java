/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;

/**
 *
 * @author CltControl
 */
public class Jugador implements Entidad {
    private String nombre;
    private int vida;
    private int fuerza;
    private List<String> acciones;

    public Jugador(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
        this.acciones = new ArrayList<>();
        
    }

    public void configurarAcciones(List<String> list) {
        this.acciones.addAll(list);
        
    }

    public void agregarSprites() {
       
        System.out.println("Sprites añadidos para el jugador " + nombre);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando jugador " + nombre);
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando jugador " + nombre);
    }

}

