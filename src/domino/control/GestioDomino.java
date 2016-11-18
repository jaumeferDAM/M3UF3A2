/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.control;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import domino.vista.InterficieGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jaume
 */
public class GestioDomino implements ActionListener{
    
     private InterficieGrafica ig;
    private Joc joc;
     String[] noms = {"Pau", "fd", "dd", "dd2"};
           private Torn t;
           private Jugador jugador;
           
    public GestioDomino(InterficieGrafica ig) {
        this.ig = ig;
       joc = new Joc(4, 28, 7);
        t = new Torn(joc);
        jugador = new Jugador("Pau");
    }

   
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String accio = e.getActionCommand();
        try {

            switch (accio) {

                case "Fitxa1":
                    jugada1();
                    break;
                case "Passar":
                    passar();
                    break;
                //case "":
                    
            }
        } catch (NumberFormatException ex) {
            ig.mostrarMissatgeError("Error");
          //ig.buidarTextFields();
        }
    }
        private void jugada1() {
            t.colocarUnaFitxa(jugador.getFitxes().get(0),true);
        }
        public void iniicia() {
             joc.iniciar(noms);
        ig.setFitxes((joc.getJugadors()[0]));
        }
        private void passar() {
            ig.setTorn(joc.getTorn());
        }
    
}



