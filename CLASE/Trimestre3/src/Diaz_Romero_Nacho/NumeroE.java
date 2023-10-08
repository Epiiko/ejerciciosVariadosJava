package T3P1;



public class NumeroE {
    int numero;
    
    public NumeroE(int num){
        if (num<0) {
            throw new NumeroError("El numero no puede ser negativo");
        }
        this.numero = num;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int nuevo){
        this.numero = nuevo;
         if (nuevo<0) {
            throw new NumeroError("El numero no puede ser negativo");
        }
    }
    
    public String toString(){
        return this.numero+"";
    }
}
