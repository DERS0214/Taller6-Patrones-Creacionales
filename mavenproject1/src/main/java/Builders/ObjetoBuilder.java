/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Enemigo;
import com.mycompany.mavenproject1.Objeto;

/**
 *
 * @author CltControl
 */
public class ObjetoBuilder {
    private Objeto o;
    private int peso;
    private String tipo;

    public ObjetoBuilder(Objeto o) {
        this.o = o;
    }

    public void construirPoder(int peso){
        this.peso = peso;
    }
    public void definirTipo(String tipo){
        this.tipo = tipo.toLowerCase();
    }
    
    public Objeto getObjeto(){
        return o;
    }
}
