package src;

import java.util.Scanner;
import java.util.ArrayList;

public class Cinema {
    
    ArrayList<Integer> postiDestra;
    ArrayList<Integer> postiCentro;
    ArrayList<Integer> postiSinistra;

    Scanner input = new Scanner(System.in);
    private int spettatori;

    public void setSpettatori(int spettatori) {

        boolean base = true;

        do {

            if (spettatori > 0 && spettatori < 301) {
                this.spettatori = spettatori;
                base = false;

            } else {
                System.out.println("Numero di spettatori inserito non valido");
                System.out.print("Inserire correttamente il numero di spettatori");
                spettatori = input.nextInt();
            }
        } while (base);

    }

    public int getSpettatori() {
        return spettatori;
    }

    public void AssegnaPosti() {
        

        int biglietto = 1;
        postiSinistra = new ArrayList<Integer>();
        postiCentro = new ArrayList<Integer>();
        postiDestra = new ArrayList<Integer>();

        for (int i = 0; i < spettatori; i++) {
            if (i % 3 == 1) {
                postiSinistra.add(biglietto);

            } else if (i % 3 == 0) {
                postiCentro.add(biglietto);

            } else {
                postiDestra.add(biglietto);

            }
            biglietto++;

        }

    }

    public void displayPosti() {

        System.out.print("Fila di sinistra: ");
        for (int biglietto : postiSinistra) {
            System.out.print(biglietto + " ");
        }
        System.out.println();

        System.out.print("Fila centrale: ");
        for (int biglietto : postiCentro) {
            System.out.print(biglietto + " ");
        }
        System.out.println();

        System.out.print("Fila di destra: ");
        for (int biglietto : postiDestra) {
            System.out.print(biglietto + " ");
        }
        System.out.println();

        System.out.println("Assegnati : " + (postiSinistra.size()) + " posti a sinistra, " + (postiCentro.size()) + " posti al centro, " + (postiDestra.size()) + " posti a destra.");
        System.out.println("Totale Spettatori: " + getSpettatori());

    }

}
