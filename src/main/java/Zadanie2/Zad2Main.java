package Zadanie2;

import java.util.Scanner;

/**
 * Created by krystian on 26.12.16.
 */
public class Zad2Main {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj dwie liczby całkowite rozdzielone spacją: ");
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        System.out.println("Podane liczby: " + a + " i " + b);

        a = b - a;
        b = b - a;
        a = a + b;

        System.out.println("Podane liczby po zamianie: " + a + " i " + b);

    }
}
