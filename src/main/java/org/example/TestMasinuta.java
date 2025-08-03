package org.example;

public class TestMasinuta {
    public static void main(String[] args) {
        Masinuta masinutaPorsche911Gt3Rs = new Masinuta("Porsche", 296, 2);
        System.out.println("-----------------------");
        Masinuta masinutaVolkswagenFox = new Masinuta("VW", 210, 2);

        System.out.println("VW Fox are viteza maxima: " + masinutaVolkswagenFox.vitezaMaxima);
        System.out.println("Porsche 911 Gt3 Rs are viteza maxima: " + masinutaPorsche911Gt3Rs.vitezaMaxima);

        System.out.println("VW Fox are " + masinutaVolkswagenFox.getNumarUsi() + " usi.");
        System.out.println("Porsche 911 Gt3 Rs are viteza maxima: " + masinutaPorsche911Gt3Rs.getNumarUsi() + " usi.");

        masinutaVolkswagenFox.claxoneaza();
        masinutaPorsche911Gt3Rs.claxoneaza();

        Vehicul vehicul = new Masinuta("Dacia", 180, 4);
//        vehicul.claxoneaza();
//        vehicul.getMarca();
        Vehicul v = new Vehicul("Trabant", 100);
        v.claxoneaza();

        Vehicul vehicul2 = new Motocicleta("Ducatti", 200);
        vehicul2.claxoneaza();

        Masinuta.getNumarTotalMasini(); // Apel pe clasa, nu pe obiect
        System.out.println("Total masini: " + Masinuta.getNumarTotalMasini());

        Motocicleta.getNumarTotalMasini();
        System.out.println("Total motocicleta: " + Motocicleta.getNumarTotalMasini());


//        vehicul.getNumarUsi();
        // pentru ca am definit obiectul vehicul de tipul Vehicul, chiar daca avem o instanta de Masinuta()
        // putem folosi doar metodele definite in clasa Vehicul: claxoneaza(), getMarca();
    }
}