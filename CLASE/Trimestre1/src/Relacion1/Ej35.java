/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Relacion1;

import java.util.Scanner;


public class Ej35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,m,num, k=0;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el numero del que queremos ver sus multiplos ");
        n=t.nextInt();
        System.out.println("Introduzca el numero hasta el que queremos ver sus multiplos ");
        m=t.nextInt();
        do {            
            k++;
            num=n*k;
            if(num<m){
            System.out.print(num + ", ");
            }else if (num==m) {
                System.out.println(num);   
            }
        } while (num<m);
    }

}
