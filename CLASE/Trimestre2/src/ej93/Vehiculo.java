
package ej93;

/**
 *
 * @author EPIKO
 */
public class Vehiculo {
    protected String color;
    protected int nruedas;
    
    public Vehiculo(String color, int ruedas){
        this.color=color;
        this.nruedas=ruedas;
    }
    
    @Override
    public String toString(){
        return "Vehiculo\nColor: " + this.color + "\nNumero de ruedas: " + this.nruedas;
    }
}
