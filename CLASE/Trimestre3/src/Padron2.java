
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Padron2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("Bienvenido al padron de VTrabuco");
            System.out.println("1. Registrar habitantes\n2. Mostrar padron\n3.Salir");
            System.out.println("Introduzca una opcion");
            try {
                opcion = t.nextInt();
                switch (opcion) {
                    case 1:
                        registrarHabitante();
                        break;
                    case 2:
                        mostrarpadron();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("La opcion no es valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un valor numerico entre 1-3");
                t.nextLine();
            }
        } while (opcion != 3);
    }

    public static void registrarHabitante() {
        Scanner t = new Scanner(System.in);
        boolean checked = false;
        String dni = "";
        String linea = "";
        boolean encontrado = false;

        //===================VALIDACION DNI==============================================
        System.out.println("Introduzca el dni");
        dni = t.nextLine();
        //==========================FLUJO DE LECTURA====================================
        try ( BufferedReader miBufferR = new BufferedReader(new FileReader("src/padron2.txt"))) {
            do {
                linea = miBufferR.readLine();
                if (linea != null) {
                    if (linea.equalsIgnoreCase(dni)) {
                        System.out.println("Dni repetido");
                        encontrado = true;
                    }
                }
            } while (linea != null && !encontrado);

            if (!encontrado) {
                System.out.println("Registrando dni.....................");
                try ( BufferedWriter MiBufferW = new BufferedWriter(new FileWriter("src/padron2.txt", true))) {
                    MiBufferW.write(dni);
                    MiBufferW.newLine();
                } catch (IOException e) {
                    System.out.println("Error inesperado" + e.getMessage());
                }finally{
                      miBufferR.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra en la ruta" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error inesperado " + e.getMessage());
        }

    }

    public static void mostrarpadron() {
        System.out.println("=========PATRON VTRABUCO==================");
        String linea = "";
        int k = 1;
        try ( BufferedReader mibr = new BufferedReader(new FileReader("src/padron2.txt"))) {
            do {
                linea = mibr.readLine();
                if (linea != null) {
                    System.out.println(k + "  " + linea);
                    k++;
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error inesperadoooo");
        }catch(IOException e){
            System.out.println("Error inesperado");
        }
    }
}
