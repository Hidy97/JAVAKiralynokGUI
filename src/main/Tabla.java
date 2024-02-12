package main;

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
    
    public boolean uresOszlop(){
        return false;
    }
    
    public boolean uresSor(){
        return false;
    }

}
