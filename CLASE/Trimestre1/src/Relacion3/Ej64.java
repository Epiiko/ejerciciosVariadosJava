/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion3;

import java.util.Scanner;

public class Ej64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][], m;
        boolean simetrica=true;
        Scanner t = new Scanner(System.in);
        //cargamos valores mayores a cero
        do {
            System.out.print("Introduzca el valor de las filas : ");
            m = t.nextInt();
        } while (m < 1);
        matriz = new int[m][m];
        //cargar valores de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.println("Introduzca el valor de [" + i + "] [" + k + "]");
                matriz[i][k] = t.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length && i!=k && simetrica; k++) {
                if (matriz[i][k]!=matriz[k][i]) {
                    simetrica=false;
                }
            }
        }
        if (simetrica) {
            System.out.println("La matriz es simetrica perfecta");
        }else{
            System.out.println("La matriz no es simetrica");
        }
    }
}
