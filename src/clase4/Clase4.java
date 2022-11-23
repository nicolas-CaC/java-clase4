package clase4;

import clase4.operaciones.*;
import javax.swing.JOptionPane;
import usuarios.*;

public class Clase4 {

    public static void main(String[] args) {

        Suma suma = new Suma(1, 2);
        System.out.println(suma.getSuma());

        Dividir division = new Dividir(6, 3);
        Dividir reales = new Dividir(2.50F, 1.00F);
        System.out.println(division.getDivision());
        System.out.println(reales.getDivisionReal());

        // WRAPPERS
//        int noEnvoltorio = 2;
//        Integer envoltorio = 2;

        // USUARIOS 
        Usuarios usuario1 = new Usuarios("Nicolas", "nico@gmail.com", 32);
        Usuarios usuario2 = new Usuarios("Serena", "morena@gmail.com", 28);
        System.out.printf("El id del usuario2 es %d\n", usuario2.getId());
        System.out.printf("El id del usuario1 es %d\n", usuario1.getId());

        Admin usuario3 = new Admin("De Tal", "detal@gmail.com", 25);
        usuario3.getRango();
        usuario3.getDatos();

        // Polimorfismo
        Usuarios usuario4 = new Admin("Fulanito", "fulano@gmail.com", 20);
        usuario4.getDatos();

        Premium.getCategories();

        Premium usuario5 = new Premium("Juancho", "juancis@gmail.com", 12);
        usuario5.getDatos();

        Premium usuario6 = new Premium("Sergio", "sergio@gmail.com", 18, 3);
        usuario6.getDatos();

        byte a = 102;
        int b = a;
//        byte c = (byte)b;
        char x = 'b';
        int y = x;
        System.out.println(b);
        System.out.println(y);

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas que usa la app al día:"));
        FreeUsers usuario7 = new FreeUsers("Rodolfo", "rodolfo@gmail.com", 45, horas);
        usuario7.getDatos();
        
        Usuarios[] clientela = {usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7};
        
        for(int i = 0; i < clientela.length; i++){
            System.out.println(clientela[i].getNombre());
        }
        
        
// C:\Users\Diseno\Desktop\archivo.txt
    }

}
