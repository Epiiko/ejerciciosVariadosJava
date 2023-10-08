package Relacion1;

import java.util.Scanner;

public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double mib, mb;
        int f;
        System.out.println("Pulse uno para convertir de Mb a Mib, en caso contrario pulse cero ");
        f = t.nextInt();

        if (f == 0) {
            System.out.print("Introduzca el numero de Mib a transformar");
            mib = t.nextDouble();
            mb = mib / 1.04858;
            System.out.println("Corresponde a " + mb + " Megabytes");
            
        } else if (f==1){
            System.out.print("Introduzca el numero de Mb a transformar");
            mb = t.nextDouble();
            mib = mb / 1.04858;
            System.out.println("Corresponde a " + mib + " Mebibytes");

        }else{
            System.err.println("Error solo puede pulsar 1 o 0, reinicie el programa");
        }

    }

}
