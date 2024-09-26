package peliculas.ui;
import peliculas.modelo.*;
import javax.swing.JOptionPane;

public class UiPeliculas {
    public static void interfazUsuario(){
        ICatalogoPelicula peliculas = new ImplementacionCatalogoPeliculas();
        Pelicula pelicula;
        
        CERRAR:
        while(true){
          String opcion  = JOptionPane.showInputDialog(
                  null,
                  "1 - Insertar Pelicula\n"
                  +"2 - Listar Pelicula\n"
                  +"3 - Buscar Pelicula\n"
                  +"4 - Salir",
                  "Ingrese una opcion",
                  3
          );
          switch(opcion){
              case "1": 
                  String nombrePelicula = JOptionPane.showInputDialog(
                  null,
                  "Ingrese el nombre de la Pelicula",
                  "Entrada",
                  3
                  );
                  pelicula = new Pelicula(nombrePelicula);
                  peliculas.insertarPelicula(pelicula);
                  break;
              case "2":
                  peliculas.listarPelicula();
                  break;
              case "3":
                  nombrePelicula = JOptionPane.showInputDialog(
                          null,
                          "Ingrese el nombre de la pelicula",
                          "Buscar",
                          3);
                  peliculas.buscarPelicula(nombrePelicula);
                  break;
              case "4":
                  break CERRAR;
              default:
                  JOptionPane.showMessageDialog(null, 
                          "Opcion INCORRECTA \n"
                          +"Vuelve a ingresar \n"
                          +"opcion correcta \n"
                          +"del 1-4 \n",
                          "ERROR",
                          JOptionPane.ERROR_MESSAGE
                  );
          }
        }
    }
}
