/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num;
        System.out.println("Introduzca numero");
        num = t.nextInt();
        System.out.println("Introduzca caracter");
        char caracte = t.next().charAt(0);
        for (int i = 0; i < num; i++) {
            for (int k = i; k <= num; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(caracte + " ");
            }
            System.out.println("");

        }
    }

}
