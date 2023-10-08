package ej93;

import java.util.Scanner;

public class testVehiculos {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int busqueda, coincidencia = 0;
        Bicicleta b1 = new Bicicleta("Azul", 2, true);
        Motocicleta m1 = new Motocicleta("Blanca", 2, true, 100, 125);
        Coche c1 = new Coche("Rojo", 4, 120, 255);
        Camioneta cam1 = new Camioneta("Naranja", 4, 120, 500, 400);
        Camioneta cam2 = new Camioneta("Naranja", 4, 120, 500, 400);

        Vehiculo lista[] = new Vehiculo[5];
        lista[0] = b1;
        lista[1] = m1;
        lista[2] = c1;
        lista[3] = cam1;
        lista[4] = cam2;

        for (int i = 0; i < 5; i++) {
            System.out.println("--------------------------------------------Vehiculo: " + (i + 1) + " -----------------------------------------------");
            System.out.println(lista[i]);
        }

        System.out.println("--------------------------------------------BUSQUEDA POR RUEDAS------------------------------------------------");

        System.out.println("Introduzca el numero de ruedas con el que vamos a buscar");
        busqueda = t.nextInt();

        for (int i = 0; i < 5; i++) {
            if (lista[i].nruedas == busqueda) {
                System.out.println("--------------------------------------------Vehiculo: " + (i + 1) + " -----------------------------------------------");
                System.out.println(lista[i]);
                coincidencia++;
            }
        }
        System.out.println("Se han encontrado " + coincidencia + " vhiculos con " + busqueda + "ruedas");
    }
}
