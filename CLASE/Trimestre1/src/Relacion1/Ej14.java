/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min, seg;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el numero de segundos transcurridos");
        seg=t.nextInt();
        min=(int)Math.ceil(seg/60);
        System.out.println(" El partido se encuentra en el minuto " +  min);
        
    }

}
