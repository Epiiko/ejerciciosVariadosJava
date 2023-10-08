/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej80;

/**
 *
 * @author EPIKO
 */
public class Punto {
    private int x=0, y=0;
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void trasladar(int a, int b){
        this.x+=a;
        this.y+=b;
    }
    public String toString(){
        String res= "(" + this.x+" ,"+this.y + ")";
        return res;
        
    }
}
