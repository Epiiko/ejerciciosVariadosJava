
package ej101;

/**
 *
 * @author EPIKO
 */
public class Nota {
    String valor;
    int duracion;
    
    public Nota(String valor, int duracion){
        this.duracion=duracion;
        this.valor=valor;
    }
    
    public String toString(){
        return "[ " + valor + " , " +  duracion + " ]";
    }
}
