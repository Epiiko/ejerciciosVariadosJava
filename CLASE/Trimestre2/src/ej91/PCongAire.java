
package ej91;

/**
 *
 * @author EPIKO
 */
public class PCongAire extends PCongelados{
    private double nitro, oxigeno, dioxido;
    
    
    public PCongAire(String fcad, String fenva, String paisorigen, int nlote, double temperaturarecom){
        super(fcad, fenva, paisorigen, nlote, temperaturarecom);
        this.nitro=nitro;
        this.oxigeno=oxigeno;
        this.dioxido=dioxido;
    }
    
    public String toString(){
        return super.toString()+ "\n Fue congelado mediante un \n" + this.nitro +"% de nitrogeno" + 
                this.oxigeno+ "\n% de oxigeno y " + this.dioxido + "% de dioxido de carbono" ;
    }

    public double getNitro() {
        return nitro;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public double getDioxido() {
        return dioxido;
    }
    
}
