/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numm, numn, combi, factn = 1, factnm = 1, factm = 1;
        boolean segundavez = false;
        do {
            if (segundavez) {
                System.out.println("ERROR el primer numero debe de ser mayor al  segundo");
            }
            System.out.println("Introduzca numero 1");
            numm = t.nextInt();
            System.out.println("Introduzca numero 2");
            numn = t.nextInt();
            segundavez = true;

        } while (numm < numn);
        //factorial de numerom
        for (int i = numm; i >= 1; i--) {
            factm *= i;
        }
        //factorial de numeron
        for (int i = numn; i >= 1; i--) {
            factn *= i;
        }
        //factorial de numerom-numerom
        for (int i = (numm - numn); i >= 1; i--) {
            factnm *= i;
        }

        combi = factm / (factn * factnm);
        System.out.println("El numero combinatorio es de " + combi);
    }
 
    
}
