
package Entrenador;

import Inicios.Inicios;

public class metodosEnt {

    //Inicios inicios;
    public Entrenador inicioEn;
    public Entrenador fin;

    public String insertarInicioCircular(String nombre, int id, String contraseña) {
        Entrenador nuevo = new Entrenador(nombre, id, contraseña);
        if (inicioEn == null) {
            inicioEn = fin = nuevo;
            inicioEn.sig = inicioEn;
            return "ingresado correctamente";

        }
        fin.sig = nuevo;
        nuevo.sig = inicioEn;
        inicioEn = nuevo;
        return "ingresado correctamente";

    }

    public boolean buscarEntrenador(String nom, String contra) {
        if (inicioEn == null) {
            return false;
        }

        Entrenador aux = inicioEn;
        while (aux != null) {
            if (aux.nombre.equals(nom) && aux.contraseña.equals(contra)) {
                return true;
            }
            aux = aux.sig;
        }
        return false;
    }

    public String borrarEntrenador(int id) {

        if (inicioEn == null) {
            return "El entrenador no ha sido registrado";
        }

        if (inicioEn.id == id) {
            if(inicioEn==inicioEn.sig){
                inicioEn=null;
                return "Eliminado exitosamante";
            }
           
        
            inicioEn = inicioEn.sig;
            fin.sig = inicioEn;
            return "Eliminado existosamente";
        }

        Entrenador aux = inicioEn;
        Entrenador ant = inicioEn;
        while (aux != fin) {
            if (aux.id == id) {
                ant.sig = aux.sig;
                return "Eliminado existosamente!";
            }

            ant = aux;
            aux = aux.sig;
        }
        if (fin.id == id) {
            ant.sig = aux.sig;
            fin = ant;
            fin.sig = inicioEn;
            return "Eliminado existosamente!";
        }
        return "El entrenador no ha sido registrado";
    }

}
