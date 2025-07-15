package org.example;

import java.util.Scanner;

public class VerificareParola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("va rugam introduceti parola: ");
        String parolaIntrodusa = scanner.nextLine();
        String parolaCorecta = "java123";
        if(parolaIntrodusa.equalsIgnoreCase(parolaCorecta))

        {
            System.out.println("Parola corecta. Autentificare reusita!");
        } else

        {
            System.out.println("Parola gresita. Acces respins!");
        }
    }
}
