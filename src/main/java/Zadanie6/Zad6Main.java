package Zadanie6;

import java.util.Scanner;

/**
 * Created by krystian on 26.12.16.
 */
public class Zad6Main {
    public static void main(String[] args) {

        double number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę do sprawdzenia: ");
        number = sc.nextDouble();
        sc.close();

        if (number % 4 == 0)
            System.out.println("Liczba jest podzielna przez 4.");
        else
            System.out.println("Liczba nie jest podzielna przez 4.");

    }
}
