/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c, disc, res1, res2;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el valor de A ");
        a=t.nextDouble();
        System.out.println("Introduzca el valor de B ");
        b=t.nextDouble();
        System.out.println("Introduzca el valor de C ");
        c=t.nextDouble();
        disc=(Math.pow(b, 2))-4*a*c;
        if (disc<0) {
            System.out.println("No hay solucion");
        }else if (disc==0) {
            System.out.println("El resultado" + (-b)/2*a);
        }else if (disc>0) {
            System.out.println("El resultado de la raiz positiva es " + (((-b)+Math.sqrt(disc))/(2*a)));
           System.out.println("El resultado de la raiz negativa es " + (((-b)-Math.sqrt(disc))/(2*a)));
        }
        
        
    }

}
