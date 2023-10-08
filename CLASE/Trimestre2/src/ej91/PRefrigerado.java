
package ej91;

/**
 *
 * @author EPIKO
 */
public class PRefrigerado extends Producto{
    private int idsupervisiones;
    private double temprecomendable;
    
    public PRefrigerado(String fcad, String fenva, String paisorigen, int nlote, int idsupervisiones, double temprecoendada){
        super(fcad, fenva, paisorigen, nlote);
        this.idsupervisiones=idsupervisiones;
        this.temprecomendable=temprecoendada;
    }
    @Override
    public String toString(){
        return super.toString()+ "\nCodigo de supervision alimentaria: " + this.idsupervisiones + 
                "\nTemperatura recomendable de conserva: " + this.temprecomendable;
    }

    public int getIdsupervisiones() {
        return idsupervisiones;
    }

    public double getTemprecomendable() {
        return temprecomendable;
    }
    
}
