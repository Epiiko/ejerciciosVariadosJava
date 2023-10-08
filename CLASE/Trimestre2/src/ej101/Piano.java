package ej101;

/**
 *
 * @author EPIKO
 */
public class Piano extends Cuerda {

    private String tipo;
    private int nteclas;

    public Piano(String marca, int mes, int year, int numcuerdas, boolean percutida, String tipo, int nteclas) {
        super(marca, mes, year, numcuerdas, percutida);
        this.tipo = tipo;
        this.nteclas = nteclas;
    }
    public void afinar(){
        System.out.println("Se han tensado correctamente las " + nteclas + "del piano");
    }
    public void pararDeTocar(){
        tocando=false;
    }

    @Override
    public String tocarPartitura() {
        tocando=true;
        String res = "";
        if (!roto) {
            for (int i = 0; i < cancion.getNotas().length; i++) {
                for (int j = 0; j < cancion.getNotas()[i].duracion; j++) {
                    switch (cancion.getNotas()[i].valor) {
                        case "do":
                            res += "ton ";
                            break;
                        case "re":
                            res += "ten ";
                            break;
                        case "mi":
                            res += "tin ";
                            break;
                        case "fa":
                            res += "tan ";
                            break;
                        case "sol":
                            res += "tun ";
                            break;
                        case "la":
                            res += "tean ";
                            break;
                        case "si":
                            res += "tain ";
                            break;
                    }
                }
            }
        }
        return res;
    }
}
