import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        kalkulator();
    }

    public static void kalkulator() throws InputMismatchException {
        int dzialanie;
        int liczba1;
        int liczba2;
        int wynik;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Wybierz działanie:\nDodawanie - 1\nOdejmowanie - 2\nMnożenie - 3\nDzielenie - 4\nReszta z dzielenia - 5\nPodaj liczbę: ");
            dzialanie = input.nextInt();
            if (dzialanie < 1 || dzialanie > 5) {
                throw new InputMismatchException();
            }

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
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("Niepoprawna wartość. Spróbuj ponownie");
        } finally {

        }
    }
}