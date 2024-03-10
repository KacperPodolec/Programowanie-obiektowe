import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        //ZADANIE 1
        /*int a = InputInt();
        int b = InputInt();
        int c = InputInt();
        rownanieKwadratowe(a,b,c);*/

        //ZADANIE 2
        /*double x = InputDouble();
        wartoscFunkcjiA(x);
        wartoscFunkcjiB(x);
        wartoscFunkcjiC(x);*/

        //ZADANIE 3
        /*double x = InputDouble();
        double y = InputDouble();
        double z = InputDouble();
        porzadkowanieLiczb(x,y,z);*/

        //ZADANIE 4
        //deszczIAutobus();

        //ZADANIE 5
        //nowySamochod();

        //ZADANIE 6
        //kalkulator();
    }

    //metoda do wczytywania liczby z klawiatury (int)
    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = input.nextInt();
        return liczba;
    }

    //metoda do wczytywania liczby z klawiatury (double)
    public static double InputDouble() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double liczba = input.nextDouble();
        return liczba;
    }

    //metoda do wczytywania wartości z klawiatury (boolean)
    public static boolean InputBoolean() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartość: ");
        boolean wartosc = input.nextBoolean();
        return wartosc;
    }

    //ZADANIE 1
    public static void rownanieKwadratowe(int a, int b, int c) {
        double delta = (pow(b, 2) - (4 * a * c));
        System.out.println("Delta: " + delta);

        if (delta > 0) {
            double deltaPierwiastek = Math.sqrt(delta);
            double x1 = (-b + deltaPierwiastek) / (2 * a);
            double x2 = (-b - deltaPierwiastek) / (2 * a);

            System.out.println("Pierwiastek z delty: " + deltaPierwiastek);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (delta == 0) {
            double x0 = (-b / (2 * a));
            System.out.println("x0: " + x0);
        } else {
            System.out.println("Brak pierwiastków");
        }
    }

    //ZADANIE 2
    public static void wartoscFunkcjiA(double x) {
        if (x > 0) {
            System.out.println("a(x) = " + (2 * x));
        } else if (x == 0) {
            System.out.println("a(x) = 0");
        } else {
            System.out.println("a(x) = " + (-3 * x));
        }
    }

    public static void wartoscFunkcjiB(double x) {
        if (x >= 1) {
            System.out.println("b(x) = " + (pow(x, 2)));
        } else {
            System.out.println("b(x) = " + x);
        }
    }

    public static void wartoscFunkcjiC(double x) {
        if (x > 2) {
            System.out.println("a(x) = " + (2 + x));
        } else if (x == 2) {
            System.out.println("a(x) = 8");
        } else {
            System.out.println("a(x) = " + (x - 4));
        }
    }

    //ZADANIE 3
    public static void porzadkowanieLiczb(double x, double y, double z) {
        double max = 0;
        double middle = 0;
        double min = 0;
        if (x > y) {
            max = x;
            min = y;
            if (y > z) {
                middle = y;
                min = z;
            } else {
                middle = z;
                min = y;
            }
        } else {
            max = y;
            min = x;
            if (x > z) {
                middle = x;
                min = z;
            } else {
                middle = z;
                min = x;
            }
        }
        System.out.println(min + ", " + middle + ", " + max);
    }

    //ZADANIE 4
    public static void deszczIAutobus() {
        boolean deszcz = true;
        boolean autobus = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Czy pada deszcz (true lub false)?: ");
        deszcz = input.nextBoolean();
        System.out.println("Czy autobus jest na przystanku (true lub false)?: ");
        autobus = input.nextBoolean();

        if ((deszcz == true) && (autobus == true)) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if ((deszcz == true) && (!(autobus == true))) {
            System.out.println("Nie dostaniesz się na uczelnie");
        } else {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }

    //ZADANIE 5
    public static void nowySamochod() {
        Scanner input = new Scanner(System.in);

        System.out.println("Czy jest zniżka (true lub false)?: ");
        boolean znizka = input.nextBoolean();
        System.out.println("Czy otrzymałeś podwyżkę (true lub false)?: ");
        boolean premia = input.nextBoolean();

        if (!(znizka) || premia) {
            System.out.println("Możesz kupić samochód!\nZniżki na samochód nie ma");
        } else if (!(znizka) || !(premia)) {
            System.out.println("Zakup samochodu trzeba odłożyć na później...\nZniżki na samochód nie ma");
        } else if ((znizka || premia) == true) {
            System.out.println("Możesz kupić samochód!");
        }
    }

    //ZADANIE 6
    public static void kalkulator() {
        int dzialanie;
        int liczba1;
        int liczba2;
        int wynik;
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz działanie:\nDodawanie - 1\nOdejmowanie - 2\nMnożenie - 3\nDzielenie - 4\nReszta z dzielenia - 5\nPodaj liczbę: ");
        dzialanie = input.nextInt();
        System.out.println("Podaj liczbe: ");
        liczba1 = input.nextInt();
        System.out.println("Podaj liczbe: ");
        liczba2 = input.nextInt();

        switch (dzialanie) {
            case 1:
                wynik = (liczba1 + liczba2);
                System.out.println(liczba1 + " + " + liczba2 + " = " + wynik);
                break;
            case 2:
                wynik = (liczba1 - liczba2);
                System.out.println(liczba1 + " - " + liczba2 + " = " + wynik);
                break;
            case 3:
                wynik = (liczba1 * liczba2);
                System.out.println(liczba1 + " * " + liczba2 + " = " + wynik);
                break;
            case 4:
                wynik = (liczba1 / liczba2);
                System.out.println(liczba1 + " / " + liczba2 + " = " + wynik);
                break;
            case 5:
                wynik = (liczba1 % liczba2);
                System.out.println(liczba1 + " % " + liczba2 + " = " + wynik);
                break;
            default:
                System.out.println("Niepoprawna wartość");
                break;
        }
    }
}