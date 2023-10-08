/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        String c1,c2;
        System.out.println("Introduzca la clave");
        c1=t.nextLine();
        System.out.println("Introduzca la clave de nuevo");
        c2=t.nextLine();
        if (c1.equals(c2)) {
            System.out.println("Las claves son iguales");
        }else{
            System.err.println("Las claves son distintas");
        }
    }

}
