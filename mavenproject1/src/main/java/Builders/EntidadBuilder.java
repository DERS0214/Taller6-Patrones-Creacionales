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
public interface EntidadBuilder {
    static Entidad e=null;
    void definirListado();
    void agregarSprites();
    void configurarCaracteristicas();
    Entidad build();
    
}
