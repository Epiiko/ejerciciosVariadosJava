
package ej67;

/**
 *
 * @author EPIKO
 */
public class Punto {
    private int x,y;
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void moverHorizontal(int mover){
        this.x+=mover;
    }
     public void moverVertical(int mover){
        this.y+=mover;
    }
     public String toString(){
         return "Punto: ("+ this.x + " , " + this.y+")";
     }
    
}
