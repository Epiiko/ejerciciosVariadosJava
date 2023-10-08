/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el numero a examinar : ");
        num=t.nextInt();
        boolean con1, con2;
        con1=num%2==0;
        con2=(num>=10000)&&(num<100000);
        if ( con1 && con2) {
            System.out.println("Es par y tiene 5 cifras");
        }else if(con1){
            System.out.println("El numero es par");
        }else if(con2){
            System.out.println("Tiene 5 cifras");
        }
    }
}
