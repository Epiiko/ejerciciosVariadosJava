package ej68;

/**
 *
 * @author EPIKO
 */
public class Cafetera {

    private final int capacidadMax = 1000;
    private int cantidadActual;

    public Cafetera() {
        this.cantidadActual = 0;
    }

    public String echarCafe(int repostar) {
        String res = "";
        if (repostar < 0) {
            res += "No bebas de la cafetera animal";
        } else {
            if (repostar + this.cantidadActual > this.capacidadMax) {
                res += "Te has pasado a ver quien friega ahora esto";
                this.cantidadActual = this.capacidadMax;
            } else {
                this.cantidadActual += repostar;
                res += ".......Llenando cafetera..........";
            }

        }
        return res;
    }
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMax;
    }
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    public String servirTaza(int taza){
        String res="";
        if (this.cantidadActual>=taza) {
            res+="..........Sirviendo taza de cafe.............";
            this.cantidadActual-=taza;
        }else{
            res+="No hay suficiente agua en la cafetera";
        }
        return res;
    }
    public String cantidadCafe(){
        return "Queda " + this.cantidadActual + " cc de cafe en la cafetera";
    }
}
