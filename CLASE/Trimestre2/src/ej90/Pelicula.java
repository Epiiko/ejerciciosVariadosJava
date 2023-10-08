
package ej90;

/**
 *
 * @author EPIKO
 */
public class Pelicula extends Multimedia{
    
    private String actor, actriz;
        
    public Pelicula(String titulo, double duracion, String formato, String actor, String actriz){
        super(titulo, duracion, formato);
        this.actor=actor;
        this.actriz=actriz;
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nActriz principal: " + this.actriz + "\nActor principal: " + this.actor;
    }
    
    @Override
    public boolean equals(Object peli2){ 
        if (peli2 instanceof Pelicula) {
        Pelicula p2=(Pelicula)peli2;
        return this.actor.equalsIgnoreCase(p2.actor) && this.equals(peli2) && this.actriz.equalsIgnoreCase(p2.actriz);
        }else{
        return false;
        }
       
    }
            
}
