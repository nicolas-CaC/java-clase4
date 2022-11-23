package usuarios;

public class Premium extends Usuarios {

    String rango = "Premium";
    Categorias tipo = Categorias.Barato;
   
    
    // SOBRECARGA DE CONSTRUCTORES
    public Premium(String nombre, String email, int edad) {
        super(nombre, email, edad);
    }
    
    public Premium(String nombre, String email, int edad, int category){
        super(nombre, email, edad);
        this.tipo = setTipo(category);
    }
    
    // Setter
    private Categorias setTipo(int tipo){
        
        Categorias category;
        
        switch(tipo) {
            case 0 -> {
                category = Categorias.Barato;
                break;
            }
            case 1 -> {
                category = Categorias.Medio;
                break;
            }
            case 2 -> {
                category = Categorias.Caro;
                break;
            }
            default -> {
                category = Categorias.Barato;
                break;
            }
        }
        return category;
    }
    
    // Getter
    static public void getCategories(){
        Categorias[] arrayCategorias = Categorias.values();
        
        for(Categorias valor: arrayCategorias){
            System.out.printf("En la posición %d se encuentra la categoría %s\n",valor.ordinal(),valor);
        }
        
    }
    
    private void getRango(){
        System.out.println("El rango es: " + this.rango);
    }
    
    private void getCategory(){
        System.out.println("La categoría es: " + this.tipo);
    }
    
    public void getDatos(){
        super.getDatos();
        getRango();
        getCategory();
    }
    
    

    
}
