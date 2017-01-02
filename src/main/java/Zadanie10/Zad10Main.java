package Zadanie10;

import java.util.Scanner;

/**
 * Created by krystian on 29.12.16.
 */
public class Zad10Main {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swoje imię: ");
        name = sc.next();
        sc.close();

        System.out.println("Ostatnią literą twojego imienia jest: "
                            +"'"+name.charAt(name.length()-1)+"'.");

    }
}
