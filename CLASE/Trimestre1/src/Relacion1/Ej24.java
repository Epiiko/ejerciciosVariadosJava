/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        String n1,n2;
        int dado, dado2;
        System.out.println("Introduzca el nombre del primer jugador ");
        n1=t.nextLine();
        System.out.println("Introduzca el nombre del segundo jugador");
        n2=t.nextLine();
        dado=3;//(int)(Math.random()*6+1);
        System.out.println(n1 + " ha sacado un : " + dado);
        dado2=3;//(int)(Math.random()*6+1);
         System.out.println(n2 + " ha sacado un : " + dado2);
        if (dado>dado2) {
            System.out.println("El jugador " + n1 + " ha ganado " );
            
        }else if (dado==dado2){
            System.out.println("EMPATE");
        }else{
            System.out.println("El jugador " + n2 + " ha ganado");
        }
    }

}
