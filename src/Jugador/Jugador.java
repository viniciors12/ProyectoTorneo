
package Jugador;

public class Jugador {
public Jugador sig;
public subJugadorEquipo inicioSub;
public String nombre;
public int cantGoles;
public int id;
public String posicion;
public int fisico;
public int defensa;
public int dribbling;
public int disparo;

    public Jugador(){
    this.cantGoles = 0;
    }
    
    public Jugador(String nombre, int id, String posicion,int fisico,int defensa,int dribbling,int disparo) {
        this.nombre = nombre;
        this.id = id;
        this.posicion = posicion;
        this.defensa = defensa;
        this.disparo = disparo;
        this.dribbling = dribbling;
        this.fisico = fisico;
        this.sig = null;
        this.inicioSub = null;
        
    }


}
