
package ej101;

/**
 *
 * @author EPIKO
 */
public abstract class Percusion extends Instrumento {

    protected boolean baquetas;//true percutida o pulsada

    public Percusion(String marca, int mes, int year, boolean baquetas) {
        super(marca, mes, year);
        this.baquetas=baquetas;
    }


    @Override
    public abstract String tocarPartitura();
    @Override
    public abstract void pararDeTocar();
}
