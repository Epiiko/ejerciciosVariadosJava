/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion3;

public class Ej59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int FILAS = 5, COLUMNAS = 5;
        int matriz[][] = new int[FILAS][COLUMNAS], num = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                num += 1;
                matriz[i][k] = num;
            }
            
        }
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
