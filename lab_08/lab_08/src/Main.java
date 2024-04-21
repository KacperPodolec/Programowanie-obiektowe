import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zadanie1();
        //zadanie2(-2);
        //zadanie3();
    }

    public static void zadanie3() {
        try {
            Adres adres1 = new Adres(null, -16, null, null);
            adres1.viewAdres();

        } catch (NieprawidlowyAdresException e) {
            System.err.println(e.getMessage());
        } finally {

        }
    }

    public static void zadanie2(int liczba) {
        try {
            int wynik = 1;
            for (int i = 1; i <= liczba; i++) {
                wynik = wynik * i;
            }

            if (liczba < 0) {
                throw new BlednaWartoscDlaSilniException("Liczba nie może być ujemna!");
            }

            System.out.println(wynik);

        } catch (BlednaWartoscDlaSilniException e) {
            System.err.println(e.getMessage());
        } finally {

        }
    }

    public static void zadanie1() {
        try {
            System.out.println("podaj liczbę: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            double liczba = Double.parseDouble(input);

            if (liczba < 0) {
                throw new IllegalArgumentException("Liczba nie może być ujemna!");
            }

            System.out.println(Math.sqrt(liczba));

        } catch (NumberFormatException e) {
            System.err.println("Podany ciąg znaków nie jest liczbą.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {

        }
    }
}