/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej87;

public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revolver r1 = new Revolver("Magnum", ".45", 6);
        Jugador j1 = new Jugador("Nacho");
        Jugador j2 = new Jugador("Joselito");
        Jugador j3 = new Jugador("Paco");
        Jugador[] jugadores = {j1, j2, j3};
        boolean muerto;
        int ronda=1;
        do {            
            System.out.println("Ronda " + ronda);
            ronda++;
          muerto=ronda(jugadores, r1);
        } while (!muerto);
        
                

    }

    public static boolean ronda(Jugador[] jugadors, Revolver pipa) {
        boolean muerto=false;
        for (int i = 0; i < jugadors.length && !muerto ; i++) {
            jugadors[i].disparar(pipa);
            System.out.println(jugadors[i].toString());;
            if (!jugadors[i].isVivo()) {
                muerto= true;
            }
        }
        return muerto;
    }

}
