/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej03 {

    private double valor[], suma, media;
    private Scanner t;

    public void cargardatos() {
        t = new Scanner(System.in);
        valor=new double[5];
        for (int x = 0; 5 > x; x++) {
            System.out.print("Introduzca el valor " );
            valor[x] = t.nextInt();
            suma += valor[x];
        }
    }

    public void media() {
        media = suma / 5;
        System.out.println("La media de los 5 numeros es de " + media);
    }

    /**
     * .
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ej03 media1;
        media1= new Ej03();
        media1.cargardatos();
        media1.media();
    }

}
