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
public class metodosEstadio {
 
    Estadio inicioEs;
    
    
    public String borrarEstadio(String nombre){
    if(inicioEs==null){
        return "El estadio no sido registrado.";
    }
        if(inicioEs.nombre.equals(nombre)){
            inicioEs = inicioEs.sig;
            return "Eliminado exitosamente!";
        }
        
        Estadio aux = inicioEs;
        while(aux!=null){
        if(aux.nombre.equals(nombre)){
            aux.ant.sig = aux.sig;
            if(aux.sig!=null){
            aux.sig.ant = aux.ant;
            return "Eliminado exitosamente!";
            }
            
        }
        aux = aux.sig;
        }
        return "El estadio no a sido registrado.";
    }
    public String insertarInicioDoble(String nombre,int maxVisitantes, String ubicacion,int valorEntrada){
        Estadio nuevo=new Estadio(nombre,maxVisitantes,ubicacion,valorEntrada);
        if(inicioEs==null){
            nuevo= inicioEs;
            return"creado correctamente";
        }
        nuevo.sig=inicioEs;
        inicioEs.ant=nuevo;
        inicioEs=nuevo;
        return"creado correctamente";
    }
    }
    

