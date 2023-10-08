/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        double n1, n2;
        System.out.println("Introduzca el primer numero");
        n1=t.nextDouble();
         System.out.println("Introduzca el segundo numero");
        n2=t.nextDouble();
        if (n1>n2) {
            double resta=n1-n2;
            double div=n1/n2;
            System.out.println("La resta del primero con respecto al segundo es de " + resta + " Y la division es: " + div);
        }else{
            double suma= n1+ n2;
            double mult=n1*n2;
            System.out.println("La suma de ambos numeros es de: " + suma + " La multiplicacion es de : " + mult);
        }
    }

}
