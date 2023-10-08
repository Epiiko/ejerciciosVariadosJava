/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion2;

import java.util.Scanner;


public class Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int num;
        do {            
            System.out.println("Introduzca el valor a estudiar");
            num=t.nextInt();
            if (num%2!=0 || num%3!=0) {
                System.out.println("Error el numero no es divisible entre tres y dos");
            }
        } while (num%2!=0 || num%3!=0);
         System.out.println("El numero es divisible entre 2 con un resultado de : " + (num/2) + " y entre 3 con un resultado de : " + (num/3));
    }

}
