/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import com.mycompany.mavenproject1.Entidad;

/**
 *
 * @author Cecy
 */
public class EntidadDirector {
    private EntidadBuilder builder;

    public void setBuilder(EntidadBuilder builder) {
        this.builder = builder;
    }

    public Entidad construirEntidad() {
        builder.definirListado();
        builder.agregarSprites();
        builder.configurarCaracteristicas();
        return builder.build();
    }
}
