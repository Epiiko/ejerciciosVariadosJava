
import java.util.InputMismatchException;
import java.util.Scanner;

public class ej102 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        String cad = "";
        boolean checked = true;
        System.out.println("Introduzca una cadena");
        cad = t.nextLine();
        do {
            try {
                checked = true;

                System.out.println("Introduzca un numero para ver el caracter en esa posicion");
                num = t.nextInt();
                System.out.println("El caracter " + cad.charAt(num) + " se encuentra en la posicion " + num);

            } catch (InputMismatchException e) {
                System.out.println("Para saber la posicion ha de ser un numero");
                t.nextLine();
                checked = false;

            } catch (IndexOutOfBoundsException e) {
                System.out.println("El numero ha de ser positivo e inferior al numero de caracteres");
                checked = false;
                t.nextLine();
            }

        } while ((num < 0 || num > cad.length() - 1) || !checked);

        t.close();
    }

}
