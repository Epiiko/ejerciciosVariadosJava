/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion2;

import java.util.Scanner;


public class Ej45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner t=new Scanner(System.in);
       int numero, aleatorio;
       aleatorio=(int)((Math.random()*100)+1);
        do {            
            System.out.println("Introduzca un numero entre 1 y 100");
            numero=t.nextInt();
            if (numero<aleatorio) {
                System.out.println("Te has quedado corto");
            }else if (numero>aleatorio) {
                System.out.println("Te has pasado");
            }
        } while (numero!=aleatorio);
        System.out.println("LO LOGRASTE HAS GANADO");
    }

}
