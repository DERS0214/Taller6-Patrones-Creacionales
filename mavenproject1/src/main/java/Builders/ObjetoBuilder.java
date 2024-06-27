/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Enemigo;
import com.mycompany.mavenproject1.Entidad;
import com.mycompany.mavenproject1.Objeto;

/**
 *
 * @author CltControl
 */
public class ObjetoBuilder implements EntidadBuilder{
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
