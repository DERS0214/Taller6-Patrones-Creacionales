/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Objeto implements Entidad {
    private String nombre;
    private ArrayList<String> listaAcciones;
    
    public Objeto(String nombre, ArrayList<String> listaAcciones){
        this.nombre = nombre;
        this.listaAcciones = listaAcciones;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando objeto...");
    }
    @Override
    public void actualizar(){
        System.out.println("Actualizando objeto...");
    }
}
