/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, k = 2;
        //iniciamos k en dos ya que es el primer divisor de un numero
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el numero a examinar");
        num = t.nextInt();
        while (num > k) {
            if (num % k == 0) {
                System.out.print(k + ", ");
            }
            k++;
        }

    }

}
