
package ej91;

/**
 *
 * @author EPIKO
 */
public class PCongelados extends Producto{
    private double temperaturarecom;
    
    public PCongelados(String fcad, String fenva, String paisorigen, int nlote, double temperaturarecom){
        super(fcad, fenva, paisorigen, nlote);
        this.temperaturarecom=temperaturarecom;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTemperatura recomendada de conservacion: " + this.temperaturarecom;
    }

    public double getTemperaturarecom() {
        return temperaturarecom;
    }
    
}
