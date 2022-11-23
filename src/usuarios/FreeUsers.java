package usuarios;

public class FreeUsers extends Usuarios {

    private String categoria;

    /**
     * Son los usuarios gratis
     *
     * @param nombre del usuario
     * @param email del usuario
     * @param edad del usuario
     * @param horas de uso de la app
     */
    public FreeUsers(String nombre, String email, int edad, int horas) {
        super(nombre, email, edad);
        categoria = setCategoria(horas);
    }

    private String setCategoria(int hs) {
        String category;
        category = null;
        if (hs > 0 && hs <= 3) category = "Noob";
        if (hs > 3 && hs <= 6)  category = "Normal";
        if (hs > 6 && hs <= 9)  category = "Experto";
        if (hs > 9)  category = "full";  
        if (hs < 0)  throw new Error("Los valores no pueden ser negativos");  
        return category;
    }

    private void showCategoria() {
        System.out.println("Categoria: " + categoria);
    }

    /**
     * Muestra los datos del usuario Free en consola, incluida la categoria
     */
    @Override
    public void getDatos() {
        super.getDatos();
        showCategoria();
    }

}
