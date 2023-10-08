
package ej91;

/**
 *
 * @author EPIKO
 */
public class PCongNitrogeno extends PCongelados {
    private String metododecong;
    private double tiempoexposicionnitrog;
    
    public PCongNitrogeno(String fcad, String fenva, String paisorigen, int nlote, double temperaturarecom){
        super(fcad, fenva, paisorigen, nlote, temperaturarecom);
        this.metododecong=metododecong;
        this.tiempoexposicionnitrog=tiempoexposicionnitrog;
    }

    public String getMetododecong() {
        return metododecong;
    }

    public double getTiempoexposicionnitrog() {
        return tiempoexposicionnitrog;
    }
    
}
