/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej68;


public class testCafe {

    public static void main(String[] args) {
        Cafetera c1=new Cafetera();
        c1.llenarCafetera();
        c1.vaciarCafetera();
        System.out.println(c1.servirTaza(15));
        System.out.println(c1.echarCafe(100));
        System.out.println(c1.servirTaza(99));
        c1.llenarCafetera();
        System.out.println(c1.servirTaza(1000));
    }
}
