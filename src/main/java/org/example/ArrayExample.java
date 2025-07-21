package org.example;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] note = new int[5];
        note[0] = 10;
        note[1] = 8;
        note[4] = 10;
//        note[5] = 10;

        int lungimeNote = note.length;

        String[] zileLucratoare = {"Luni", "Marti", "Miercuri", "Joi", "Vineri"};

        int lungimeZileLucratoare = zileLucratoare.length;

        System.out.println("Array-ul note[] are lungimea de: " + lungimeNote + "elemente, iar elementele sunt: " + Arrays.toString(note));
        System.out.println("Array-ul ZileLucratoare[] are lungimea de: " + lungimeZileLucratoare + "elemente, iar elementele sunt: " + Arrays.toString(zileLucratoare));
    }
}
