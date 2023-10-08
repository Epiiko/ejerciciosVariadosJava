package ej101;

/**
 *
 * @author EPIKO
 */
public abstract class Cuerda extends Instrumento {

    protected int numcuerdas;
    protected boolean percutida;//true percutida o pulsada

    public Cuerda(String marca, int mes, int year, int numcuerdas, boolean percutida) {
        super(marca, mes, year);
        this.numcuerdas = numcuerdas;
        this.percutida = percutida;
    }


    @Override
    public abstract String tocarPartitura();
    @Override
    public abstract void pararDeTocar();
    public abstract void afinar();
}
