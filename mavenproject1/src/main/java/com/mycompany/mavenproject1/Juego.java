/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author CltControl
 */
public class Juego {

    public static void main(String[] args) {
        
        Jugador jugador = EntidadFactory.crearJugador("Player1");
        jugador.dibujar();
        jugador.actualizar();

        Enemigo enemigo = EntidadFactory.crearEnemigo("Boss");
        enemigo.dibujar();
        enemigo.actualizar();
    }
}

