import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        imiona();
    }

    public static void imiona() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaImion = new ArrayList<>();
        String imie;

        do {
            System.out.println("podaj imię: ");
            imie = scanner.nextLine();
            listaImion.add(imie);
        } while (!imie.equals("-"));

        Set<String> unikalneImiona = new HashSet<>(listaImion);
        unikalneImiona.remove("-");
        int liczbaUnikalnychImion = unikalneImiona.size();
        System.out.println("Unikalne imiona: " + liczbaUnikalnychImion);
    }
}