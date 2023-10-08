package ej92;

/**
 *
 * @author EPIKO
 */
public class ProfeUniversidad extends Profesor {

    private boolean investigando;
    private int hinvestigacion;

    public ProfeUniversidad(String nombre, int numeromax, int numeroimpartida, int hinvestigacion) {
        super(nombre, numeromax, numeroimpartida);
        if (super.horastotales > 18) {
            this.hinvestigacion = hinvestigacion;
        } else {
            this.hinvestigacion = 0;
        }
    }

    public void investigar() {
        if (hinvestigacion == 0 || super.dandoclase) {
            System.out.println("El profesor no puede investigar");
        } else {
            System.out.println("El profesor empieza a investigando");
            this.investigando = true;
        }
    }

    private void recalcularHTotales() { //Para recorrer el array y sumar las horas
        horastotales = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null) {
                horastotales += asignaturas[i].getNhorassemana();
            }
        }
        if (checkPuedeInvestigar()) {
            hinvestigacion = 20;
        }

    }

    public boolean checkPuedeInvestigar() {
        return super.horastotales > 18;

    }

    public void pararInvestigar() {
        if (this.investigando) {
            System.out.println("El profesor ha parado de investigar");
            this.investigando = false;
        } else {
            System.out.println("El profesor ya esta parado");
        }
    }

    public String toString() {
        return super.toString() + "El profesor " + (super.dandoclase ? "si" : "no") + " esta dando clase\nEl profesor " + (investigando? "si" : "no") + " esta investigando";
    }
}
