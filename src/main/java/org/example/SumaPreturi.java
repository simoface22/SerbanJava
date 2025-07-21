package org.example;

import java.util.Scanner;

        public class SumaPreturi {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Cream un tablou pentru a stoca 3 preturi
                double[] preturi = new double[3];

                // Umplem tabloul cu date de la utilizator
                for (int i = 0; i < preturi.length; i++) {
                    System.out.print("Introduceti pretul produsului " + (i + 1) + ": ");
                    preturi[i] = scanner.nextDouble();
                }

                // Calculam suma totala parcurgand din nou tabloul
                double sumaTotala = 0.0;
                for (int i = 0; i < preturi.length; i++) {
                    sumaTotala = sumaTotala + preturi[i]; // Adaugam fiecare pret la suma
                }

                System.out.printf("Suma totala a preturilor este: %.2f RON\n", sumaTotala);
                scanner.close();
            }
        }
