/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej81;

/**
 *
 * @author EPIKO
 */
public class Arma {
    private String name;
    private int rest, pow, lvl;
    

    public Arma(String name, int rest, int pow) {
        this.name=name;
        this.rest=rest;
        this.pow=pow;
        this.lvl=1;
        
        
    }
    public void subirNivel(){
        this.rest+=2;
        this.pow+=3;
        this.lvl++;
        
    }

    public int getPow() {
        return pow;
    }

    public int getRest() {
        return rest;
    }
    
    
    
}
