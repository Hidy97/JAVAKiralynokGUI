package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Tabla {

    private char[][] T;
    private char uresCella;

    public Tabla(char uresCella) {
        this.T = new char[8][8];
        this.uresCella = uresCella;
        for (int sor = 0; sor < 8; sor++) {
            for (int oszlop = 0; oszlop < 8; oszlop++) {
                T[sor][oszlop] = uresCella;
            }
        }
    }

    //megjelenítem a tömböt
    public void megjelenit() {
        for (int sor = 0; sor < 8; sor++) {
            for (int oszlop = 0; oszlop < 8; oszlop++) {
                System.out.printf(T[sor][oszlop] + " ");
            }
            System.out.println();
        }
    }

    //Kirakom a királynőket
    public void elhelyez(int n) {
        char kiralyno = 'K';
        Random rnd = new Random();
        //darabszám: ezzel mérem hogy hány db királynőt helyeztem már el
        //nullával indulunk
        int darabSzam = 0;
        while (darabSzam < n) {
            int sor = rnd.nextInt(8);
            int oszlop = rnd.nextInt(8);

            if (T[sor][oszlop] == uresCella) {
                T[sor][oszlop] = kiralyno;
                darabSzam++;
            }
        }
    }

    public boolean uresOszlop(int oszlop) {
        boolean vanUresOszlop = true;
        for (int i = 0; i < 8; i++) {
            if (T[i][oszlop] == 'K') {
                vanUresOszlop = false;
            }
        }

        return vanUresOszlop;
    }

    public boolean uresSor(int sor) {
        boolean vanUresSor = true;
        for (int i = 0; i < 8; i++) {
            if (T[sor][i] == 'K') {
                vanUresSor = false;
            }
        }

        return vanUresSor;
    }

    public int uresOszlopokSzama(){
        int oszlopDb = 0;
        for (int i = 0; i < 8; i++) {
            if (uresOszlop(i)) {
                oszlopDb++;
            }
        }
        return oszlopDb;
    }
    
    public int uresSorokSzama(){
        int sorDb = 0;
        for (int i = 0; i < 8; i++) {
            if (uresSor(i)) {
                sorDb++;
            }
        }
        return sorDb;
    }
    
    public void fajl64() throws IOException{
        Path fajlom = Path.of("tablak64.txt");
        if (Files.exists(fajlom)) {
            Files.delete(fajlom);
        }
        
        for (int i = 1; i < 65; i++) {
            Tabla tabla = new Tabla('*');
            //belehelyezek mindig annyit, ahányadiknál tart
            tabla.elhelyez(i);
        }
    }
}
