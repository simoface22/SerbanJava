package org.example;

public class Manager  extends Angajat implements Evaluabil, Promovabil{
    private double salariuBaza;
    private double bonus;

    public Manager(String nume, double salariu, double bonus) {
        super(nume);
        this.salariuBaza = salariu;
        this.bonus = bonus;
    }

    @Override
    public double calculeazaSalariu() {
        return salariuBaza + bonus - 1000;

    }

    @Override
    public String primesteEvaluare() {
        return "Managerul" + getNume() + "a avut rezultatele asteptate.";
    }

    @Override
    public String primestePromovare() {
        return "Managerul" + getNume() + " a fost promovat la urmatorul nivel";
    }
}
