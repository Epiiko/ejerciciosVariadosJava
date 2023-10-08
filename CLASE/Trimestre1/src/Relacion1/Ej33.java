/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,expo, aux;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el valor del numero");
        num=t.nextInt();
        System.out.println("Introduzca el valor del exponente");
        expo=t.nextInt();
        aux=num;
        for (int i = 1; i < expo; i++) {
            aux=aux*num;
        }
        System.out.println("El numero elevado al exponente es " +  aux);
    }

}
