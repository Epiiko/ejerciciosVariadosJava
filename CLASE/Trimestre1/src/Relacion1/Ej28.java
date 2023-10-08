/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int dinerotot, b500,b200,b100,b50,b20,b10,b5,m2,m1;
        System.out.println("Cuanto dinero queremos desglosar");
        dinerotot=t.nextInt();
        //billetes 500
        b500=dinerotot/500;
        dinerotot%=500;
        //billetes 200
        b200=dinerotot/200;
        dinerotot%=200;
        //billetes 100
        b100=dinerotot/100;
        dinerotot%=100;
        //billetes 50
        b50=dinerotot/50;
        dinerotot%=50;
        //billetes 20
        b20=dinerotot/20;
        dinerotot%=20;
         //billetes 10
        b10=dinerotot/10;
        dinerotot%=10;
         //billetes 5
        b5=dinerotot/5;
        dinerotot%=5;
         //monedas 2
        m2=dinerotot/2;
        dinerotot%=2;
        m1=dinerotot;
        System.out.println("El desglose obtenido es de .......................... " );
        System.out.println(b500 + " Billetes de 500€");
        System.out.println(b200 + " Billetes de 200€");
        System.out.println(b100 + " Billetes de 100€");
        System.out.println(b50 + " Billetes de 50€");
        System.out.println(b20 + " Billetes de 20€");
        System.out.println(b10 + " Billetes de 10€");
         System.out.println(b5 + " Billetes de 5€");
         System.out.println(m2 + " Monedas de 2€");
         System.out.println(m1 + " Monedas de 1€");
    }

}
