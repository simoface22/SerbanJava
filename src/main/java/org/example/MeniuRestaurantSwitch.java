package org.example;

import java.util.Scanner;

public class MeniuRestaurantSwitch {
    public static void main(String[] args) {

        Scanner cititor = new Scanner(System.in);
        System.out.println("Plasati comanda: Optiuni valide: 1 - Ciorba de burta, 2 - Sarmale cu mamaliguta sau 3 - Papanasi." +
                "\nSelectia trebuie sa fie un numar intreg! ---> ");

        int optiuneMeniu = cititor.nextInt();

        switch (optiuneMeniu) {
            case 1:
                System.out.println("Ati ales Ciorba de burta.");
                break;
            case 2:
                System.out.println("Ati ales Sarmale cu mamaliguta.");
                // Se va afișa aceasta
                break;
            case 3:
                System.out.println("Ati ales Papanasi.");
                break;
            default:
                System.out.println("Optiune invalida. Va rugam alegeti 1, 2 sau 3.");
        }
    }
}
