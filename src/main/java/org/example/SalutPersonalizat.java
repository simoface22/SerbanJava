package org.javacourse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SalutPersonalizat {
    public static void main(String[] args) {

        Scanner cititor = new Scanner(System.in);
        System.out.print("Scrie-ti numele: ");

        String numeUtilizator = cititor.nextLine();

        System.out.print("Acum scrie-ti si varsta: ");

        int varstaUtilizator = cititor.nextInt();
//        try(e:InputMismatchException) {
//        int varstaUtilizator = cititor.nextInt();
//        } catch() {
//            System.out.println("Ati introdus un caracter nepermis! Va rugam introduceti un numar intreg!");
//        }

        int varstaViitoare = varstaUtilizator + 1;

        System.out.println("Salutare, " + numeUtilizator + "! La anul pe vremea asta, vei avea " + varstaViitoare + " de ani!");

        cititor.close();
    }
}
