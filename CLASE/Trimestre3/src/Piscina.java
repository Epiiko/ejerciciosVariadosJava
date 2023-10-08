
public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) {
        if (cantidad>nivel) {
            throw new ArithmeticException("No puede anadir mas agua a la piscina de la que entra");
        }
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) {
         if (cantidad+nivel>MAXNIVEL) {
            throw new ArithmeticException("No puede retirar mas agua de la que hay en la piscina");
        }
        this.nivel += cantidad;
        
    }
}
