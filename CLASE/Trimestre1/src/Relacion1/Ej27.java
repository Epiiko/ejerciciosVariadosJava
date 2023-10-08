/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el numero a examinar");
        num=t.nextInt();
        boolean c1,c2,c3;
        c1=num>999&&num<=9999;
        c2=(num%10000)>=1&&(num%10000<=8);
        c3=(num%10)==((num%1000)*10)+(num%100)/(num%10000);
        //if ((num>999&&num<=9999) && ((num%10000)>=1&&(num%10000<=8);) &&((num%10)==((num%1000)*10)+(num%100)/(num%10000);) ) {
        // }
        if ( c1 && c2 && c3) {
            System.out.println("El numero es valido");
        }else{
            System.out.println("El numero no es valido");
        }
    }

}
