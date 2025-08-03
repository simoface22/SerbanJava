package org.example;

public class TestAngajat {
    public static void main(String[] args) {
        Manager manager = new Manager("Serban", 3000, 3000);
        System.out.println("Managerul " + manager.getNume() + " are salariul " +
                manager.calculeazaSalariu() + " EUR. Dupa evanluare: "  +
                manager.primesteEvaluare() + "Acum primeste o promovare: " +
                manager.primesteEvaluare());
    }
}
