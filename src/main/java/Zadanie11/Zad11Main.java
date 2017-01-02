package Zadanie11;

import java.util.Scanner;

/**
 * Created by krystian on 29.12.16.
 */
public class Zad11Main {
    public static void main(String[] args) {

        int length;
        String name;
        StringBuilder reverseName = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        name = sc.next().trim();
        length = name.length();
        sc.close();

        while (0 <= --length)
            reverseName.append(name.charAt(length));

        System.out.println("Twoje imię po odwróceniu: " + reverseName);
        if (name.equalsIgnoreCase(reverseName.toString()))
            System.out.println("Twoje imię jest palindromem.");
        else
            System.out.println("Twoje imię nie jest palindromem.");
    }
}
