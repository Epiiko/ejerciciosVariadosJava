
package ej101;

/**
 *
 * @author EPIKO
 */
public abstract class Viento extends Instrumento {
    
    protected boolean tipo;//true viento o madera

    public Viento(String marca, int mes, int year, boolean tipo) {
        super(marca, mes, year);
        this.tipo=tipo;
    }


    @Override
    public abstract String tocarPartitura();
    @Override
    public abstract void pararDeTocar();
    public abstract void afinar();
}
