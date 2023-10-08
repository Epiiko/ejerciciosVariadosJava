/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;

public class Ej29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min, seg;
        Scanner t = new Scanner(System.in);
        do {
            System.out.println("Introduzca el numero de segundos transcurridos para salir introduzca un valor negativo");
            seg = t.nextInt();
            if (seg>5400) {
                System.out.println("Error los segundos no pueden ser mayores a 5400");
            }else if (seg>0){
            min = (int) Math.ceil(seg / 60);
            System.out.println(" El partido se encuentra en el minuto " + min);
            }
        } while (seg>0);
    }

}
