package clase4.operaciones;

public class Suma {

    int numero1, numero2;
    
    public Suma(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int getSuma(){
        return this.numero1 + this.numero2;
    }
}
