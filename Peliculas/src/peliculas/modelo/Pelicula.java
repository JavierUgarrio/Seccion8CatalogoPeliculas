
package peliculas.modelo;

import java.io.Serializable;


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
      
    
}
