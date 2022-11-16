package clase4.operaciones;

public class Resta {

    int numero1, numero2;
    
    public Resta(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int getResta(){
        return this.numero1 - this.numero2;
    }
}
