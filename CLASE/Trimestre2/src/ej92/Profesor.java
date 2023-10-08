package ej92;

/**
 *
 * @author EPIKO
 */
public class Profesor {

    private String nombre;
    protected boolean dandoclase;
    protected Asignatura asignaturas[];
    protected int horastotales, asignaturasmax;

    public Profesor(String nombre, int numeromax, int numeroimpartida) {
        int nal, hal;
        this.nombre = nombre;
        this.asignaturas = new Asignatura[numeromax];
        this.horastotales = 0;
        this.asignaturasmax = numeromax;
        this.dandoclase = false;
        for (int i = 0; i < numeromax; i++) {
            nal /*numero aleatorio de asignaturas que esta impartiendo*/ = (int) (Math.random() * numeromax + 1);
            hal /*numero aleatorio de horas que esta impartiendo*/ = (int) (Math.random() * 5 + 3);
            this.asignaturas[i] = new Asignatura(hal, nal);
            if (this.asignaturas[i] != null) {
                this.horastotales += this.asignaturas[i].getNhorassemana();
            }

        }

    }

    public void empezarClase() {
        if (!dandoclase) {
            this.dandoclase = true;
            System.out.println(this.nombre + " Esta dando la clase de " + this.asignaturas[(int) (Math.random() * this.asignaturas.length + 1)]);
        } else {
            System.out.println(this.nombre + "Ya esta impartiendo clase");
        }
    }

    public void pararClase() {
        if (dandoclase) {
            this.dandoclase = false;
            System.out.println(this.nombre + "Ha dejado de impartir clase");
        } else {
            System.out.println("El profesor esta con un cafe en la sala de profesores");
        }
    }

    public void cogerAsignatura(Asignatura nueva) {
        int nal, hal;//Para saber las horas y el codigo de la asig de manera aleatoria
        int cont = 0;//para saber si quedan huecos en el array de Asignaturas
        if (this.horastotales + nueva.getNhorassemana() > 25) {
            System.out.println("El profesor ya tiene el cupo de horas completo");
        } else {
            for (int i = 0; i < this.asignaturas.length; i++) {
                if (this.asignaturas[i] == null) {
                    this.asignaturas[i] = nueva;
                } else {
                    cont++;
                }
            }
            if (cont == this.asignaturas.length) {
                System.out.println("El profesor tiene el numero maximo de asignaturas");
            }
        }
        this.recalcularHTotales();
    }

    public void abandonarAsignatura() {
        for (int i = asignaturas.length - 1; i >= 0; i++) {
            if (asignaturas[i] != null) {
                System.out.println("El profesor ha abandonado " + asignaturas[i]);
                asignaturas[i] = null;
                this.recalcularHTotales();
                return;
            }
        }
        System.out.println("El profesor esta literalmente en paro");
        this.recalcularHTotales();
    }

    private void recalcularHTotales() { //Para recorrer el array y sumar las horas
        this.horastotales = 0;
        for (int i = 0; i < this.asignaturas.length; i++) {
            if (this.asignaturas[i] != null) {
                this.horastotales += this.asignaturas[i].getNhorassemana();
            }
        }
    }

    public String toString() {
        String res = "";
        res += "Ficha del profesor\nNombre: " + this.nombre + "\nNumero de asignaturas maximas: " + this.asignaturasmax;
        res += "\nHoras totales ocupadas: " + this.horastotales;
        if (dandoclase) {
            res += "\nActualmente esta dando clase";
        } else {
            res += "\nActualmente esta en la sala de profesores\nAsignaturas que imparte: ";
        }
        for (int i = 0; i < this.asignaturas.length; i++) {
            if (this.asignaturas[i] != null) {
                System.out.println(this.asignaturas[i] + " ");
            }
        }
        return res;
    }

}
