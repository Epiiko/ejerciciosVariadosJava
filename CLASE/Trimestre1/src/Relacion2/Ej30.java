/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca el primer valor (mas pequeño)");
        num1 = t.nextInt();
        System.out.println("Introduzca el psegundo valor (mas grande)");
        num2 = t.nextInt();
        if (num2 < num1) {
            int aux = num2;
            num2 = num1;
            num1 = aux; 
       }
        while (num1 <= num2) {
            if (num1%2!=0) {
                 num1++;
                     
            }else{
                if (!(num1==num2)) {
                System.out.print(num1 + " , ");         
            }else{
                System.out.print(num1 + " ");   
            }
            num1+=2;
        }
    }
    }
}
