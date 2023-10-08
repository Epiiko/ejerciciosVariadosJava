/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, aux = 0;
        Scanner t = new Scanner(System.in);
        System.out.println("introduzca el primer numero");
        num1 = t.nextInt();
        System.out.println("introduzca el segundo numero");
        num2 = t.nextInt();
        if (num1 < num2) {
            num1 = aux;
            num2 = num1;
            aux = num2;

        }
        while (num1 >= num2) {
            /*si quisiesemos no solo los pares quitamos el condicionante del par(x%2==0)*/
            if (num1 > num2 && num2%2==0 ) {
                System.out.print(num2 + ", ");
               
            } else if (num1 == num2 && num2%2==0) {
                System.out.print(num2 + " ");
                
            }
            num2++;
        }

    }

}
