package clase4;


import clase4.operaciones.*;

public class Clase4 {

    public static void main(String[] args) {

        Suma suma = new Suma(1, 2);
        System.out.println(suma.getSuma());
        
        Dividir division = new Dividir(6, 3);
        Dividir reales = new Dividir(2.50F, 1.00F);
        System.out.println(division.getDivision());
        System.out.println(reales.getDivisionReal());
        
    }

}
