package ej66;

/**
 *
 * @author EPIKO
 */
public class Coche {

    private String color;
    private double anchura, altura, npuertas, nruedas;
    private boolean encendido;
    private int gasolina;
    private final int max_Gasolina = 50;

    public Coche(String color, double altura, double npuertas) {
        this.color = color;
        this.altura = altura;
        this.npuertas = npuertas;
        this.nruedas = nruedas;
        this.encendido = false;
        this.gasolina=this.max_Gasolina;
    }

    public String arrancar() {
        String res = "";
        if (this.gasolina < 5) {
            res += "El coche no tiene suficiente gasolina para arrancar";
        } else {
            if (!encendido) {
                res += ".........ARRANCANDO.........";
                this.encendido = true;
                this.gasolina -= 5;
            } else {
                res += "El coche ya esta encendido";
            }
        }
        return res;
    }

    public String apagar() {
        String res = "";
        if (encendido) {
            res += "...........APAGANDO...........";
            this.encendido = false;
        } else {
            res += "El coche ya esta apagado";
        }
        return res;
    }

    public String moverse() {
        String res = "";
        if (this.gasolina >= 20) {
            if (encendido) {
                res += "...........ANDANDO...........";
                this.gasolina -= 20;
            } else {
                res += "El coche no anda apagando";
            }
        } else {
            res += "Al coche le falta caldo";
        }
        return res;
    }

    public String echarGasolina(int gasofa) {
        String res = "";
        if (gasofa > 0) {
            if (!encendido) {
                if (gasofa+this.gasolina > this.max_Gasolina) {
                    res += ".............REPOSTANDO...............\nTe has pasado mostro has tirado " + (gasofa+this.gasolina-this.max_Gasolina) + " que es un picazo";
                    this.gasolina = this.max_Gasolina;
                } else {
                    this.gasolina += gasofa;
                    res += ".............REPOSTANDO...............\nEstado del deposito" + this.gasolina;
                }
            } else {
                res += "El coche debe de estar apagado";
            }
        } else {
            res += "No puede dejar su gasolina en nuestra gasolinera";
        }

        return res;
    }
    public boolean hayGasofa(){
        return this.gasolina>0;
    }
    public void pintar(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", anchura=" + anchura + ", altura=" + altura + ", npuertas=" + npuertas + ", nruedas=" + nruedas + ", encendido=" + encendido + ", gasolina=" + gasolina + ", max_Gasolina=" + max_Gasolina + '}';
    }
    
   
}
