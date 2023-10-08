/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int nota[], notaveri,mayor=0;
        nota = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca la nota  " + (i+1));
            notaveri = t.nextInt();
            if (notaveri < 0) {
                do {
                    System.out.println("Error Introduzca la nota  " + (i+1) + " de nuevo ");
                    notaveri = t.nextInt();
                   
                } while (notaveri < 0);

            }
            nota[i] = notaveri;
            if (notaveri>mayor) {
                mayor=notaveri;
            }
            

        }
        System.out.println("El numero mayor de las notas es :" + mayor);
        
    }

}
