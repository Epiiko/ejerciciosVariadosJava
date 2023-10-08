/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, num3, mayor, menor;
        boolean negativo = true;
        Scanner t = new Scanner(System.in);
        // Numero 1
        System.out.println("Ingrese el numero 1 ");
        num1 = t.nextInt();
        mayor = num1;
        menor = num1;
        if (num1 > 0) {
            negativo = false;
            }
            // Numero 2
            System.out.println("Ingrese el numero 2 ");
            num2 = t.nextInt();
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num2 < menor) {
                menor = num2;
            }
            if (num2 > 0) {
                negativo = false;

            }
            // Numero 3
            System.out.println("Ingrese el numero 3 ");
            num3 = t.nextInt();
            if (num3 > mayor) {
                mayor = num3;
            }
            if (num3 < menor) {
                menor = num3;
            }
            if (num1 > 0) {
                negativo = false;

            }
            if (negativo) {
                System.out.println("El mayor es " + mayor);
                System.out.println("El menor es " + menor);
            }else{
                System.err.println("ERROR LOS NUMEROS HAN DE SER NEGATIVOS");
            }

        
    }
}
