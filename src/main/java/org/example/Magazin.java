package org.example;

public class Magazin {

    public static void main(String[] args) {
        double pretInitial = 200.0;
        double procentReducere = 50.0; // 20%

        // Apelam prima metoda pentru a calcula valoarea reducerii
        double valoareReducere = calculeazaValoareReducere(pretInitial, procentReducere);
        double ex2 = calculeazaValoareReducere(200, 10);

        // Calculam pretul final
        double pretFinal = pretInitial - valoareReducere;

        // Apelam o a doua metoda doar pentru a afisa rezultatul frumos
        afiseazaRezultat(pretInitial, pretFinal);

        // Apelam de mai multe ori metoda calculeazaValoareReducerePretFinalSiAfiseazaTot() pentru a observa diferenta de eficienta!!
        calculeazaValoareReducerePretFinalSiAfiseazaTot (100, 10);
        calculeazaValoareReducerePretFinalSiAfiseazaTot (150, 15);
        calculeazaValoareReducerePretFinalSiAfiseazaTot (2000, 14);
        calculeazaValoareReducerePretFinalSiAfiseazaTot (840, 19);
        calculeazaValoareReducerePretFinalSiAfiseazaTot (833, 22);
        calculeazaValoareReducerePretFinalSiAfiseazaTot (999, 13);
    }

    /**
     * Calculeaza valoarea numerica a unei reduceri.
     * @param pret - Pretul initial al produsului.
     * @param procent - Procentul de reducere (ex: 20 pentru 20%).
     * @return Valoarea reducerii (ex: 30.0 pentru un pret de 150 si
    20%).
     */
    public static double calculeazaValoareReducere(double pret, double procent) {
        return pret * (procent / 100);
    }

    /**
     * Calculeaza valoarea numerica a unei reduceri.
     * @param pret - Pretul initial al produsului.
     * @param procent - Procentul de reducere (ex: 20 pentru 20%).
     * @return Valoarea reducerii (ex: 30.0 pentru un pret de 150 si
    20%).
     */
    public static void calculeazaValoareReducerePretFinalSiAfiseazaTot(double pret, double procent) {
        double valoareReducere = pret * (procent / 100);
        // Calculam pretul final
        double pretFinal = pret - valoareReducere;

        // Apelam o a doua metoda doar pentru a afisa rezultatul frumos
        afiseazaRezultat(pret, pretFinal);
    }

    /**
     * Afiseaza un mesaj formatat cu pretul initial si cel final.
     * @param initial - Pretul original.
     * @param redus - Pretul dupa aplicarea reducerii.
     */
    public static void afiseazaRezultat(double initial, double redus) {
        System.out.println("Produsul a fost redus!");
        System.out.printf("Pret initial: %.2f RON\n", initial);
        System.out.printf("Pret final: %.2f RON\n", redus);
        System.out.println("*************----------**********");
    }
}