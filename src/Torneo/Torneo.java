/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Torneo;

/**
 *
 * @author Vinicio
 */
public class Torneo {
   public int maxEquipos = 16;
    public Torneo sig,ant;
    public String nombre;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.sig = null;
        this.ant = null;
    }
    
    
}
