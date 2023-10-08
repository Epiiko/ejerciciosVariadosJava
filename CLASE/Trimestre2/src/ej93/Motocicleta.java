
package ej93;

/**
 *
 * @author EPIKO
 */
public class Motocicleta extends Bicicleta{
    protected int velocidad, cilindrada;
    
    public Motocicleta(String color, int ruedas, Boolean tipo, int velocidad, int cilindrada){
        super(color, ruedas, tipo);
        this.velocidad=velocidad;
        this.cilindrada=cilindrada;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nVelocidad punta: " + this.velocidad + "Km/h\nCilindrada: " 
                + this.cilindrada + "CC";
    }
}
