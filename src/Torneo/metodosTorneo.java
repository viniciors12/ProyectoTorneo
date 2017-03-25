
package Torneo;

public class metodosTorneo {

    public Torneo inicioT;

    public String insertarFinal(String nombre) {
        Torneo nuevo = new Torneo(nombre);
        if (inicioT == null) {
            inicioT = nuevo;
            return "Insertado";
        }

        Torneo aux = inicioT;
        while (aux != null) {
            if (aux.sig == null) {
                nuevo.ant = nuevo;
                aux.sig = nuevo;

            }
            aux = aux.sig;
        }
        return "Insertado";
    }

    public String eliminarDobleTorneo(String nombre) {
        if (inicioT == null) {
            return "No existen torneos";
        }
        if (inicioT.nombre.equals(nombre)) {
            inicioT.sig = inicioT;
            return "eliminado correctamente";
        }
        Torneo aux = inicioT;
        while (aux != null) {
            if (aux.nombre.equals(nombre)) {
                aux.ant.sig = aux.sig;
                if (aux.sig != null) {
                    aux.sig.ant = aux.ant;

                }
                return "eliminado correctamente";

            }
            aux = aux.sig;
        }
        return "No existen torneos";
    }

}
