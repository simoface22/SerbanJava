package org.example;

public class MagazinOnline {
    public static void main(String[] args) {
        Produs sapun = new Produs("sapun", 10.99, 25);
        Produs detergentVase = new Produs ("DetergentVase", 15.99, 50);
        Produs hartieIgienica = new Produs ("Zewa", 8.99, 43);

        System.out.println("Nume: " + sapun.getNume() + ", Pret: " + sapun.getPret() + ", Cantitate: " + sapun.getCantitate());
        System.out.println("Produsul este disponibil? " + sapun.getDisponibil() + "\n");

        sapun.setPret(-2);
        System.out.println("\n");
        sapun.setCantitate(0);
        System.out.println("\n");
        detergentVase.setPret(0);
        System.out.println("\n");

        System.out.println("Pretul sapunului dupa actualizare: " + sapun.getPret() + ", Cantitate: " + sapun.getCantitate());
        System.out.println("Produsul este disponibil? " + sapun.getDisponibil() + "\n");

        System.out.println("Nume: " + detergentVase.getNume() + ", Pret: " + detergentVase.getPret() + ", Cantitate: " + detergentVase.getCantitate());
        System.out.println("Produsul este disponibil? " + detergentVase.getDisponibil() + "\n");

        System.out.println("Nume: " + hartieIgienica.getNume() + ", Pret: " + hartieIgienica.getPret() + ", Cantitate: " + hartieIgienica.getCantitate());
        System.out.println("Produsul este disponibil? " + hartieIgienica.getDisponibil() + "\n");
    }
}
