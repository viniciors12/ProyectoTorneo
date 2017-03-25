
package Torneo;

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
