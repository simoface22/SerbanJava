package org.example;

public class Garaj {
    public static void main(String[] args) {
        // Cream primul obiect (prima instanta) a clasei Masina
        // 'new Masina()' este actul de a construi casa pe baza planului.
        Masina logan = new Masina("Dacia", "Alb", 2021);

        String marca = logan.getMarca();
        System.out.println("Logan are marca: " + marca);

        // Setam starea (atributele) pentru acest obiect specific
//        logan.marca = "Renault";
//        logan.culoare = "Alb";
      logan.setAnFabricatie(2025);

      System.out.println("Vopsim masina " + marca + "...");
      String vecheaCuloare = logan.getCuloare();
      logan.setCuloare("Roz");
      String nouaCuloare = logan.getCuloare();
      System.out.println("Vechea culoare era: " + vecheaCuloare + ". Noua culoare este: " + nouaCuloare + ".");

        System.out.println("Logan are marca: " + marca);


        // Cream al doilea obiect, complet independent de primul
        Masina bmw = new Masina("BMW", "Negru", 2022);
//        bmw.marca = "BMW";
//        bmw.culoare = "Negru";
//        bmw.anFabricatie = 2022;

        // Cream al treilea obiect
        Masina ford = new Masina("Ford", "Negru", 2021);
//        ford.marca = "Ford";
//        ford.culoare = "Negru";
//        ford.anFabricatie = 2021;

        // Cream al patrulea obiect
        Masina lamborghini = new Masina("Lamborghini", "Rosu", 2025);
//        lamborghini.marca = "Lamborghini";
//        lamborghini.culoare = "Rosu";
//        lamborghini.anFabricatie = 2025;

        Masina[] garajulMeu = {lamborghini, logan, bmw, ford};

        Masina daewoo = new Masina("Matiz");

        // Apelam metodele pentru fiecare obiect
        logan.afiseazaDetalii(); // Afiseaza detaliile Logan-ului
        bmw.afiseazaDetalii();   // Afiseaza detaliile BMW-ului
        Masina lamborghini1 = garajulMeu[0];
        lamborghini1.afiseazaDetalii(); // Afiseaza detaliile Lamborghini-ului
        ford.afiseazaDetalii();
        daewoo.afiseazaDetalii();

        System.out.println("\n--- Incepe actiunea! ---");
        logan.accelereaza(50); // Doar Logan-ul accelereaza
        bmw.accelereaza(80);   // BMW-ul accelereaza independent
        lamborghini1.accelereaza(200);
        garajulMeu[0].accelereaza(100);
        int vitezaCurentaLambo = garajulMeu[0].getVitezaCurenta();
        int vitezaLambo = vitezaCurentaLambo;
        daewoo.accelereaza(30);
        System.out.println("vitezaFinala Lamborghini: " + vitezaLambo);
    }
}

