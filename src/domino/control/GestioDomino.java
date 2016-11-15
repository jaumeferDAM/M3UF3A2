/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.control;

import domino.model.Joc;
import domino.vista.InterficieGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jaume
 */
public class GestioDomino implements ActionListener{
    
    private InterficieGrafica ig;
    private Joc joc;

    public GestioDomino(InterficieGrafica ig) {
        this.ig = ig;
       }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String accio = e.getActionCommand();
//        try {
//
//            switch (accio) {
//
//                case "Jugada":
//                    jugada();
//                    break;
//                case "Passar":
//                    passar();
//                    break;
//                //case "":
//                    
//            }
//        } catch (NumberFormatException ex) {
//            ig.mostrarMissatgeError("Error");
//          //ig.buidarTextFields();
//        }
    }
//        private void jugada() {
//            ig.
//        }
    
}



