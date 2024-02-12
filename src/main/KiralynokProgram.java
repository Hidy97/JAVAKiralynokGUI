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
    }
    
}
