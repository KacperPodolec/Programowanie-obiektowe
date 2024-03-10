import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        /*System.out.printf("Hello and welcome!\n");
        int a, b;
        String imie;
        boolean warunek = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartość a: ");
        a = input.nextInt();
        System.out.println("Podaj wartość b: ");
        b = input.nextInt();
        System.out.println("Podaj imie: ");
        imie = input.next();

        System.out.println("a = "+ a +" b = "+b);
        System.out.println("a + b = "+ (a+b));
        System.out.println("Imie: " +imie);*/

        //ZADANIE 1
        //wywołanie metody
        /*System.out.println("Imie: " + imie("Kacper"));
        System.out.println("Wiek: " + wiek(20));*/

        //ZADANIE 2
        /*double a = InputDouble();
        double b = InputDouble();
        kalkulator(a,b);*/

        //ZADANIE 3
        /*double c = InputDouble();
        System.out.println(czyParzysta(c));*/

        //ZADANIE 4
        /*double d = InputDouble();
        System.out.println(czyPodzielna(d));*/

        //ZADANIE 5
        /*double e = InputDouble();
        System.out.println(do3Potegi(e));*/

        //ZADANIE 6
        /*double f = InputDouble();
        System.out.println(pierwiastekKwadratowy(f));*/

        //ZADANIE 7
        /*int g = InputInt();
        int h = InputInt();
        Losuj(g, h);*/

    }//koniec main

    //metoda do wczytywania liczby z klawiatury (double)
    public static double InputDouble() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double liczba = input.nextDouble();
        return liczba;
    }

    //metoda do wczytywania liczby z klawiatury (int)
    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = input.nextInt();
        return liczba;
    }

    //ZADANIE 1
    public static String imie(String imie) {
        return imie;
    }

    public static int wiek(int wiek) {
        return wiek;
    }

    //ZADANIE 2
    public static void kalkulator(double a, double b) {
        System.out.println("Suma " + a + " + " + b + " = " + (a + b)); //ctrl + d
        System.out.println("Różnica " + a + " - " + b + " = " + (a - b));
        System.out.println("Iloczyn " + a + " * " + b + " = " + (a * b));
    }

    //ZADANIE 3
    public static boolean czyParzysta(double liczba) {
        if ((liczba % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //ZADANIE 4
    public static boolean czyPodzielna(double liczba) {
        if ((liczba % 3) == 0 && (liczba % 5) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //ZADANIE 5
    public static double do3Potegi(double liczba) {
        return pow(liczba, 3);
    }

    //ZADANIE 6
    public static double pierwiastekKwadratowy(double liczba) {
        return Math.sqrt(liczba);
    }
    //ZADANIE 7
        /*public static boolean trojkatProstokatny(double a, double b, double c){

        }*/

    //metoda losująca liczby
    public static void Losuj(int a, int b) {
        Random random = new Random();
        int liczba = random.nextInt(a, b);
        System.out.println("Wylosowana liczba: " + liczba);
    }
}