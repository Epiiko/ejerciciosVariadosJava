/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int num;
        do {            
             System.out.println("Introduzca un numero");
             num=t.nextInt();
             if(num%3!=0 || num%2!=0){
                 System.out.println("ERROR NO ES DIVISIBLE ENTRE 2 Y 3 ");
             }    
        } while (num%3!=0 || num%2!=0);
            System.out.println("El numero dividido entre dos es: " + (num/2));
            System.out.println("El numero dividido entre tres es: " + (num/3));
        }
    }


