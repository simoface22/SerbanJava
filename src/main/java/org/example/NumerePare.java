package org.example;

import java.util.Scanner;

public class NumerePare {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);

        System.out.println("Introdu un numar intreg N: ");
        int N = cititor.nextInt();

        System.out.println("Numerele pare de la 2 pana la " + N +" sunt:");

        for (int i=2; i <= N; i += 2){
            System.out.println(i);
        }
        cititor.close();
    }
}
