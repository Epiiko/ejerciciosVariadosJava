/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num;
        System.out.println("Introduzca valor");
        num = t.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (num > i) {
                    System.out.print(i + " , ");
                } else {
                    System.out.print(i + " ");
                }
            }

        }
    }
}
