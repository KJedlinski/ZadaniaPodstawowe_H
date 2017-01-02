package Zadanie13;

import java.util.Scanner;

/**
 * Created by krystian on 29.12.16.
 */
public class Zad13Main {
    public static void main(String[] args) {

        int length;
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        name = sc.next().trim();
        length = name.length();
        sc.close();

        System.out.println("\nWypiszę teraz co drugą literę: ");
        for (int i = 0; i < length - 1; i += 2) {
            System.out.print(name.charAt(i+1));
        }
    }
}
