/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej83;


/**
 *
 * @author EPIKO
 */
public class Revolver {

    private String marca, modelo;
    private Bala tambor[];
    private int martillo;

    public Revolver(String name, String model, int tamano) {
        this.marca = name;
        this.modelo = model;
        this.tambor = new Bala[tamano];
        this.martillo = 0;
        for (int i = 0; i < this.tambor.length; i++) { // para crear 9mm 
            this.tambor[i] = new Bala();
        }
        for (int i = 0; i < this.tambor.length; i++) { //para crear 20mm 70 mm
            this.tambor[i] = new Bala((int) (Math.random() * 15 + 5), (int) (Math.random() * 50 + 20));
        }

    }

    public String disparar() {
        String res;
        if (this.tambor[martillo] != null) {
             res=this.tambor[martillo].toString();
            this.tambor[martillo]=null;     
        } else {
            res="No hay bala";       
        }
        if (martillo < this.tambor.length - 1) { // percute y pasa al siguiente
            martillo++;
        } else {
            martillo = 0;
        }
        return res;
    }
    public void moverTambor(){
         if (martillo < this.tambor.length - 1) { // percute y pasa al siguiente
            martillo++;
        } else {
            martillo = 0;
        
        }
    }
    public String toString (){
        String res="El arma es un : " + this.marca +" " +this.modelo + "\nTamaño del tambor: " + this.tambor.length;
        res+= " \nCargador: \n" ;
        for (int i = 0; i < this.tambor.length; i++) {
            if (this.tambor[i]==null) {
                res+="Rodel vacio \n" ;
            }else{
            this.tambor[i].toString();
            res+="\n";
            }
        }
        return res;
    }
}
