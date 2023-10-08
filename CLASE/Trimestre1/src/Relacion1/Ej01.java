/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        String nombre,dni,fecha;
        System.out.println("Introduzca su nombre:  ");
        nombre=t.nextLine();
        System.out.println("Introduzca su DNI:  ");
        dni=t.nextLine();
        System.out.println("Introduzca su fecha de nacimiento siguiendo este modelo dd/mm/aaaa:  ");
        fecha=t.nextLine();
        System.out.println("Nombre-------------------------------" + nombre);
        System.out.println("DNI-----------------------------------" + dni);
        System.out.println("Fecha---------------------------------" + fecha);
    }

}
