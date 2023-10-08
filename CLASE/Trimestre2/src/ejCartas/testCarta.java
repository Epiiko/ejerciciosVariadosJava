/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejCartas;


public class testCarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta baraja[] =new Carta[Carta.paloenum.values().length* Carta.numerocarta.values().length];
        int contador=0; // para el contador de las 48 cartas y recorrer baraja
       
        for (int i = 0; i < Carta.paloenum.values().length; i++) {
            for (int j = 0; j < Carta.numerocarta.values().length; j++) {
                   baraja[contador]=new Carta(Carta.paloenum.values()[i], Carta.numerocarta.values()[j]);
            
                   System.out.print(baraja[contador]);
                   contador++; 
            }
            System.out.println("");
            
        }
    }

}
