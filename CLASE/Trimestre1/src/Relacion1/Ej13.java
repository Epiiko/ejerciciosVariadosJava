/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado1, lado2, lbaldosa, preciob, preciot, areah, areab, cantb;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca la longitud del primer lado de la habitacion en m  ");
        lado1=t.nextDouble();
        System.out.println("Introduzca la longitud del segundo lado de la habitacion en m  ");
        lado2=t.nextDouble();
        System.out.println("Introduzca la longitud del lado de la baldosa ");
        lbaldosa=t.nextDouble();
        System.out.println("Introduzca el precio de la baldosa  ");
        preciob=t.nextDouble();
        areah=lado1*lado2;
        areab=Math.pow(lbaldosa, 2);
        cantb=(int) (Math.ceil(areah/areab));
        preciot=cantb*preciob;
        System.out.println("En la habitacion introducida de un area total de  " + areah + " cm entran " + cantb + " baldosas con un area de " + areab);
        System.out.println("Si cada baldosa vale " + preciob + " € el total a pagar seria " + preciot + " € ");
        
        
        
        
        
        
    }

}
