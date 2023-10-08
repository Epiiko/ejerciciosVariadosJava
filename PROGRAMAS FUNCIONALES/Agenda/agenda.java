
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class agenda {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int opcion = -1;
        boolean checked = false;
        String ruta = "src/agenda.txt";
        do {
            System.out.println("=========AGENDA PIBE=========");
            System.out.println("1. Nuevo contacto\n2. Mostrar agenda\n3. Mostrar Contacto\n4. Contactos con <30 años\n5. Modificar edad\n6. Salir");
            do {
                try {
                    System.out.println("Eliga una opcion ");
                    opcion = t.nextInt();
                    checked = true;
                } catch (InputMismatchException e) {
                    System.out.println("La opcion es numerica ceporro");
                    t.nextLine();
                }
            } while (!checked);
            switch (opcion) {
                case 1:
                    nuevoContacto(ruta);
                    break;
                case 2:
                    mostraragenda(ruta);
                    break;
                case 3:
                    buscarContacto(ruta);
                    break;
                case 4:
                    buscarJovenes(ruta);
                    break;
                case 5:
                    editarContacto(ruta);
                    break;
                case 6:
                    //salir
                    break;
                default:
                    System.out.println("La opcion no es valida");
            }
        } while (opcion != 6);
    }
//==============================Nuevo contacto=========================

    public static void nuevoContacto(String ruta) {
        Scanner t = new Scanner(System.in);
        String nombre = "";
        String tlf = "";
        String linea = "";
        int edad = 0;
        String contacto[];
        boolean encontrado = false;
        boolean checked = false;
        try {

        } catch (InputMismatchException e) {
            System.out.println("debe de ser un numero");
        }
        do {
            encontrado = false;
            System.out.println("Introduzca un nombre");
            nombre = t.nextLine().replace(" ", "_");
            try ( BufferedReader mibr = new BufferedReader(new FileReader(ruta))) {
                linea = mibr.readLine();
                if (linea != null) {
                    contacto = linea.split(":");
                    if (nombre.equalsIgnoreCase(contacto[0])) {
                        encontrado = true;
                        System.out.println("Ya hay un contacto con ese nombre");
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } while (linea != null && encontrado);

        //============================edad=============================
        if (!encontrado) {
            do {
                try {
                    checked = false;
                    System.out.println("Introduzca su edad");
                    edad = t.nextInt();
                    if (edad > 100) {
                        System.out.println("Si hombre alome");
                    } else {
                        checked = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("La edad es numero cenutrio");
                    t.nextLine();
                }
            } while (!checked);
            t.nextLine();//limpieza necesaria
            do {
                checked = true;
                System.out.println("Introduzca un telefono");
                tlf = t.nextLine();
                if (tlf.length() != 9) {
                    System.out.println("El telefono ha de ser 9 digitos");
                    checked = false;
                }
            } while (!checked);
            //======================REGISTRAMOS AL USUARIO====================

        }
    }
//==============================Mostrar Agenda=========================

    public static void mostraragenda(String ruta) {
        String linea = "";
        String[] contacto;
        String nombre = "";
        int edad = 0;
        String tlf = "";
        int k = 1;
        try ( BufferedReader mibr = new BufferedReader(new FileReader(ruta))) {
            do {
                linea = mibr.readLine();
                if (linea != null) {
                    contacto = linea.split(":");
                    nombre = contacto[0].replace("_", " ");
                    edad = Integer.parseInt(contacto[1]);
                    tlf = contacto[2];
                    System.out.println("==================  CONTACTO " + k + " =====================\nNombre: " + nombre + "\nEdad: " + edad + "\nTelefono: " + tlf);
                    k++;
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no ha sido encontrado " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error fatal");
        }

    }
//==============================Buscar contacto=========================

    public static void buscarContacto(String ruta) {
        Scanner t = new Scanner(System.in);
        String linea = "";
        String[] contacto;
        String nombre = "";
        int edad = 0;
        String tlf = "";
        boolean encontrado = false;
        boolean salir = false;
        do {
            System.out.println("Introduzca un nombre");
            nombre = t.nextLine().replace(" ", "_");
            try ( BufferedReader mibr = new BufferedReader(new FileReader(ruta))) {
                do {
                    linea = mibr.readLine();
                    if (linea != null) {
                        contacto = linea.split(":");
                        if (nombre.equalsIgnoreCase(contacto[0])) {
                            nombre = contacto[0].replace("_", " ");
                            edad = Integer.parseInt(contacto[1]);
                            tlf = contacto[2];
                            System.out.println("==================  CONTACTO " + nombre + " =====================\nNombre: " + nombre + "\nEdad: " + edad + "\nTelefono: " + tlf);
                            encontrado = true;
                        }
                    }
                } while (linea != null && !encontrado);
            } catch (FileNotFoundException e) {
                System.out.println("El fichero no ha sido encontrado " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error fatal");
            }
            if (!encontrado) {
                String opcion = "";
                System.out.println("No he encontrado Desea salir? S/N");
                opcion = t.nextLine();
                if (opcion.equalsIgnoreCase("S")) {
                    salir = true;
                }
            }
        } while (!encontrado && !salir);
    }
    //==============================Buscar limite edad=========================

    public static void buscarJovenes(String ruta) {
        Scanner t = new Scanner(System.in);
        String linea = "";
        String[] contacto;
        String nombre = "";
        int edad = 0;
        String tlf = "";
        int k = 1;
        Integer limite = 30;
        boolean encontrado = false;
        boolean salir = false;
        boolean checked = false;
        do {
            do {
                checked = false;
                try {
                    System.out.println("Introduce la edad maxima por la que buscar");
                    limite = t.nextInt();
                    checked = true;
                } catch (InputMismatchException e) {
                    System.out.println("Debe de ser un numero");
                    t.nextLine();
                }
            } while (!checked);

            try ( BufferedReader mibr = new BufferedReader(new FileReader(ruta))) {
                do {
                    linea = mibr.readLine();
                    if (linea != null) {
                        contacto = linea.split(":");
                        if (Integer.parseInt(contacto[1]) > limite) {
                            nombre = contacto[0].replace("_", " ");
                            edad = Integer.parseInt(contacto[1]);
                            tlf = contacto[2];
                            System.out.println("==================  CONTACTO " + k + " =====================\nNombre: " + nombre + "\nEdad: " + edad + "\nTelefono: " + tlf);
                            encontrado = true;
                            k++;
                        }
                    }
                } while (linea != null);
            } catch (FileNotFoundException e) {
                System.out.println("El fichero no ha sido encontrado " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error fatal");
            }
            if (!encontrado) {
                String opcion = "";
                System.out.println("No he encontrado Desea salir? S/N");
                opcion = t.nextLine();
                if (opcion.equalsIgnoreCase("S")) {
                    salir = true;
                }
            }
        } while (!encontrado && !salir);
    }
    //==============================Buscar contacto=========================

    public static void editarContacto(String ruta) {
        Scanner t = new Scanner(System.in);
        String linea = "";
        String[] contacto;
        String nombre = "";
        int edad = 0;
        String tlf = "";
        boolean encontrado = false;
        boolean salir = false;
        boolean checked = false;
        do {
            System.out.println("Introduzca un nombre");
            nombre = t.nextLine().replace(" ", "_");
            try ( BufferedReader mibr = new BufferedReader(new FileReader(ruta))) {
                do {
                    linea = mibr.readLine();
                    if (linea != null) {
                        contacto = linea.split(":");
                        if (nombre.equalsIgnoreCase(contacto[0])) {
                            System.out.println("Usuario encontrado.........");
                            encontrado = true;
                            nombre = contacto[0];
                            tlf = contacto[2];
                            do {
                                try {
                                    System.out.println("introduzca la nueva edad");
                                    edad = t.nextInt();
                                    if (edad < 100) {
                                        checked = true;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Debe de ser un numero ceporro");
                                    t.nextLine();
                                }
                            } while (!checked);
                        }

                    }
                } while (linea != null && !encontrado);
            } catch (FileNotFoundException e) {
                System.out.println("El fichero no ha sido encontrado " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error fatal");
            }
            if (encontrado) {
                try ( BufferedWriter mibw = new BufferedWriter(new FileWriter(ruta, true))) {
                    mibw.write(nombre + ":" + edad + ":" + tlf);
                    mibw.newLine();
                } catch (IOException e) {
                    System.out.println("Error fatal");
                }
            }
            if (!encontrado) {
                String opcion = "";
                System.out.println("No he encontrado Desea salir? S/N");
                opcion = t.nextLine();
                if (opcion.equalsIgnoreCase("S")) {
                    salir = true;
                }
            }
        } while (!encontrado && !salir);
    }

}
