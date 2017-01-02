package Zadanie8;

/**
 * Created by krystian on 26.12.16.
 */
public class Zad8Main {
    public static void main(String[] args) {

        int factorial = 5;
        int result = factorial;

        // Obliczanie silni w pętli

        while (factorial > 1) result *= --factorial;
        System.out.println("Wynik: " + result);

        //Obliczanie silni przy pomocy lambdy

        /*
        nie działa !!!

        int lambdaResult = (int n) -> countFactorial(n);
        System.out.println("Wynik: " + lambdaResult);
        */
    }
    /*
    public static int countFactorial(int n){
        int res = 0;
        while (n > 1) res *= --n;
        return n;
    }
    */
}