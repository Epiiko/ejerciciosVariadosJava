/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1,num2, suma, resta, mult, div, pot;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el primer numero ");
        num1=t.nextDouble();
        System.out.println("Introduzca el segundo numero ");
        num2=t.nextDouble();
        suma=num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        pot=Math.pow(num1,num2);
        t.close();
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + mult);
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + div);
        System.out.println("La potencia de " + num1 + " y " + num2 + " es: " + pot);
    }

}
