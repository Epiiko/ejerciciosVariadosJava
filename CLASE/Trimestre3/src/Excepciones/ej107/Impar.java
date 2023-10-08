
package Excepciones.ej107;

/**
 *
 * @author EPIKO
 */
public class Impar {
    private int entero;
    public Impar(int entero){
        if (entero%2==0) {
            throw new ArithmeticException("El numero introducido es par");
        }else{
            this.entero=entero;
        }
    }
    @Override
    public String toString() {
        return "Contiene" + entero;
    }
}
