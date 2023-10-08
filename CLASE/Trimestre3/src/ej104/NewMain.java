package ej104;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        double lista[];
        boolean checked = true;
        do {
            checked=true;
            try {
                System.out.println("Introduzca un tamano");
                num = t.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El tamano del array debe de ser un numero");
                t.nextLine();
                checked = false;
            }
        } while (!checked);
        lista = new double[num];
        for (int i = 0; i < lista.length; i++) {
            do {
                checked=true;
                try {
                    System.out.println("Introduzca un valor");
                    lista[i] = t.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("El valor ha de ser numerico");
                    t.nextLine();
                    checked = false;
                }
            } while (!checked);
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

    }

}
