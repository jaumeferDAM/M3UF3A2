/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.control;


import domino.model.Fitxa;
import domino.model.Jugador;
import domino.model.Torn;
import java.util.Scanner;

/**
 *
 * @author Jaume
 */
public class InterficieText {
     Scanner lector = new Scanner(System.in);
        Jugador jugador;
        Torn torn;
        GestioDominoText ig;

    public InterficieText(GestioDominoText ig) {
        this.ig = ig;
    }
         String [] jugadors= new String[4];

         Fitxa[] fitxesJugador;
    public String[] getJugadors() {
        return jugadors;
    }

    public void setJugadors(String[] jugadors) {
        this.jugadors = jugadors;
    }
    public InterficieText(Jugador jugador, Torn torn) {
        this.jugador = jugador;
        this.torn = torn;
    }

    public InterficieText() {
    }

    public String[] setJugadors() {
       
        System.out.println("\n Introdueix el nom del jugador: ");
        for(int i =0;i<jugadors.length;i++) {
            System.out.println(i + ": ");
            jugadors[i] = lector.nextLine();
        }
        
        return jugadors;
    }
     public String mostrarMenu() {
       
            System.out.println("\nSeleccionar opció: "
                    + "\n1 Jugar Fitxa."
                    + "\n2 2"
                    + "\n3 3"
                    + "\n4 4"
                    + "\n5 Passar");
            
            return lector.nextLine();
        }

        public int demanarFitxa(String missatge) {
            System.out.println(missatge);
            return lector.nextInt();
           }

        public void jugarFitxa0(int f) {
             Fitxa jugada = jugador.getFitxes().get(0);
             jugador.colocarFitxa(jugada);
             torn.colocarUnaFitxa(jugada, true);
        }
        public void mostrarMissatge(String missatge) {
            System.out.println(missatge);
        }
        
        }

