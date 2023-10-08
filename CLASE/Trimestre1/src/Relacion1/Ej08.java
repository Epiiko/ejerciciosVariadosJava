/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int caras, calculo;
        Scanner t=new Scanner(System.in);
         do {
        System.out.print("Introduzca el numero de caras de su dado , recuerde que si no desea tirar mas puede pulsar 0 ");
        caras=t.nextInt();
        calculo=(int) (Math.random() * caras + 1);
        System.out.println(calculo);
        } while (caras!=0);
        
        
        
    }

}
