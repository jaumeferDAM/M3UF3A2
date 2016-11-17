package domino;

import domino.control.GestioDomino;
import domino.model.Joc;
import domino.model.Jugador;
import domino.vista.InterficieGrafica;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.SwingUtilities;

public class Domino {

    public static void main(String[] args) {
        Joc joc = new Joc(4, 28, 7);

        InterficieGrafica ig = new InterficieGrafica();
        GestioDomino gd = new GestioDomino(ig);
        String[] noms = {"Pau", "fd", "dd", "dd2"};
        joc.iniciar(noms);
        System.out.println((joc.getJugadors()[0]));

        gd.iniicia();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                InterficieGrafica intGraf = new InterficieGrafica();
                intGraf.setVisible(true);
            }
        });

    }

}
