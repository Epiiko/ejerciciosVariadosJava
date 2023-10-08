/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion3;

import java.util.Scanner;

public class Ej62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][], n, m, mayor = 0, primeraposifila=-1, primeraposicolu=-1;
        Scanner t = new Scanner(System.in);
        do {
            System.out.print("Introduzca el valor de las filas : ");
            n = t.nextInt();
        } while (n < 1);
        do {
            System.out.print("Introduzca el valor de las columnas : ");
            m = t.nextInt();
        } while (m < 1);
        matriz = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.println("Introduzca el valor de [" + i + "] [" + k + "]");
                matriz[i][k] = t.nextInt();
                if (mayor < matriz[i][k]) {
                    mayor = matriz[i][k];
                }
            }
        }
        System.out.print("El mayor se repite en las posiciones");
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                if (mayor == matriz[i][k]) {  
                    System.out.print("[" + i + "]"+ "[" + k + "] // ");
                     if (primeraposifila==-1) {
                        primeraposifila=i;
                        primeraposicolu=k;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("La primera posición  donde se encuentra el mayor es [" + primeraposifila + "] [" + primeraposicolu + "] siendo el mayor " + mayor );
    }
}
