/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Jugador;
import java.util.*;

/**
 *
 * @author CltControl
 */
// Builder para construir un jugador de manera flexible
public class JugadorBuilder {
    private String nombre;
    private int vida;
    private int fuerza;
    private List<String> acciones;

    public JugadorBuilder(String nombre) {
        this.nombre = nombre;
        this.acciones = new ArrayList<>();
    }

    public JugadorBuilder vida(int vida) {
        this.vida = vida;
        return this;
    }

    public JugadorBuilder fuerza(int fuerza) {
        this.fuerza = fuerza;
        return this;
    }

    public JugadorBuilder acciones(List<String> acciones) {
        this.acciones.addAll(acciones);
        return this;
    }

    public Jugador build() {
        Jugador jugador = new Jugador(nombre, vida, fuerza);
        jugador.configurarAcciones(this.acciones); // Configurar acciones definidas en el builder
        jugador.agregarSprites(); // Agregar sprites/animaciones (pueden ser configuradas en el constructor si necesario)
        return jugador;
    }
}

