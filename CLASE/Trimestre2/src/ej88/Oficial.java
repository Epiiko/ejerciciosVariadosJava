
package ej88;

/**
 *
 * @author EPIKO
 */
public class Oficial extends  Operario{
    public Oficial(String name, int id){
        super(name, id);
    }
    
    public String toString(){
        return "Soy el oficial " + super.getNombre() + " con el código " + super.getIdtrabajador();
    }
}
