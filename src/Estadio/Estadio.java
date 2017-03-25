/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estadio;

/**
 *
 * @author Vinicio
 */
public class Estadio {
public Estadio sig;
public Estadio ant;
public String nombre;    
public int maxVisitantes;
public String ubicacion;
public int valorEntrada;

    public Estadio(String nombre, int maxVisitantes, String ubicacion,int valorEntrada) {
        this.ant = null;
        this.sig = null;
        this.nombre = nombre;
        this.maxVisitantes = maxVisitantes;
        this.ubicacion = ubicacion;
        this.valorEntrada=valorEntrada;
        
    }

    
}
