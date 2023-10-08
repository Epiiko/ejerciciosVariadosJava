/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trimestre2;

/**
 *
 * @author EPIKO
 */
public class Estudiante {

    private String nombre, apellidos;
    private double notas[];

    public Estudiante(String nombresito, String apell, int calificaciones) {
        this.notas = new double[calificaciones];
        for (int i = 0; i < calificaciones; i++) {
            this.notas[i] = -1;
        }
        this.nombre = nombresito;
        this.apellidos = apell;
    }

    public boolean InsertarNota(double nota) {
        boolean introducido = false;
        for (int i = 0; i < this.notas.length && !introducido; i++) {
            if (this.notas[i] == -1) {
                this.notas[i] = nota;
                introducido = true;
            }
        }
        return introducido;
    }

    public String MostrarNotas() {
        String res = "Las notas del alumno  : ";
        for (int i = 0; i < this.notas.length - 1; i++) {
        res += this.notas[i] + " // ";
        }
        res += this.notas[this.notas.length - 1] + "\n";
        return res;
    }

    public double CalcularMedia() {
        double media = 0;
        int calificadas = 0;
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] != -1) {
                media += this.notas[i];
                calificadas++;
            } else {
                i = this.notas.length;
            }

        }
        media /= calificadas;
        return media;
    }

    public String IndicarRangos() {
        int nocal = 0, insuf = 0, suf = 0, bien = 0, notable = 0, sobresaliente = 0;
        String res = "";
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] == -1) {
                nocal++;
            } else if (this.notas[i] < 5) {
                insuf++;
            } else if (this.notas[i] == 5) {
                suf++;
            } else if (this.notas[i] < 7) {
                bien++;
            } else if (this.notas[i] < 9) {
                notable++;
            } else {
                sobresaliente++;
            }
        }
        res += " No calificado = " + nocal + " insuficientes =  " + insuf + " Suficientes = "
                + suf + " bien =  " + bien + " notable =  " + notable + " sobresaliente =  "
                + sobresaliente + " \n";
        return res;
    }

    public String toString() {
        String res = "";
        res += "Estudiante : " + this.nombre + this.apellidos + " \n";
        res += "Notas " + this.MostrarNotas() + "\n";
        res += "Rangos " + this.IndicarRangos() + "\n";
        res += "Media " + this.CalcularMedia() + " \n";
        return res;
    }

}
