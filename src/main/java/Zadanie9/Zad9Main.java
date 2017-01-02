package Zadanie9;

import java.util.Scanner;

/**
 * Created by krystian on 29.12.16.
 */
public class Zad9Main {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dwie liczby całkowite rozdzielone spacją: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        if(a == b) System.out.println("Zmienne są równe.");
        else System.out.println("Zmienne nie są równe.");
    }
}
