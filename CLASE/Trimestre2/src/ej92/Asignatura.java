
package ej92;

/**
 *
 * @author EPIKO
 */
public class Asignatura {
       private int  idasignatura;
       private int nhorassemana;
       
       public Asignatura(int nhorassemana, int idasignatura){
           this.nhorassemana=nhorassemana;
           this.idasignatura=idasignatura;
       }
       
       public String toString(){
           return "La asignatura " + this.idasignatura + "tiene " + this.nhorassemana + "horas a la semana";
       }

    public int getNhorassemana() {
        return nhorassemana;
    }
       
}
