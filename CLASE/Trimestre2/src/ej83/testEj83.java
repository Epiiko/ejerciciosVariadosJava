/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej83;


public class testEj83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revolver Winchester=new Revolver("Winchester", "1883", 6);
        
        for (int i = 0; i < 6; i++) {
            System.out.println(Winchester.disparar());
            
        }
        System.out.println(Winchester);
    }

}
