package org.example;

public class Motocicleta extends Vehicul {

private static int numarMoto = 0;
    public Motocicleta(String marca, int vitezaMaxima) {
        super(marca, vitezaMaxima);
        numarMoto++;
    }
    @Override
    public void claxoneaza() {
        System.out.println("Bip-bip! Motocicleta claxoneaza!");
    }
    // Metoda STATICA - poate fi apelata direct pe clasa
    public static int getNumarTotalMasini() {
        // Nu putem folosi 'this' sau 'marca' aici, pentru ca metoda nu apartine unui obiect anume.
        return numarMoto;
    }
}
