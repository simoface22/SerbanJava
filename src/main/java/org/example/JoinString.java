package org.example;

public class JoinString {
    public static void main(String[] args) {
        int a = 1;
        String b = "2";
        char c = 'A';

        int suma = a + Integer.parseInt(b);
        int suma2 = a + (int)c;

        System.out.println("a: " + a);
        System.out.println("c: " + (int)c);

        System.out.println("1" + c);


        if('a' < 'A') {
            System.out.println("a este mai mic decat A");
        } else {
            System.out.println("a este mai mare decat A");
        }
        System.out.println();

//        System.out.println(suma);
        System.out.println(suma2);
    }
}
