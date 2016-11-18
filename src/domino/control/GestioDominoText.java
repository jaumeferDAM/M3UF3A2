/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.control;

import domino.Domino;
import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import java.util.List;

/**
 *
 * @author Jaume
 */
public class GestioDominoText implements IGestioDomino {

     Joc joc;
     InterficieText interficieText;
     Jugador jugador;
     int comptPassar;
     Torn torn;
    String[] setJugadors = new String[4];
   public List <Fitxa> fichesJugador;
   
      
    public List<Fitxa> getFichesJugador() {
        return fichesJugador;
    }

    public void setFichesJugador(List<Fitxa> fichesJugador) {
        this.fichesJugador = fichesJugador;
    }

    public GestioDominoText(Joc joc, InterficieText interficieText, Jugador jugador, int comptPassar) {
//        Domino.cargarJuego();
        this.joc = joc;
        this.interficieText = interficieText;
        this.jugador = jugador;
        this.comptPassar = comptPassar;
        this.torn = torn;
         List<Fitxa> fichesJugador = jugador.getFitxes();
        //        this.comptPassar = this.joc.getComptPassar();
      
//        this.jugador = joc.getJugadors()[0];
        
        System.out.println(jugador.toString());
        SeleccionarOpcioMenu();
    }

    public GestioDominoText() {
       


    }

    public void SeleccionarOpcioMenu() {
        String accio = interficieText.mostrarMenu();

        switch (accio) {

            case "1":
                jugada1();
                break;
            case "Passar":
                passar();
                break;
                //case "":

        }
    }

    @Override
    public void jugada1() {
        System.out.println(jugador.getFitxes());
        this.interficieText.jugarFitxa0(interficieText.demanarFitxa("Sleccionar fitxa"));

    }

    public void iniicia() {

    }

    private void passar() {
        joc.setComptPassar(comptPassar++);
    }

}
