
package ej93;

/**
 *
 * @author EPIKO
 */
public class Camioneta extends Coche{
    protected int carga;
    
    public Camioneta(String color, int ruedas, int velocidad, int cilindrada, int carga){
        super(color, ruedas, velocidad, cilindrada);
        this.carga=carga;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCarga: " + this.carga + " Kg";
    }
    
}
