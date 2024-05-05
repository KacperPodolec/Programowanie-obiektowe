import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osoba[] tablicaOsob = new Osoba[]{
                new Osoba("Jan", "Kowalski", 12),
                new Osoba("Andrzej", "Nowak", 46),
                new Osoba("Anna", "Dąbrowska", 29),
                new Osoba("Karolina", "Kowalska", 20),
                new Osoba("Katarzyna", "Górska", 24)
        };

        System.out.println("Początkowa lista osób:");
        List<Osoba> listaOsob = new ArrayList<>(Arrays.asList(tablicaOsob));
        for (Osoba osoba : listaOsob) {
            System.out.println(osoba);
        }

        System.out.println("\n\"Wyłuskana\" lista osób:");
        List<Osoba> podlista = listaOsob.subList(1, 4);
        listaOsob.removeAll(podlista);
        for (Osoba osoba : listaOsob) {
            System.out.println(osoba);
        }
    }
}