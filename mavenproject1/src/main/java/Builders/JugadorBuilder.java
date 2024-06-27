/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Enemigo;
import com.mycompany.mavenproject1.Entidad;
import com.mycompany.mavenproject1.Jugador;
import java.util.*;

/**
 *
 * @author CltControl
 */
// Builder para construir un jugador de manera flexible
public class JugadorBuilder implements EntidadBuilder {
    private Jugador j;
    private int vida;
    private int fuerza;

    public JugadorBuilder(Jugador j) {
        this.j = j;
    }

    public void construirPoder(int vida){
        this.vida = vida;
    }
    public void definirTipo(int tipo){
        this.fuerza = fuerza;
    }
    
    public Jugador getJugador(){
        return j;
    }

    @Override
    public void definirListado() {
    }

    @Override
    public void agregarSprites() {
    }

    @Override
    public void configurarCaracteristicas() {
    }

    @Override
    public Entidad build() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

