/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej82;

/**
 *
 * @author EPIKO
 */
public class Estrella {

    private int x, y;
    private String forma;

    public Estrella(int x, int y) {
        this.x = x;
        this.y = y;
        int aleatorio = (int) (Math.random() * 4);            
        if (aleatorio == 1) {
            this.forma = "*";
        } else {
            this.forma = ".";
        }
    }

    public String toString() {
        return forma;
    }

}
