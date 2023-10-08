/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion1;

import java.util.Scanner;

public class Ej04 {

    private double valor[];
    private Scanner t;

    public void cargardatos() {
        t = new Scanner(System.in);
        valor = new double[2];
        for (int f = 0;  2 > f ; f++) {
            System.out.print("Introduzca el valor " +( f+1));
            valor[f] = t.nextDouble();
        }
    }

    public void calculoa() {
        double totcac = valor[1] / valor[2] * (valor[1] - valor[2]);
        System.out.println("El calculo de a es " + totcac);
    }

    public void calculob() {
        double tot = 12.3 / valor[1] + 5 - valor[2] + 9;
        System.out.println("El calculo de b es " + tot);
    }

    public void calculoc() {
        double tot = valor[1] * 2048 / valor[2] * 1024 - Math.pow(valor[1], valor[2]);
        System.out.println("El calculo de c es " + tot);
    }

    public void calculod() {
        double tot = Math.pow((3203 / valor[1] - valor[2]), valor[2]) / (Math.pow(valor[2], 2) * Math.pow(valor[1], 3));
        System.out.println("El calculo de d es " + tot);
    }

    public static void main(String[] args) {
        Ej04 puta;
        puta = new Ej04();
        puta.cargardatos();
        puta.calculoa();
        puta.calculob();
        puta.calculoc();
        puta.calculod();
    }

}
