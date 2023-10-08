/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion3;

import java.util.Scanner;

public class Ej61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][], n, m, iguales=0, menores=0, mayores=0;
        Scanner t = new Scanner(System.in);
        do {
            System.out.print("Introduzca el valor de las filas : ");
            n = t.nextInt();
        } while (n < 1);
        do {
            System.out.print("Introduzca el valor de las columnas : ");
            m = t.nextInt();
        } while (m < 1);
        matriz=new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.println("Introduzca el valor de [" +i + "] ["+ k + "]" );
                matriz[i][k]=t.nextInt();
                if(matriz[i][k]==0) {
                    iguales++;
                }else if (matriz[i][k]<0) {
                    menores++;
                }else{
                    mayores++;
                }
            }
        }
        System.out.println("La cantidad de numeros mayores de " + mayores + " las de menores " + menores + " y la de iguales " + iguales);
        System.out.println("La matriz representada sería: ");
          for (int i = 0; i < matriz.length; i++) {
              System.out.print(" [ ");
            for (int k = 0; k < matriz[i].length-1; k++) {
                System.out.print(matriz[i][k]+" , ");
            } 
              System.out.println(matriz[i][matriz[i].length-1] + " ] ");
        }
    }
}
