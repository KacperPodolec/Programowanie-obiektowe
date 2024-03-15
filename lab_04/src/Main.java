import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ZADANIE 1
        //losowaTablica();

        //ZADANIE 2
        //coDrugiElement();

        //ZADANIE 3
        //wielkieLitery();

        //ZADANIE 4
        //naOdwrot();

        //ZADANIE 5
        //sortowanieLiczb();

        //ZADANIE 6
        //tablicaSilnia();

        //ZADANIE 7
        //porownajTablice();

    }//koniec main

    //metoda losująca liczby
    public static int Losuj() {
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(10) + 1;
        return wylosowanaLiczba;
    }

    //metoda do odwracania słów
    public static String odwrocSlowo(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    //ZADANIE 1
    public static void losowaTablica() {
        int suma = 0;

        int[] liczby = new int[Losuj()];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = Losuj();
            suma += liczby[i];
        }
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Element [" + (i + 1) + "]: " + liczby[i]);
        }
        System.out.println("Suma: " + suma);

        double srednia = (double) suma / liczby.length;
        System.out.println("Średnia: " + srednia);
    }

    //ZADANIE 2
    public static void coDrugiElement() {
        int[] tablicaP = new int[10];
        int[] tablicaNP = new int[9];

        System.out.println("Tablica z parzystą liczbą elementów");
        for (int i = 0; i < tablicaP.length; i++) {
            tablicaP[i] = Losuj();
            System.out.println("Element [" + (i + 1) + "]: " + tablicaP[i]);
        }
        System.out.println("Co drugi element:");
        for (int i = 1; i < tablicaP.length; i += 2) {
            System.out.print(tablicaP[i] + " ");
        }

        System.out.println("\n\nTablica z nieparzystą liczbą elementów");
        for (int i = 0; i < tablicaNP.length; i++) {
            tablicaNP[i] = Losuj();
            System.out.println("Element [" + (i + 1) + "]: " + tablicaNP[i]);
        }
        System.out.println("Co drugi element:");
        for (int i = 1; i < tablicaNP.length; i += 2) {
            System.out.print(tablicaNP[i] + " ");
        }
    }

    //ZADANIE 3
    public static void wielkieLitery() {
        String[] slowa = {"Przykładowe", "wartości", "tablicy"};

        for (int i = 0; i < slowa.length; i++) {
            slowa[i] = slowa[i].toUpperCase();
        }
        for (String str : slowa) {
            System.out.print(str + " ");
        }
    }

    //ZADANIE 4
    public static void naOdwrot() {
        String[] slowa = new String[5];

        for (int i = 0; i < slowa.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Wpisz dowolne słowo: ");
            String podaneSlowo = input.next();
            slowa[i] = podaneSlowo;
        }
        for (int i = slowa.length - 1; i >= 0; i--) {
            System.out.println(odwrocSlowo(slowa[i]));
        }
    }

    //ZADANIE 5
    public static void sortowanieLiczb() {
        int[] tablica = new int[8];

        for (int i = 0; i < tablica.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            tablica[i] = input.nextInt();
        }
        System.out.println("Tablica nieposortowana:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Element [" + (i + 1) + "]: " + tablica[i]);
        }
        Arrays.sort(tablica);
        System.out.println("Tablica posortowana:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Element [" + (i + 1) + "]: " + tablica[i]);
        }
    }

    //ZADANIE 6
    public static void tablicaSilnia() {
        int[] tablicaLiczb = new int[5];

        for (int i = 0; i < tablicaLiczb.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            tablicaLiczb[i] = input.nextInt();
        }
        for (int i : tablicaLiczb) {
            System.out.println("Silnia liczby " + i + " wynosi: " + silnia(i));
        }
    }

    public static int silnia(int liczba) {
        int wynik = 1;
        if (liczba == 0) {
            wynik = 1;
        } else {
            for (int i = 1; i <= liczba; i++) {
                wynik *= i;
            }
        }
        return wynik;
    }

    //ZADANIE 7
    public static void porownajTablice() {
        String[] slowa1 = {"Przykładowy", "tekst", "w", "tablicy"};
        String[] slowa2 = {"Przykładowy", "tekst", "w", "tablicy"};
        boolean czyTakieSame = true;

        for (int i = 0; i < slowa1.length; i++) {
            if (slowa1[i] == slowa2[i]) {
                czyTakieSame = true;

            } else {
                czyTakieSame = false;
                break;
            }
        }
        System.out.println(czyTakieSame);
    }
}