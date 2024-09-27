
package peliculas.modelo;

import java.io.Serializable;
import java.util.Objects;


public class Pelicula implements Serializable{
    //Atributos
    private String nombre;
    
    //Constructor
    public Pelicula(){
        
    }
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    
    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    //toString

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + '}';
    }
    
    //hashCode equals
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
      
    
}
