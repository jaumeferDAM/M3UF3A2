package domino;

import domino.control.GestioDomino;
import domino.control.GestioDominoText;
import domino.control.InterficieText;
import domino.model.Joc;
import domino.model.Jugador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.SwingUtilities;

public class Domino {
 static Joc joc = new Joc(4, 28, 7);
       static int comptPassar = joc.getTorn();
        static InterficieText it = new InterficieText();
        
    public static void main(String[] args) {
       cargarJuego();
       
        
    }
    public static void cargarJuego() {
        String[] noms = it.setJugadors();
        joc.iniciar(noms);
        
        GestioDominoText gdt = new GestioDominoText(joc, it, joc.getJugadors()[0], comptPassar);
//        gdt.getClass();
    }

}
