/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion3;

import java.util.Scanner;

public class Ej63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][], m, mayor=0, sumadiagonal=0;
        double  mediadiagonal=0;
        Scanner t = new Scanner(System.in);
        do {
            System.out.print("Introduzca el valor de las filas : ");
            m = t.nextInt();
        } while (m < 1);
        matriz = new int[m][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.println("Introduzca el valor de [" + i + "] [" + k + "]");
                matriz[i][k] = t.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
          sumadiagonal+=matriz[i][i];
            if (mayor<matriz[i][i]) {
                mayor=matriz[i][i];
            }
        }
     mediadiagonal=sumadiagonal/matriz.length;
        System.out.println("La media de la diagonal principal es de " + mediadiagonal + " siendo el mayor de sus valores " + mayor);
        
    }

}
