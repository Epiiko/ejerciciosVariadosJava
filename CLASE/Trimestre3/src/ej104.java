
import java.util.InputMismatchException;
import java.util.Scanner;

public class ej104 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int tam = 0;
        double lista[] = null;
        boolean checked = false;
        do {
            try {
                System.out.println("Introduce el tamano de la lista");
                tam = t.nextInt();
                lista = new double[tam];
                checked = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe de ser un valor numerico");
                t.nextLine();
            } catch (NegativeArraySizeException e) {
                System.out.println("El valor no puede ser negativo");
            }
        } while (!checked);
        for (int i = 0; i < lista.length;) {
            try {
                System.out.println("Introduce un valor para la posicion " + i);
                lista[i] = t.nextDouble();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Debe de ser un valor numerico");
                t.nextLine();
            }
        }
    }

}
