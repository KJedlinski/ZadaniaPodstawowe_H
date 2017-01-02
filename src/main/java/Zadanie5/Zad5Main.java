package Zadanie5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by krystian on 26.12.16.
 */
public class Zad5Main {

    private static int age;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        ageCheck();
    }

    public static void ageCheck() {

        System.out.print("Podaj proszę swój wiek w latach: ");

        try {
            age = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Nieprawidłowe dane!\nWprowadź liczbę całkowitą reprezentującą Twój wiek w latach.");
            ageCheck();
        }

        if (age >= 18) {
            sc.close();
            System.out.println("Jesteś pełnoletni.");
            System.exit(0);
        } else if (age <= 0) {
            System.out.println("Podaj poprawny wiek!");
            ageCheck();
        } else {
            sc.close();
            System.out.println("Nie jesteś jeszcze pełnoletni.");
            System.exit(0);
        }
    }
}
