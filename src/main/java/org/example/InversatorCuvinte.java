package org.example;

public class InversatorCuvinte {
    public static void main(String[] args) {
        String cuvant = "rotopercutor";
        String cuvantInversat = inverseazaCuvant(cuvant);

        System.out.println("Cuvantul original este: " + cuvant);
        System.out.println("Cuvantul inversat este: " + cuvantInversat);
    }
    public static String inverseazaCuvant(String cuvant) {
        String rezultat = "";

        for(int i = cuvant.length() - 1; i >= 0; i--) {
            rezultat += cuvant.charAt(i);
        }
        return rezultat;
    }
}
