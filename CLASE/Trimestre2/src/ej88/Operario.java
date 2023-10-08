
package ej88;

/**
 *
 * @author EPIKO
 */
public class Operario extends Empleado{
    private int idtrabajador;
    
    public Operario(String name, int id){
        super(name);
        this.idtrabajador=id;
    }
    
    public String toString(){
        return "Soy el operario " + super.getNombre() + " con el código " + this.idtrabajador;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }
    
}
