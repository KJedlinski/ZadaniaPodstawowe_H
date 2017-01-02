package Zadanie12;

import java.util.Scanner;

/**
 * Created by krystian on 29.12.16.
 */
public class Zad12Main {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        System.out.println("Podaj jakiś napis: ");
        text.append(new Scanner(System.in).nextLine()).reverse();
        System.out.println("\nTwój napis na wspak ;) : \n" + text);

    }
}
