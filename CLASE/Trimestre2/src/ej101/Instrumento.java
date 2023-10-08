package ej101;

/**
 *
 * @author EPIKO
 */
public abstract class Instrumento {

    protected String marca;
    protected int mes, year;
    protected Partitura cancion;
    protected boolean tocando;
    protected boolean roto;

    public Instrumento(String marca, int mes, int year, Partitura cancion) {
        this.marca = marca;
        this.mes = mes;
        this.year = year;
        this.cancion = cancion;
        this.tocando = false;
        this.roto=false;
    }

    public Instrumento(String marca, int mes, int year) {
        this.tocando = false;
        this.marca = marca;
        this.mes = mes;
        this.year = year;
        this.roto=false;
        this.cancion = new Partitura("desconocido", "desconocido");
        for (int i = 0; i < cancion.getNotas().length; i++) {
            cancion.getNotas()[i] = null;
        }
        int ale = (int) (Math.random() * 100 + 1); // para el numero de notas a crear
        String valor = "";//Para la salida del switch en cadena
        for (int i = 0; i < ale; i++) {
            int notaale = (int) (Math.random() * 7 + 1);// para el valor de nota a crear
            int durale = (int) (Math.random() * 5 + 1);// para la duracion de nota a crear
            switch (notaale) {
                case 1:
                    valor = "do";
                    break;
                case 2:
                    valor = "re";
                    break;
                case 3:
                    valor = "mi";
                    break;
                case 4:
                    valor = "fa";
                    break;
                case 5:
                    valor = "sol";
                    break;
                case 6:
                    valor = "la";
                    break;
                case 7:
                    valor = "si";
                    break;
            }
            cancion.addNota(valor, durale);
        }

    }

    public boolean addNota() {
        int notaale = (int) (Math.random() * 7 + 1);// para el valor de nota a crear
        int durale = (int) (Math.random() * 5 + 1);// para la duracion de nota a crear
        String valor="";
        switch (notaale) {
            case 1:
                valor = "do";
                break;
            case 2:
                valor = "re";
                break;
            case 3:
                valor = "mi";
                break;
            case 4:
                valor = "fa";
                break;
            case 5:
                valor = "sol";
                break;
            case 6:
                valor = "la";
                break;
            case 7:
                valor = "si";
                break;
        }
        for (int i = 0; i < cancion.getNotas().length; i++) {
            if (cancion.getNotas()[i] == null) {
                cancion.addNota(valor, durale);
                return true;
            }
        }
        return false;
    }
    public abstract String tocarPartitura();
    public abstract  void  pararDeTocar();
}
