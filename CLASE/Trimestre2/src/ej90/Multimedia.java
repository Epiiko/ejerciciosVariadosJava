
package ej90;

/**
 *
 * @author EPIKO
 */
public class Multimedia {
    private String titulo, formato;
    private double duracion;
    
    
    public Multimedia(String titulo, double duracion, String formato){
        this.titulo=titulo;
        this.duracion=duracion;
        if (formato.equalsIgnoreCase("wav") || formato.equalsIgnoreCase("aac")|| formato.equalsIgnoreCase("mp4")||formato.equalsIgnoreCase("mkv")
                || formato.equalsIgnoreCase("mov")|| formato.equalsIgnoreCase("flv")) {
            this.formato=formato;
        }else{
            this.formato="mp3";
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }
    

    @Override
    public String toString() {
        return "Archivo multimedia: \nTitulo: " + this.titulo + " \nFormato: " + this.formato + "\nDuracion: " + this.duracion;
    }
    
    public boolean equals(Multimedia pista2){
        return this.formato.equalsIgnoreCase(pista2.formato) && this.duracion==pista2.duracion;
    }
    
    
}
