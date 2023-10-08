/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej87;

/**
 *
 * @author EPIKO
 */
public class Jugador {
    private String nombre;
    private boolean vivo;
    
    public Jugador(String name){
        this.nombre=name;
        this.vivo=true;
    }
    public void disparar(Revolver pipa){
        this.vivo=!pipa.disparar();
    }
    public String toString(){
        String res="";
        if (vivo) {
            res="El jugador " + this.nombre + " sigue con vida";
        }else{
            res="El jugador " + this.nombre + " casco";
            
        }
        return res;
    }

    public boolean isVivo() {
        return vivo;
    }
    
}
