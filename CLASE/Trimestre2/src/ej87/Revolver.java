/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej87;

import ej83.Bala;

/**
 *
 * @author EPIKO
 */
public class Revolver {

    private Bala tambor[];
    private int martillo;
    private int pBala;

    public Revolver(String name, String model, int tamano) {
        this.tambor = new Bala[tamano];
        this.martillo = (int) (Math.random() * tamano);
        this.pBala=(int) (Math.random() * tamano);
        this.tambor[this.pBala] = new Bala();  
    }
    public Boolean disparar(){
        boolean succes=this.martillo==this.pBala;
        this.moverTambor();
        return succes;    
    }
    public void moverTambor(){
        martillo=(martillo+1)%this.tambor.length;
    }
    public String toString(){
        String res="Posicion de la bala :" + pBala + "\nPosicion del martillo " + martillo;
        
        return res;
    }

}
