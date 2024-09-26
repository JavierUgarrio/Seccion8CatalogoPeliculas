/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package peliculas.modelo;

/**
 *
 * @author User
 */
public interface ICatalogoPelicula {
    //metodo para insertar peliculas
    void insertarPelicula(Pelicula nombrePelicula);
    //metodo listar peliculas
    void listarPelicula();
    //metodo buscar peliculas
    void buscarPelicula(String nombrePelicula);
    
    
}
