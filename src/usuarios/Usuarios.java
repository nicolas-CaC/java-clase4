package usuarios;

public class Usuarios {

    // Static
    private static int count = 0;
    
    // Instancia
    private String nombre, email;
    private int edad, id;
    
    public Usuarios(String nombre, String email, int edad){
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.id = createId();
    }
    
    // Static
    private static int createId(){
        return ++count;
    }
    
    // Instancias: Getters & Setters
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getId(){
        return id;
    }
    
    public void getDatos(){
        System.out.println("Usuario: " + nombre + "\nEmail: " + email + "\nEdad: " + edad + "\nId: " + id);
    }
    
    
}
