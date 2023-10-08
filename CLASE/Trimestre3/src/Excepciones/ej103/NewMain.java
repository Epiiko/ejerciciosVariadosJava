package Excepciones.ej103;

public class NewMain {

    public static void main(String[] args) {
        System.out.println("Programa automatico");
        try {    
            throw new Excepcion("Soy una excepcion");
        } catch (Excepcion a) {
            System.out.println(a.getMessage());
        }finally{
        System.out.println("Programa terminado");
        }
    }

}
