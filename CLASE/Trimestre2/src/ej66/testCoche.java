/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej66;

import java.time.chrono.ThaiBuddhistEra;

public class testCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1 = new Coche("Rojo", 2.32, 2.12);
        System.out.println(c1.apagar());
        System.out.println(c1.arrancar());
        System.out.println(c1.echarGasolina(10));
        System.out.println(c1.apagar());
        System.out.println(c1.echarGasolina(10));
        System.out.println(c1.moverse());
        System.out.println(c1.arrancar());
        System.out.println(c1.moverse());
        System.out.println(c1.echarGasolina(-1));
    }

}
