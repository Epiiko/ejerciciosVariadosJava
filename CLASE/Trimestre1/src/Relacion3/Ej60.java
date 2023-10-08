/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion3;


public class Ej60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int FILAS = 10, COLUMNAS =10;
        int matriz[][] = new int[FILAS][COLUMNAS];
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz.length; k++) {
                matriz[i][k]=(i+1)*(k+1);
            } 
        }
        System.out.println("La matriz representada sería: ");
          for (int i = 0; i < matriz.length; i++) {
              System.out.print(" [ ");
            for (int k = 0; k < matriz.length-1; k++) {
                System.out.print(matriz[i][k]+" , ");
            } 
              System.out.println(matriz[i][matriz[i].length-1] + " ] ");
        }
    }

}
