package Relacion1;

import java.util.Scanner;


public class Ej29{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min, seg, k=1;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el numero de segundos transcurridos si introduce un numero negativo cierras el programa");
        seg=t.nextInt();
       // min=(int)Math.ceil(seg/60);
        
        do {   
           if(seg<=5400 && seg>0){
           min=(int)Math.ceil(seg/60);    
          System.out.println(" El partido se encuentra en el minuto " +  min);
           k--;
           }else if (seg<0) {
           k--;
            }else{
               System.out.println("Introduzca el numero nuevamente debe de ser menor de 5400");
               seg=t.nextInt();
           }
               
        } while (seg>0 && k!=0);
    }

}