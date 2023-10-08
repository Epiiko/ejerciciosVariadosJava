/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[], sumamas36=0, sumamenos10=0;
        Scanner t=new  Scanner(System.in);
        num=new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca el numero " + (i+1));
            num[i]=t.nextInt();
            if (num[i]>36) {
                sumamas36+=num[i];
            }
            if (num[i]<10) {
                sumamenos10+=num[i];
            }
        }
        System.out.println("La suma de los numeros mayores a 36 es de : " + sumamas36);
        System.out.println("La suma de los numeros menosres a 10 es de : " + sumamenos10);
    }

}
