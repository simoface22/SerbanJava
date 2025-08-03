package org.example;

public class TestFiguri {
    public static void main(String[] args) {
        FiguraGeometrica[] figuri = new FiguraGeometrica[2];
        figuri[0] = new Patrat(10);
        figuri[1] = new Cerc(5);

        for (FiguraGeometrica figura : figuri) {
            figura.afiseazaAria();
        }
    }
}
