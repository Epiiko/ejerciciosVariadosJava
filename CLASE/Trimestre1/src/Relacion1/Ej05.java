/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int sec, min, hora;
        System.out.println("Introduzca una cantidad de segundos ");
        sec=tec.nextInt();
        hora=sec/3600;
        min=sec%3600/60;
        sec=sec%3600%60;
        System.out.println("Son " + hora + " horas " + min + " minutos " + sec + "segundos");
    }

}
