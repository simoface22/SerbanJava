package org.example;

// Fisier: Masina.java
public class Masina {
    // 1. Atribute (Câmpuri / Fields / Caracteristici) - Ce "are" o mașină?
    // Acestea sunt variabilele care definesc starea unui obiect.
    private String marca;
    private String culoare;
    private int vitezaCurenta;
    private int anFabricatie;

    // 2. Metode / Actiuni / Comportamente - Ce "face" o mașină?
    // Acestea sunt acțiunile pe care le poate executa un obiect.



    // Acesta este un constructor.
    public Masina(String marca, String culoare, int anFabricatie) {
        // 'this.marca' = atributul obiectului curent
        // 'marca' = parametrul primit de constructor
        this.marca = marca;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.vitezaCurenta = 0; // Setam o valoare initiala standard
    }

    // Acesta este un constructor.
    public Masina(String marca, String culoare) {
        // 'this.marca' = atributul obiectului curent
        // 'marca' = parametrul primit de constructor
        this.marca = marca;
        this.culoare = culoare;
        this.anFabricatie = 2026;
        this.vitezaCurenta = 0; // Setam o valoare initiala standard
    }

    // Acesta este un constructor.
    public Masina(String marca) {
        // 'this.marca' = atributul obiectului curent
        // 'marca' = parametrul primit de constructor
        this.marca = marca;
        this.culoare = "Turcuaz";
        this.anFabricatie = 2026;
        this.vitezaCurenta = 0; // Setam o valoare initiala standard
    }

//    GETTER
    public String getMarca() {
        return this.marca;
    }


    public String getCuloare() {
        return culoare;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    //    SETTER

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

//    public void setAnFabricatie(int anFabricatie) {
//        this.anFabricatie = anFabricatie;
//    }

//    public void accelereaza(int cuCat) {
//        vitezaCurenta = vitezaCurenta + cuCat;
//        System.out.println(marca + " accelereaza. Viteza noua: " + vitezaCurenta + " km/h");
//    }

    public void franeaza() {
        vitezaCurenta = 0;
        System.out.println(marca + " s-a oprit.");
    }

    // Setter cu VALIDARE
    public void setAnFabricatie(int anNou) {
        if (anNou > 1900 && anNou <= 2025) { // Permitem doar ani rezonabili
            this.anFabricatie = anNou;
        } else {
            System.out.println("Eroare: Anul " + anNou + " nu este un an valid.");
        }
    }

    // Metoda de comportament care foloseste atributele private
    public void accelereaza(int cuCat) {
        if (cuCat > 0) {
            this.vitezaCurenta += cuCat;
            System.out.println(marca + " accelereaza. Viteza noua: " + vitezaCurenta + " km/h");
        }
    }


    public void afiseazaDetalii() {
        System.out.println("Detalii masina: " + marca + ", Culoare: " + culoare + ", An: " + anFabricatie);
    }
}
