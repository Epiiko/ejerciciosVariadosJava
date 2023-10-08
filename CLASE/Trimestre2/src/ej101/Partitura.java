package ej101;

/**
 *
 * @author EPIKO
 */
public class Partitura {

    String nombre;
    String autor;
    private Nota notas[];

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.notas = new Nota[100];
        for (int i = 0; i < this.notas.length; i++) {
            this.notas[i] = null;
        }
    }
    public Partitura(){
          
    }

    public int numNotas() {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean addNota(String valor, int duracion) {
        boolean added = false; // la inicializamos en falso y nos sirve para controlar la colocacion de la nota
        for (int i = 0; i<notas.length &&!added ; i++) {
            if (notas[i] == null) {
                notas[i] = new Nota(valor, duracion);
                added = true;
            }
        }
        return added;
    }

    public String toString() {
        String res = "Nombre de la partitura: " + nombre + " ------> Autor: " + autor + "\n";
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != null) {
                  if (i % 10 == 0 && i!=0) {
                    res += "\n";
                }
                res+=notas[i] + " ";  
            }
        }
        return res;
    }

    public Nota[] getNotas() {
        return notas;
    }
    
}
