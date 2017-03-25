
package Equipo;

public class Equipo {
   subEquipoTorneo inicioSub; 
   Equipo sig,ant; 
   String nombre;
   int maxJugadores = 11;
   int dineroTotal = 3000000;
   int cantDefensas = 4;
   int cantMedioCampo = 4;
   int cantDelantero = 2;
   int cantPortero = 1;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.sig = null;
        this.ant = null;
        this.inicioSub = null;
        
    }
   
   
   
    
    
}
