
package ej88;

/**
 *
 * @author EPIKO
 */
public class Tecnico extends Operario{
    public Tecnico(String name, int id){
        super(name, id);
    }
    
    public String toString(){
        return "Soy el oficial " + super.getNombre() + " con el código " + super.getIdtrabajador();
        
    }
}
