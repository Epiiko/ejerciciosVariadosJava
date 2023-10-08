package ej91;

/**
 *
 * @author EPIKO
 */
public class Producto {

    private String fcad, fenva, paisorigen; // fcad fecha caducidad y fenva fecha de envasado
    private int nlote;

    public Producto(String fcad, String fenva, String paisorigen, int nlote) {
        this.fcad = fcad;
        this.fenva = fenva;
        this.paisorigen = paisorigen;
        this.nlote = nlote;
    }

    @Override
    public String toString() {
        return "------------------------------Caracteristicas del producto------------------------------------\n"
                + "Fecha de cadudcidad: " + this.fcad + "\nNumero de lote: " + this.nlote
                + "\nFecha de envasado: " + this.fenva + "\nPais de origen: " + this.paisorigen;

    }

    public String getFcad() {
        return fcad;
    }

    public String getFenva() {
        return fenva;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public int getNlote() {
        return nlote;
    }
    
}
