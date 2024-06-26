/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Objeto;

/**
 *
 * @author CltControl
 */
public class ObjetoDirector {
    private ObjetoBuilder builder;
        
    public ObjetoDirector(ObjetoBuilder builder){
        this.builder = builder;
    }
    
    public void construirObjeto(){
        System.out.println("Construyendo objeto...");
    }
    
    public Objeto getEnemigo(){
        return builder.getObjeto();
    }
}
