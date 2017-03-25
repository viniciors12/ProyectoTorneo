
package Entrenador;

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
