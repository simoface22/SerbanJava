package org.example;

public abstract class FiguraGeometrica {
    public abstract double calculeazaAria();

    public void afiseazaAria() {
        System.out.println("Aria este: " + calculeazaAria());
    }
}
