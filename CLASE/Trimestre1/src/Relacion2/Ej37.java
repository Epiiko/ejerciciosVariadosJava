/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num, i = 1, ultima=0, primera=0;//k e i para contador de posiciones la i para la primera posicion y la k para la segunda
        boolean primeraposi = false;
        do {
            System.out.println("Introduzca el número " + i);
            num = t.nextInt();
            if (num == 12) {
                ultima = i;
                if(!primeraposi){
                primera = i;
                primeraposi = true; 
                }  
            }
            i++;
        } while (num != 0);
        System.out.println("La primera posicion es " + primera);
        System.out.println("La segunda posi es " + ultima);
    }

}
