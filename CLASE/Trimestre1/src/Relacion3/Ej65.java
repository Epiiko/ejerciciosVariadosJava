/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion3;

import java.util.Scanner;

public class Ej65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        //0=piedra 1=papel 2=tijera
        //0=empate 1=win -1=loose
        int matriz[][] = {{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}}, jugador1, jugador2, vj1=0, vj2=0;
        char seguir;
        String opcion;
        System.out.println("BIENVENIDO AL JUEGO DEL PIEDRA PAPEL O TIJERAS");
        do {            
            
       
        do {
            System.out.println("Introduzca con que desea jugar Jugador 1");
            opcion = t.next();
            if ((!opcion.equalsIgnoreCase("piedra")) && (!opcion.equalsIgnoreCase("papel")) && (!opcion.equalsIgnoreCase("tijeras"))) {
                System.out.println("Error debe introducir PIEDRA PAPEL o TIJERAS");
            }
        } while ((!opcion.equalsIgnoreCase("piedra")) && (!opcion.equalsIgnoreCase("papel")) && (!opcion.equalsIgnoreCase("tijeras")));
        if (opcion.equalsIgnoreCase("piedra")) {
            jugador1 = 0;
        } else if (opcion.equalsIgnoreCase("papel")) {
            jugador1 = 1;
        } else {
            jugador1 = 2;
        }
        //segundo jugador
        do {
            System.out.println("Introduzca con que desea jugar jugador 2 ");
            opcion = t.next();
            if ((!opcion.equalsIgnoreCase("piedra")) && (!opcion.equalsIgnoreCase("papel")) && (!opcion.equalsIgnoreCase("tijeras"))) {
                System.out.println("Error debe introducir PIEDRA PAPEL o TIJERAS");
            }
        } while ((!opcion.equalsIgnoreCase("piedra")) && (!opcion.equalsIgnoreCase("papel")) && (!opcion.equalsIgnoreCase("tijeras")));
        if (opcion.equalsIgnoreCase("piedra")) {
            jugador2 = 0;
        } else if (opcion.equalsIgnoreCase("papel")) {
            jugador2 = 1;
        } else {
            jugador2 = 2;
        }
        switch (matriz[jugador1][jugador2]) {
            case -1:
                System.out.println("El jugador 2 gana");
                vj2++;
                break;
            case 0:
                System.out.println("Empate");
                break;
            case 1:
                System.out.println("El jugador 1 gana");
                vj1++;
                break;
        }   
            System.out.println("El jugador 1 lleva un total de " + vj1 + " victorias");
             System.out.println("El jugador 2 lleva un total de " + vj2 + " victorias");
             if (vj1>vj2) {
                 System.out.println("El jugador 1 va ganando "); 
            }else if (vj2>vj1) {
                 System.out.println("El jugador 2 va ganando");
            }else{
                 System.out.println("Los jugadores van empate");
            }
        do{
            
            System.out.println("¿Desea volver a jugar? (S/N)");
            seguir=t.next().toLowerCase().charAt(0);    
        }while (seguir!='s' && seguir!='n') ;              
         } while (seguir!='s');
    }
}
