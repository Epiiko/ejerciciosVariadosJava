/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion2;

import java.util.Scanner;


public class Ej36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num, suma = 0, menore = 0, mayores = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el valor ");
            num = t.nextInt();
            if (num > 36) {
                mayores += num;
            } else if (num < 10) {
                menore += num;
            }
            suma += num;
        }
        if (mayores == 0) {
            System.out.println("No habia valores mayores de 36");
        }else{
            System.out.println("La suma de los mayores es de :" + mayores);
        }
        if (menore==0) {
            System.out.println("No habia valores menores de 10");
        }else{
            System.out.println("La suma de los menores es de : " + menore);
        }
        System.out.println("La suma de todos los valores es de : " + suma);
    }
    
}
