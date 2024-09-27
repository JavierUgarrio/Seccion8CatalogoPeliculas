package peliculas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import peliculas.ui.UiPeliculas;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion ArrayList
        ArrayList<String> meses = new ArrayList<>();
        
        /*
            JOptionPane.ERROR_MESSAGE.       ->0
            JOptionPane.INFORMATION_MESSAGE. ->1
            JOptionPane.WARNING_MESSAGE.     ->2
            JOptionPane.QUESTION_MESSAGE.    ->3
        */
        
        UiPeliculas.interfazUsuario();
      
    }
    
}
