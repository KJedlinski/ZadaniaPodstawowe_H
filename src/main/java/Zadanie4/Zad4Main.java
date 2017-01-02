package Zadanie4;

/**
 * Created by krystian on 26.12.16.
 */
public class Zad4Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a = b = c * 1 + 2;
        System.out.println("a=" + a + " b=" + b + " c=" + c);//5,5,3
        a = b = c * (1 + 2);
        System.out.println("a=" + a + " b=" + b + " c=" + c);//9,9,3
        a = b++;
        System.out.println("a=" + a + " b=" + b + " c=" + c);//9,10,3
        c = --b;
        System.out.println("a=" + a + " b=" + b + " c=" + c);//9,9,9
        a++;
        b++;
        c++;
        System.out.println("a=" + a + " b=" + b + " c=" + c);//10,10,10
        a = b++ * ++c;
        System.out.println("a=" + a + " b=" + b + " c=" + c);//110,11,11
        int DlugaNazwaZmiennej = 20;
        DlugaNazwaZmiennej = DlugaNazwaZmiennej * 10;//200
        DlugaNazwaZmiennej *= 10;//2000
        System.out.println(DlugaNazwaZmiennej);//2000
    }
}

