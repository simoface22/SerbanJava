package org.example;

import java.util.Scanner;

public class ExempluFor {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Alegeti numarInmultire...: ");
        int numarInmultire = cititor.nextInt();

        for (int i = 1; i <= 10; i++) {
            if(i==7) {
                System.out.println("Am intrat pe conditia i>7!!!!!");
                continue;
            }
            System.out.println(numarInmultire + " x " + i + " = " + (numarInmultire * i));
        }
    }
}