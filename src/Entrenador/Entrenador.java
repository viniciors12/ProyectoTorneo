/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrenador;

/**
 *
 * @author Vinicio
 */
public class Entrenador {
    
   public Entrenador sig,ant;
   public subEntreTorneo inicioSubT;
   public String contraseña;
   public String nombre;
   public subEntreEquipo inicioSubE;
   public int id;

    public Entrenador(String nombre, int id, String contraseña) {
        this.nombre = nombre;
        this.contraseña =contraseña;
        this.id = id;
        this.ant = null;
        this.sig= null;
    }
    
    
    
}
