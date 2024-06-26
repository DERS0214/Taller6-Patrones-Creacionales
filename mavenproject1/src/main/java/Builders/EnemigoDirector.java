/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Enemigo;

/**
 *
 * @author CltControl
 */
public class EnemigoDirector {
    private EnemigoBuilder builder;
    
    public EnemigoDirector(EnemigoBuilder builder){
        this.builder = builder;
    }
    
    public void construirEnemigo(){
        System.out.println("Construyendo enemigo...");
    }
    
    public Enemigo getEnemigo(){
        return builder.getEnemigo();
    }
}
