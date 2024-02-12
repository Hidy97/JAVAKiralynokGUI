package main;

public class KiralynokProgram {

    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        Tabla tabla = new Tabla('@');
        
        tabla.megjelenit();
        System.out.println("\nElhelyezés után:\n\n");
        tabla.elhelyez(8);
        tabla.megjelenit();
        System.out.println("Van üres oszlop? Itt: 5");
        System.out.println(tabla.uresOszlop(5));
        System.out.println("Van üres sor? Itt: 7");
        System.out.println(tabla.uresSor(7));
        System.out.println("Üres oszlopok száma:");
        System.out.println(tabla.uresOszlopokSzama());
        System.out.println("Üres sorok száma:");
        System.out.println(tabla.uresSorokSzama());
        
    }
    
}
