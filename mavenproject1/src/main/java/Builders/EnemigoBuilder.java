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
    private Enemigo e;
    private int poder;
    private String tipo;

    public EnemigoBuilder(Enemigo e) {
        this.e = e;
    }

    public void construirPoder(int poder){
        this.poder = poder;
    }
    public void definirTipo(String tipo){
        this.tipo = tipo.toLowerCase();
    }
    
    public Enemigo getEnemigo(){
        return e;
    }
}

