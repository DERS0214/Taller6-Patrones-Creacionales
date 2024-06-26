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
    private String nombre;
    private ArrayList<String> listaAcciones;
    
    public Enemigo(String nombre, ArrayList<String> listaAcciones){
        this.nombre = nombre;
        this.listaAcciones = listaAcciones;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando enemigo...");
    }
    @Override
    public void actualizar(){
        System.out.println("Actualizando enemigo...");
    }

}

