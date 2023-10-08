
package Excepciones.ej103;

/**
 *
 * @author EPIKO
 */
public class Excepcion extends RuntimeException{
    public Excepcion(){
        super();
    }
    public Excepcion(String msg){
        super(msg);
    }
    public void mostrar(){
        System.out.println("Programa automatico");
    }
}
