package T3P1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Objects;

public class mainNumeroE {

    public static void main(String[] args) {

        //Variables
        String nombre = "Ignacio Diaz"; //PON AQUI TU NOMBRE Y PRIMER APELLIDO

        Scanner entrada = new Scanner(System.in);
        int v1 = -100, v2 = -100; //valores que se piden al usuario
        int cociente = 0; //resultado de la division
        double raiz = 0; //resultado de la raiz cuadrada
        NumeroE n1 = null, n2 = null;
        boolean checked = false; //controla los do while para salida
        //Solicito el un valor y creo el primer número
        do {
            try {
                System.out.print("Introduce primer valor positivo: ");
                v1 = entrada.nextInt();
                n1 = new NumeroE(v1);
                checked = true;
            } catch (NumeroError e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("El valor ha de ser numerico");
                entrada.nextLine();
            }
        } while (!checked);
        checked = false;
        //Solicito el otro valor y creo el segundo número
        do {
            try {
                System.out.print("Introduce segundo valor positivo: ");
                v2 = entrada.nextInt();
                n2 = new NumeroE(v2);
                checked = true;
            } catch (NumeroError e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("El valor ha de ser numerico");
                entrada.nextLine();
            }
        } while (!checked);
        //Realizo las operaciones
        try {
            cociente = n1.getNumero() / n2.getNumero();

        } catch (ArithmeticException e) {
            System.err.println("El numero no puede ser divisible entre 0");
            cociente = 0;
        }
        try {
            if (n1.getNumero() - n2.getNumero() < 0) {
                throw new ArithmeticException("No se puede realizar la raiz de un numero negativo");
            }
            raiz = Math.sqrt(n1.getNumero() - n2.getNumero());
        } catch (ArithmeticException e) {
            System.err.println("No se puede realizar la raiz de un negativo");
            raiz = 0;
        }
        System.out.println("La raiz de la resta da como resultado: " + raiz);
        System.out.println("El cociente da como resultado: " + cociente);

        //Fin del programa
        //----------------------------------------------
        //Linea de comprobación: NO HACER CASO y NO TOCAR
        System.out.print("\n Codigo de chequeo de alumno: ");
        System.out.println(checkNumber(nombre, v1, v2));
        //----------------------------------------------

    }

    //NO HACER CASO y NO TOCAR
    public static int checkNumber(String n, int a, int b) {
        return Objects.hash(String.valueOf(n), Integer.valueOf(a), Integer.valueOf(b));
    }

}
