/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion2;

import java.util.Scanner;


public class Ej42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca numero");
        int num=t.nextInt();
        if (num>0) {
          for (int i = 0; i < num; i++) {
              for (int k = 0; k < num; k++) {
              System.out.print("* ");
              }
              System.out.println();
        }  
        }
        
    }

}
