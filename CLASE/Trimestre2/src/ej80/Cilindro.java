/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej80;

/**
 *
 * @author EPIKO
 */
public class Cilindro {

    private int altura;
    private Circulo base;

    public Cilindro(int altura, Circulo base) {
        this.base = base;
        this.altura = altura;
         
    
}
    public double volumen() {
        return Math.PI * Math.pow(base.getRadio(), 2)*this.altura;
    }

}
