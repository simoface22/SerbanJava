package org.example;

import java.util.Scanner;

public class JocDeGhicitNumarul {
    public static void main(String[] args) {
        int numarSecret = (int)(Math.random() * 100) + 1;
        Scanner cititor = new Scanner(System.in);
        int incercare;

        System.out.println("Ghiceste numarul de la 1 la 100!");

        do {
            System.out.println("Introdu numarul dorit: ");
            incercare = cititor.nextInt();

            if (incercare < numarSecret) {
                System.out.println("Numarul este prea mic, mai incearca!");
            }
            else if (incercare > numarSecret) {
                System.out.println("Numarul este prea mare, mai incearca!");
            }
            else {
                System.out.println("Felicitari, ai ghicit numarul!");
            }
        } while (incercare != numarSecret);
        cititor.close();
    }
}
