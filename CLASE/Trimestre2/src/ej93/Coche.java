
package ej93;

/**
 *
 * @author EPIKO
 */
public class Coche extends Vehiculo {
    protected int velocidad, cilindrada;
    
    
    public Coche(String color, int ruedas, int velocidad, int cilindrada){
        super(color, ruedas);
        this.velocidad=velocidad;
        this.cilindrada=cilindrada;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "\nVelocidad punta: " + this.velocidad + "Km/h\nCilindrada: " 
                + this.cilindrada + "CC";
    }
}
