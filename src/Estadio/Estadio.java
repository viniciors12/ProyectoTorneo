
package Estadio;

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
