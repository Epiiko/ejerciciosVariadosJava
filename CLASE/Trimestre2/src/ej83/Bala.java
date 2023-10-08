/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej83;

/**
 *
 * @author EPIKO
 */
public class Bala {
    private double longitud, calibre;
    
    public Bala(){ //crea balas estandar;
        this.longitud=40;
        this.calibre=9;
    }
    public Bala(double longi, double cal){
        this.longitud=longi;
        this.calibre=cal;
    }
    public String toString(){
        String res="Bala de calibre " +this.calibre + "mm y longitud " + this.longitud + "mm";
        return res;
    }
    
}
