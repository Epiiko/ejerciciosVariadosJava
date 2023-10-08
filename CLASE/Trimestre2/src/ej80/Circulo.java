/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej80;

/**
 *
 * @author EPIKO
 */
public class Circulo {
     private int radio;
     private Punto centro;
    
    public Circulo(Punto pc, int radio){
        this.radio=radio;
        this.centro=pc;
        
        
    }
    
    public double calcularPerimetro(){
        return 2*Math. PI*this.radio;
    }
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    public String toString(){
        return "[ " + this.centro.toString() + this.radio + " ]" ;
    }
    public void transladar(int a, int b){
        this.centro.trasladar(a, b);
        
    }

    public int getRadio() {
        return radio;
    }
            
}
