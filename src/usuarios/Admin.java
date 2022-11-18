package usuarios;

public class Admin extends Usuarios {
    
    String rango = "Administrador";
    
    public Admin (String nombre, String email, int edad){
        super(nombre, email, edad);
    }

    public void getRango(){
        System.out.println("El rango es: " + rango);
    }
    
    @Override
    public void getDatos(){
        super.getDatos();
        getRango();
    }
    
}
