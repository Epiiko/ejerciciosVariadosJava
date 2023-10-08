
package ejCartas;

/**
 *
 * @author EPIKO
 */
public class Carta {

    public enum paloenum {
        DIAMANTES, CORAZONES, PICAS, TREBOLES
    }

    public enum numerocarta {
        AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), J(10), Q(11), K(12);
        public final int valor;

        numerocarta(int valorcin) {
            this.valor = valorcin;
        }
    }
    private numerocarta naipe;
    private paloenum palitroque;
    private int num;
    private String palo;

    public Carta() {//Para sacar cartas aleatorias
        this.num = (int) (Math.random() * 12 + 1);
        int paloselct = (int) (Math.random() * 4 + 1);
        switch (paloselct) {
            case 1:
                this.palo = "Diamantes";
                break;
            case 2:
                this.palo = "Corazones";
                break;
            case 3:
                this.palo = "Picas";
                break;
            case 4:
                this.palo = "Treboles";
                break;

        }

    }

    public Carta(paloenum palaso, numerocarta rango) {
        this.naipe = rango;
        this.palitroque = palaso;
    }

    public String toString() {
        String res = "[";
        if (this.naipe.valor == 1 || this.naipe.valor > 9) {
            res += this.naipe;
        } else {
            res += this.naipe.valor;
        }
        res += " - ";
        switch (palitroque) {
            case DIAMANTES:
                res += "\u2666";
                break;
            case TREBOLES:
                res += "\u2663";
                break;
            case PICAS:
                res += "\u2660";
                break;
            case CORAZONES:
                res += "\u2665";
                break;
        }
        res += "]";
        return res;
    }
}
