/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package trimestre2;


public class testEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante nacho = new Estudiante("Nacho ", "Diaz Romero", 5);
        nacho.InsertarNota(8);
        nacho.InsertarNota(5);
        nacho.InsertarNota(4);
        nacho.InsertarNota(10);
        nacho.CalcularMedia();
        nacho.IndicarRangos();
        System.out.println(nacho);
        
        
    }

}
