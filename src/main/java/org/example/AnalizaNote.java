package org.example;

public class AnalizaNote {
    public static void main(String[] args) {

        int[] note = {2, 3, 4, 5, 6, 9, 10, 3, 10, 2};

        double medie = calculeazaMedia(note);
        int notaMaxima = gasesteNotaMaxima(note);

        System.out.printf("Media notelor este: %.2f%n", medie);
//        System.out.println("Media notelor este: %.2f%n" + medie);
        System.out.println("Nota maxima este: " + notaMaxima);
    }

    public static double calculeazaMedia(int[] note) {
        int suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return (double) suma / note.length;
    }

    public static int gasesteNotaMaxima(int[] note) {
        int max = note[0];
        for (int nota : note) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    public static int gasesteNotaMinima(int[] note) {
        int min = note[0];
        for (int nota : note) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
}
