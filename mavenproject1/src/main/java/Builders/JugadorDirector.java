/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Jugador;

/**
 *
 * @author CltControl
 */
public class JugadorDirector {
    private JugadorBuilder builder;
        
    public JugadorDirector(JugadorBuilder builder){
        this.builder = builder;
    }
    
    public void construirJugador(){
        System.out.println("Construyendo jugador...");
    }
    
    public Jugador getJugador(){
        return builder.getJugador();
    }
}
