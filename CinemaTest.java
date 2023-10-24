package src;

import java.util.Scanner;

public class CinemaTest {

    public static void main(String[] args) {
        Cinema mioCinema = new Cinema();
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il numero di spettatori: ");

        mioCinema.setSpettatori(input.nextInt());
        mioCinema.AssegnaPosti();
        mioCinema.displayPosti();

        input.close();
    }
}
