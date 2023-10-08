/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion2;

import java.util.Scanner;


public class Ej35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca el primer valor ");
        num1=t.nextInt();
        System.out.println("Introduzca el segundo valor ");
        num2=t.nextInt();
        for (int i = 1; i <= num1*num2; i++) {
            if (num1*num2%i==0) {
                if (i<num1*num2) {
                      System.out.print(i + " , ");
                }else{
                       System.out.print(i + " ");
                }
              
            }
   
        }
    }

}
