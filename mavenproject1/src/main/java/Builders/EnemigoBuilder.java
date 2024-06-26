/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Enemigo;
import java.util.*;

/**
 *
 * @author CltControl
 */
// Builder para construir un enemigo de manera flexible
public class EnemigoBuilder {
    private String tipo;
    private int poder;
    private List<String> acciones;

    public EnemigoBuilder(String tipo) {
        this.tipo = tipo;
        this.acciones = new ArrayList<>();
    }

    public EnemigoBuilder poder(int poder) {
        this.poder = poder;
        return this;
    }

    public EnemigoBuilder acciones(List<String> acciones) {
        this.acciones.addAll(acciones);
        return this;
    }

    public Enemigo build() {
        Enemigo enemigo = new Enemigo(tipo, poder);
        enemigo.configurarAcciones(this.acciones); 
        enemigo.agregarSprites();
        return enemigo;
    }
}

