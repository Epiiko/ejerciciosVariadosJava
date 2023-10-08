/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        final String CONT="medacAlberto", USU="Alberto37@medac", CORREO="Alberto37@medac.com";
        String usuario, contrasena, email;
        int ale1, ale2;
        ale1=(int)(Math.random()*(9999-1000)+1000);
        System.out.println("Introduzca el usuario ");
        usuario=t.nextLine();
        System.out.println("Introduzca la contrasena ");
        contrasena=t.nextLine();
        System.out.println("Introduzca su email ");
        email=t.nextLine();
        if(!CONT.equals(contrasena)|| !USU.equals(usuario)|| !CORREO.equalsIgnoreCase(email)){
            System.out.println("Los credenciales no coinciden");
        }else{
            System.out.println("Acceso permitido");
            System.out.println("Numero de acceso aleatorio" + ale1);                  
        }
        System.out.println("Introduzca su numero aleatorio");
        ale2=t.nextInt();
         if (ale1==ale2) {
             System.out.println("Enhorabuena Bienvenido");
        }else{
             System.out.println("Ha habido un error intentelo mas tarde");
         }
   
    }

}
