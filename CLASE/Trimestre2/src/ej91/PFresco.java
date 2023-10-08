
package ej91;

/**
 *
 * @author EPIKO
 */
public class PFresco extends Producto{
    private String metodoconser;
    
    public PFresco(String fcad, String fenva, String paisorigen, int nlote, String metodoconser){
        super(fcad, fenva, paisorigen, nlote);
        this.metodoconser=metodoconser;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nMetodo de conserva: " + this.metodoconser; 
    }

    public String getMetodoconser() {
        return metodoconser;
    }
    
}
