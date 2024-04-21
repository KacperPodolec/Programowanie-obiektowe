import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzZKonsoli {
    Scanner scanner = new Scanner(System.in);

    public void wprowadzInt() throws InputMismatchException {
        try {
            System.out.println("podaj liczbę: ");
            int liczba = scanner.nextInt();
            //String input = scanner.nextLine();
            //int liczba = Integer.parseInt(input);
            if (liczba != (int) liczba) {
                throw new InputMismatchException("Podana liczba nie jest typu int");
            }
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }
}
