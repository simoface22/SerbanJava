package org.example;

public class ExempluScope {
    static int variabila = 20;

    public static void metodaA() {
        int variabilaLocalaA = 100; // "Jucaria" din camera A
        System.out.println("In metoda A, variabila este: " + variabilaLocalaA);
        System.out.println(variabilaLocalaA);
        System.out.println(variabila);
    }
    public static void metodaB() {
//        Urmatoarea linie va da EROARE DE COMPILARE!
        int variabilaLocalaB = 1001;
//        int variabilaLocalaA = 100;
        System.out.println(variabilaLocalaB);
        System.out.println(variabila);
        metodaA();
//        Motivul: "Jucaria" variabilaLocalaA nu exista in camera B.
    }
}
