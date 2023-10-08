/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int ano;
        System.out.println("Introduzca el ano a examinar ");
        ano = t.nextInt();
        boolean cond1, cond2, cond3;
        if (ano % 4 == 0) {
            cond1 = true;
        } else {
            cond1 = false;
        }
        if (ano % 100 != 0) {
            cond2 = true;
        } else {
            cond2 = false;
        }
        if (ano % 400 != 0) {
            cond3 = true;
        } else {
            cond3 = false;
        }
        if (cond1 && cond2 && cond3) {
            System.out.println("El ano es bisiesto");
        }else{
            System.out.println("El ano no es bisiesto");
        }
    }
}
