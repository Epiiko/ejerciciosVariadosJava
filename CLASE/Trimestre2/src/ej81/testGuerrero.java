/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej81;

public class testGuerrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 1;
        Arma a1 = new Arma("Martillo", 15, 8);
        Arma a2 = new Arma("Baston", 17, 15);
        Guerrero g1 = new Guerrero("Thor", 19, 15, 130, a1);
        Guerrero g2 = new Guerrero("Loki ", 12, 18, 100, a2);

        for (int i = 1; i < 3; i++) {
            g1.lvlUp();
            g2.lvlUp();
            for (int j = 1; j < 6; j++) {

                System.out.println("Ronda " + cont
                );
                cont++;
                System.out.println(g1.atacar(g2));
                System.out.println(g2.atacar(g1));
            }
        }
    }

}
