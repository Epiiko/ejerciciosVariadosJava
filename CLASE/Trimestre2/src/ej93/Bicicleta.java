
package ej93;

/**
 *
 * @author EPIKO
 */
public class Bicicleta extends Vehiculo{
    protected Boolean tipo;
        
    public Bicicleta(String color, int ruedas, Boolean tipo){
        super(color, ruedas);
        this.tipo=tipo;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTipo " + (this.tipo?"Deportiva":"Urbana");
    }
}
