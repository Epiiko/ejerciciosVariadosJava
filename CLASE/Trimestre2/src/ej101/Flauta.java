
package ej101;

/**
 *
 * @author EPIKO
 */
public class Flauta extends Viento{
    private boolean tipoflauta;
    private String materialleng;
    public Flauta(String marca, int mes, int year, boolean tipo , boolean tipoflauta, String materialleng){
        super(marca, mes, year, tipo);
        this.tipoflauta=tipoflauta;
        this.materialleng=materialleng;
    }

    @Override
    public void afinar(){
        System.out.println("Se ha usado una baqueta para afinar correctamente " + tipoflauta + 
                " con lengueta" + materialleng);
    }
    @Override
    public void pararDeTocar(){
        tocando=false;
    }
    @Override
    public String tocarPartitura(){
          tocando=true;
        String res = "";
        if (!roto) {
            for (int i = 0; i < cancion.getNotas().length; i++) {
                 switch (cancion.getNotas()[i].valor) {
                        case "do":
                            res += "flo ";
                            break;
                        case "re":
                            res += "fle ";
                            break;
                        case "mi":
                            res += "fli ";
                            break;
                        case "fa":
                            res += "fla ";
                            break;
                        case "sol":
                            res += "flon ";
                            break;
                        case "la":
                            res += "flan ";
                            break;
                        case "si":
                            res += "flin ";
                            break;
                    }
                for (int j = 0; j < cancion.getNotas()[i].duracion-1; j++) {
                   res+=" * ";
                }
            }
        }
        return res;
    }
}
