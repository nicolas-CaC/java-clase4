package clase4.operaciones;

public class Dividir {

    private int numero1, numero2;
    private float numero3, numero4;
    
    public Dividir(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Dividir(float numero1, float numero2){
        numero3 = numero1;
        numero4 = numero2;
    }
    
    public int getDivision(){
        return this.numero1 / this.numero2;
    }
 
    public float getDivisionReal(){
        return this.numero3 / this.numero4;
    }
}
