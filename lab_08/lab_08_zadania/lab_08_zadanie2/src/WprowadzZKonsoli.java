import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzZKonsoli {
    int liczbaTypuInt;
    char znak;
    float liczbaTypuFloat;
    Scanner scanner = new Scanner(System.in);

    public void wprowadzFloat() throws InputMismatchException {
        try {
            System.out.println("podaj liczbę (float): ");
            liczbaTypuFloat = scanner.nextFloat();
            System.out.println(getLiczbaTypuFloat());

        } catch (InputMismatchException e) {
            System.err.println("Podana wartość nie jest typu float");
        }
    }

    public void wprowadzChar() throws InputMismatchException {
        try {
            System.out.println("podaj znak: ");
            znak = scanner.next().charAt(0);
            System.out.println(getZnak());

        } catch (InputMismatchException e) {
            System.err.println("Podana wartość nie jest typu char");
        }
    }

    public void wprowadzInt() throws InputMismatchException {
        try {
            System.out.println("podaj liczbę (int): ");
            liczbaTypuInt = scanner.nextInt();
            System.out.println(getLiczbaTypuInt());

        } catch (InputMismatchException e) {
            System.err.println("Podana wartość nie jest typu int");
        }
    }

    public float getLiczbaTypuFloat() {
        return liczbaTypuFloat;
    }

    public char getZnak() {
        return znak;
    }

    public int getLiczbaTypuInt() {
        return liczbaTypuInt;
    }
}
