package ej88;

/**
 *
 * @author EPIKO
 */
public class Directivo extends Empleado {

    public Directivo(String name) {
        super(name);
    }

    @Override
    public String toString() {
       return "Soy " + super.getNombre() + " driectivo de la empresa";
               }
    
    
}
