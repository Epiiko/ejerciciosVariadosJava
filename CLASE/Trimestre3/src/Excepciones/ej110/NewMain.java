

package Excepciones.ej110;

import java.util.InputMismatchException;
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
       
        
        try {
            System.out.println("Intro");
           int num=t.nextInt();
            if (num<0) {
            throw new RuntimeException("No se pueden negativos");
            }
            }catch(InputMismatchException e){
            System.out.println("Debe de ser un numero");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        
        }
    }

}
