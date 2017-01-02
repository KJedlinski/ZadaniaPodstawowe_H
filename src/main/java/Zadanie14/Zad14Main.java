package Zadanie14;

import java.util.Scanner;

/**
 * Created by krystian on 29.12.16.
 */
public class Zad14Main {
    public static void main(String[] args) {

        String passwd;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Podaj poprawne hasło: ");
            passwd = sc.nextLine();
        } while(!passwd.equals("AkademiaKodu"));

        System.out.println("Hasło zaakceptowane. Gratulacje.");
    }
}
