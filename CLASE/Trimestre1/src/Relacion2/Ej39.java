/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num, fact = 1;
        System.out.println("Introduzca el numero a examinar ");
        num = t.nextInt();
        if (num < 0) {
            System.out.println("ERROR no hay factoriales de un negativo");
        } else {
            for (int i = num; i >= 1; i--) {
                fact *= i;
            }
            System.out.println("El factorial de " + num + " es: " + fact);
        }

    }

}
