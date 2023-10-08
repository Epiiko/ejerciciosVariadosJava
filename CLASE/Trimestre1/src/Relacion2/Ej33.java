/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, exp, res = 1;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca la base");
        base = t.nextInt();
        System.out.println("Introduzca el exp");
        exp = t.nextInt();
        if (base == 0 && exp == 0) {
            System.out.println("Error no se puede elevar un cero a cero");
        } else {
            for (int i = 0; i < exp; i++) {
                res *= base;
            }
            System.out.println(res);
        }
        
    }

}
