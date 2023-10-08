package ej91;

/**
 *
 * @author EPIKO
 */
public class PCongAgua extends PCongelados{

    private double sal, agua;

    public PCongAgua(String fcad, String fenva, String paisorigen, int nlote, double temperaturarecom, double sal, double agua){
        super(fcad, fenva, paisorigen, nlote, temperaturarecom);
        this.sal=sal;
        this.agua=agua;
    }
    
    public String toString(){
        return super.toString() + "\nHa sido congelado con una salinidad de\n"
                +this.sal+ " gr de sal por cada " + this.agua + " L de agua";
    }

    public double getSal() {
        return sal;
    }

    public double getAgua() {
        return agua;
    }
    
}
