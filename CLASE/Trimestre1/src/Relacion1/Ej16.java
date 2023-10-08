/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double media, nota1, nota2, nota3, notatotal;
        System.out.println("Introduzca la primera nota del alumno");
        nota1 = t.nextDouble();
        System.out.println("Introduzca la segunda nota del alumno");
        nota2 = t.nextDouble();
        System.out.println("Introduzca la segunda nota del alumno");
        nota3 = t.nextDouble();
        notatotal = (nota1 + nota2 + nota3);
        media = notatotal / 3;
        if (media > 6.4999) {
            System.out.println("Promociona con una media de " + media);
        } else {
            System.out.println("No promociona");
        }

    }

}
