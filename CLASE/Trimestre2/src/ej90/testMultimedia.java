

package ej90;


public class testMultimedia {

    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("PAquito el chocolatero", 2.55,"mkv", "Paco ", "melania");
        Pelicula p2 = new Pelicula("PAquito el chocolatero", 2.55,"mkv", "Paco ", "melania");
        System.out.println(p1);
        if (p1.equals(p2)) {
            System.out.println("SISISISISISISI");
        }
    }

}
