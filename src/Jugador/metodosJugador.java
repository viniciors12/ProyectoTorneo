/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author Vinicio
 */
public class metodosJugador {

    public Jugador inicioJ;

    public String insertarInicio(String nombre, int id, String posicion, int fisico, int defensa, int dribbling, int disparo) {
        Jugador nuevo = new Jugador(nombre, id, posicion, fisico, defensa, dribbling, disparo);
        if (inicioJ == null) {
            inicioJ = nuevo;
            return "Enlazado";
        }
        nuevo.sig = inicioJ;
        inicioJ = nuevo;
        return "enlazado";

    }

    public String borrarJugador(int id) {

        if (inicioJ == null) {
            return "El jugador no ha sido registrado";
        }

        if (inicioJ.id == id) {
            inicioJ = inicioJ.sig;
            return "Eliminado exitosamente!";
        }

        Jugador aux = inicioJ;
        Jugador ant = inicioJ;
        while (aux != null) {
            if (aux.id == id) {

            ant.sig = aux.sig;
            return"Eliminado exitosamente!";
            }
            ant = aux;
            aux = aux.sig;
        }
    return "El jugador no ha sido registrado";
    }

}
