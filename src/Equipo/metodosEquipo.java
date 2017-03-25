/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipo;

/**
 *
 * @author Vinicio
 */
public class metodosEquipo {

    Equipo inicioEq;
    Equipo fin;

    public String insertarInicio(String nombre) {
        Equipo nuevo = new Equipo(nombre);

        if (inicioEq == null) {
            inicioEq = fin = nuevo;
            inicioEq.ant = inicioEq;
            inicioEq.sig = inicioEq;
            return "Enlazado";

        }

        nuevo.sig = inicioEq;
        inicioEq.ant = nuevo;
        nuevo.ant = fin;
        fin.sig = nuevo;
        inicioEq = nuevo;
        return "Enlazado";
    }

    public String borrarEquipo(String nombre) {
        if (inicioEq == null) {
            return "No se ha registrado ese equipo.";
        }
        if (inicioEq.nombre.equals(nombre)) {
            if (inicioEq == inicioEq.sig) {
                inicioEq = null;
            } else {
                inicioEq = inicioEq.sig;
                fin.sig = inicioEq;
                inicioEq.ant = fin;
            }
            return "Se ha eliminado exitosamente!";
        }
        Equipo aux = inicioEq;
        while (aux != fin) {
            if (aux.nombre.equals(nombre)) {
                aux.ant.sig = aux.sig;
                aux.sig.ant = aux.ant;
                return "Se ha eliminado exitosamente!";
            }

            aux = aux.sig;
        }
        if (fin.nombre.equals(nombre)) {
            //aux.ant.sig = fin.sig;
            fin = aux.ant;
            fin.sig = inicioEq;
            inicioEq.ant = fin;
            return "Se ha eliminado existosamente!";

        }
        return "No se ha registrado ese equipo.";

    }

}
