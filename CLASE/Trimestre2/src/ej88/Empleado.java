
package ej88;

import java.beans.beancontext.BeanContextMembershipEvent;

/**
 *
 * @author EPIKO
 */
public class Empleado {
    private String nombre;
    
    public Empleado(String name){
    this.nombre=name;
}
    
    public String toString(){
        return "Soy el empleado " + this.nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
