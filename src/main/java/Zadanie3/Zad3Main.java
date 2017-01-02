package Zadanie3;

import java.util.Scanner;

/**
 * Created by krystian on 26.12.16.
 */
public class Zad3Main {
    public static void main(String[] args) {

        double number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbe zmiennoprzecinkową: ");
        number = sc.nextDouble();
        sc.close();

        System.out.println("Wartość całkowita podanej liczby: " + (int)number);
    }
}
