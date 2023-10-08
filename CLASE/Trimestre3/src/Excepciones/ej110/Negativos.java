
package Excepciones.ej110;

/**
 *
 * @author EPIKO
 */
public class Negativos extends RuntimeException{
    public Negativos(){
        super();
    }
    public Negativos(String excepcion){
        super(excepcion);
    }
}
