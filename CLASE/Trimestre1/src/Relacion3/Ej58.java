/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion3;

import java.util.Scanner;

public class Ej58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int valor, matriz[][];
        do {
            System.out.println("Introduzca el tamaño de los lados de la matriz");
            valor = t.nextInt();
        } while (valor < 3 || valor > 5);
        matriz = new int[valor][valor];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduzca valor para la posicion [" + i + "] " + " [" + j + "] ");
                matriz[i][j] = t.nextInt();
            }
        }
        //como imprimir matriz sin comas al final y corchetes
        System.out.println("La matriz rellena quedaría");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length-1; j++) {
                  System.out.print(matriz[i][j] + " , ");   
            }
            System.out.println(matriz[i][matriz[i].length-1] + "]");
        }
    }

}
