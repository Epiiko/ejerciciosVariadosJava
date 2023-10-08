/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int nota, suma = 0, media, i =  0;//i para contar el recorrido del do/while
        do {
            System.out.println("Introduzca la nota // Introduzca -1 para salir del programa");
            nota = t.nextInt();
            if (nota != -1) {
                if (nota > 10 || nota < 0) {
                    System.out.println("Error la nota no puede ser negativa o superior a 10");
                } else {
                    suma += nota;
                    i++;
                }
            }else{
                System.out.println("Calculando...............");
            }
        } while (nota != -1);
        media = suma / i;
        System.out.println("La media es de " + media);

    }

}
