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
public class Enemigo implements Entidad {
    private String tipo;
    private int poder;
    private List<String> acciones;

    public Enemigo(String tipo, int poder) {
        this.tipo = tipo;
        this.poder = poder;
        this.acciones = new ArrayList<>();
    }

    public void configurarAcciones(List<String> list) {
        this.acciones.addAll(list);
        
    }

    public void agregarSprites() {
        System.out.println("Sprites añadidos para el enemigo " + tipo);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando enemigo " + tipo);
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando enemigo " + tipo);
    }

}

