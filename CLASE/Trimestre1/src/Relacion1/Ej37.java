/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num, k1 = 0,k2=0, pos1, pos2;
        boolean primer12=false;
        do {
            k1++;
           
            System.out.println("Introduzca un numero, si introduce cero termina el listado");
            num = t.nextInt();
            if (num==12) {
            primer12=true;
            if(primer12=true){
            pos1=k1;
            
            }
            }
            
        } while (num != 0);
        System.out.println("Primera posicion en la que aparece el 12: " + k1);
           System.out.println("Segunda posicion en la que aparece el 12: " + k2);
    }

}
