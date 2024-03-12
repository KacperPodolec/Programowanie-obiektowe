import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

        int[] arrayInt = {1,2,3,4};
        System.out.println("długość tablicy: "+ arrayInt.length);
        for (int i = 0; i <arrayInt.length; i++){
            System.out.println("array ["+(i+1)+"] = "+arrayInt[i]);
        }

        System.out.println("\n\n");
        //petla for each
        for(int item : arrayInt){
            System.out.println("wartosc elementu: " + item);
        }

        int[][] matrixA = new int[3][4];
        double[][] matrixB = {
                {1,2,3,4},
                {2,3}
        };
        for(int i = 0; i < matrixB.length; i++){
            for(int j = 0; j <matrixB.length; j++){
                System.out.println("element: "+ matrixB[i][j]);
            }
        }*/

        //ZADANIE 1
        //grupaLab();

        //ZADANIE 2
        //liczby();

        //ZADANIE 3
        //ciagLiczbyParzyste();

        //ZADANIE 4
        //przedzialLiczbyParzyste();

        //ZADANIE 5
        //czyToPalindrom();

    }//koniec main

    //wczytywanie liczb z klawiatury (int)
    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = input.nextInt();
        return liczba;
    }

    //metoda losująca liczby
    public static int Losuj() {
        int a = 1;
        int b = 20;
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(a, b);
        return wylosowanaLiczba;
    }

    //ZADANIE 1
    public static void grupaLab() {
        double sumaPunktow = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę studentów: ");
        double n = input.nextDouble();

        int i = 0;
        while (i < n) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Student [" + (i + 1) + "] - punkty: ");
            double punkty = input.nextDouble();
            sumaPunktow += punkty;
            i++;
        }
        double sredniaPunktow = sumaPunktow / n;
        System.out.println(sredniaPunktow);
    }

    //ZADANIE 2
    public static void liczby() {
        int iloscLiczbDodatnich = 0;
        int iloscLiczbUjemnych = 0;
        double sumaLiczbDodatnich = 0;
        double sumaLiczbUjemnych = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz kolejno 10 liczb");
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę:");
            double n = input.nextDouble();

            if (n > 0) {
                iloscLiczbDodatnich += 1;
                sumaLiczbDodatnich += n;
            } else {
                iloscLiczbUjemnych += 1;
                sumaLiczbUjemnych += n;
            }
        }
        System.out.println("Liczby dodatnie: " + iloscLiczbDodatnich);
        System.out.println("Liczby ujemne: " + iloscLiczbUjemnych);
        System.out.println("Suma liczby dodatnich: " + sumaLiczbDodatnich);
        System.out.println("Suma liczby ujemnych: " + sumaLiczbUjemnych);
    }

    //ZADANIE 3
    public static void ciagLiczbyParzyste() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów ciągu: ");
        int dlugoscCiagu = input.nextInt();

        int sumaLiczbParzystych = 0;

        for (int i = 0; i < dlugoscCiagu; i++) {

            int wylosowana = Losuj();
            System.out.println("Element [" + (i + 1) + "]: " + wylosowana);
            if (wylosowana % 2 == 0) {
                sumaLiczbParzystych += wylosowana;
            }
        }
        System.out.println("\nSuma liczb parzystych: " + sumaLiczbParzystych);
    }

    //ZADANIE 4
    public static void przedzialLiczbyParzyste() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do wylosowania z przedziału (-10,45): ");
        int wylosowaneLiczby = input.nextInt();

        int sumaLiczbParzystych = 0;

        for (int i = 0; i < wylosowaneLiczby; i++) {

            Random random = new Random();
            int wylosowana = random.nextInt(56) - 10;
            System.out.println("Wylosowana [" + (i + 1) + "]: " + wylosowana);
            if (wylosowana % 2 == 0) {
                sumaLiczbParzystych += wylosowana;
            }
        }
        System.out.println("\nSuma liczb parzystych: " + sumaLiczbParzystych);
    }

    //ZADANIE 5
    public static void czyToPalindrom() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz słowo, aby sprawdzić czy jest ono palindromem: ");
        String slowo = input.nextLine().toLowerCase();

        String odwroconeSlowo = odwrocSlowo(slowo);
        System.out.println("Podane słowo: " + slowo);
        System.out.println("Odwrócone słowo: " + odwroconeSlowo);

        //metoda equals() porównuje zawartości obu łańcuchów znaków
        if (slowo.equals(odwroconeSlowo)) {
            System.out.println("Słowo \"" + slowo + "\" jest palindromem.");
        } else {
            System.out.println("Słowo \"" + slowo + "\" nie jest palindromem.");
        }
    }

    //metoda do odwracania słów
    public static String odwrocSlowo(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}