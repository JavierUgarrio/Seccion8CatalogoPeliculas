/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ImplementacionCatalogoPeliculas implements ICatalogoPelicula {
    //atributo
    private final ArrayList<String> listaPeliculas;
    /*
        Constructor -> Cuando creas un nuevo objeto de ImplementacionCatalogoPeliculas,  se hace una lista vacía para guardar películas "new ArrayList<>()"
    */
    public ImplementacionCatalogoPeliculas() {
        this.listaPeliculas = new ArrayList<>();
    }
    
    /*
      Metodos interface
        this.listaPeliculas.add(nombrePelicula.toString());:
                Aquí se está agregando la película a la lista llamada listaPeliculas.
                nombrePelicula.toString() convierte el objeto Pelicula en un texto (su representación en forma de cadena) antes de agregarlo a la lista.
    */
    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(null,
                this.listaPeliculas,
                "Lista de Peliculas",
                2);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        for(var pelicula :listaPeliculas){
            if(pelicula.equals(listaPeliculas)){
                resultado = pelicula;
                break;
            }else{
                resultado = pelicula;
            }
        }
        
        if(nombrePelicula.equals(resultado)){
            JOptionPane.showMessageDialog(null,
                    "Resultado -> "+resultado,
                    "Buscar Pelicula",
                    JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "No se encontro la pelicula -> "+nombrePelicula,
                    "Buscar Pelicula",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
