/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import Builders.JugadorBuilder;
import Builders.EnemigoBuilder;
import java.util.*;

/**
 *
 * @author CltControl
 */
public class EntidadFactory {

    public static Jugador crearJugador(String nombre) {
        return new JugadorBuilder(nombre)
                    .vida(100) 
                    .fuerza(10)
                    .acciones(Arrays.asList("correr", "saltar")) 
                    .build();
    }


    public static Enemigo crearEnemigo(String tipo) {
        return new EnemigoBuilder(tipo)
                    .poder(50) 
                    .acciones(Arrays.asList("patrullar", "atacar"))
                    .build();
    }

   
}

