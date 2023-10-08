
package ej90;

/**
 *
 * @author EPIKO
 */
public class Cancion extends Multimedia {
   private String artista, editor , genero;
   
    
    public Cancion(String titulo, double duracion, String formato, String genero){
        super(titulo, duracion, formato);
        this.artista=artista;
        this.editor=editor;
        if (genero.equals("pop") || genero.equalsIgnoreCase("flamenco") || genero.equalsIgnoreCase("hiphop")|| genero.equalsIgnoreCase("r&b") || genero.equalsIgnoreCase("reggaeton")) {
            this.genero=genero;
        }else{
            this.genero="rock";
        }
        
    }

    public String getArtista() {
        return artista;
    }

    public String getEditor() {
        return editor;
    }

    public String getGenero() {
        return genero;
    }
    
   @Override
    public String toString(){
        return super.toString()+ "\nArtista: " + this.artista + "\nEditor: " + this.editor + "\nGenero: " + this.genero;
    }
}
