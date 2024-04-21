import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę a:");
        double a = scanner.nextDouble();
        System.out.println("podaj liczbę b:");
        double b = scanner.nextDouble();

        try {
            if (b == 0) {
                throw new DzieleniePrzezZeroException("Nie można dzielić przez zero!");
            }
            System.out.println("Wynik: " + (a / b));

        } catch (DzieleniePrzezZeroException e) {
            System.err.println(e.getMessage());
        } finally {

        }
    }
}