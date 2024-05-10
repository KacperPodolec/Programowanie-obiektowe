import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] produkty = {"Cukier", "Woda", "Pomidor", "Kawa", "Hebrata", "Masło", "Jajka", "Ciastka", "Sól", "Pieprz"};

        Stos<String> koszyk = new Stos<>();

        Random random = new Random();
        int iloscProdduktow = random.nextInt(15) + 1;
        for (int i = 0; i < iloscProdduktow; i++) {
            String produkt = produkty[random.nextInt(produkty.length)];
            koszyk.push(produkt);
        }

        System.out.println("Zawartość koszyka:");
        while (!koszyk.empty()) {
            System.out.println(koszyk.pop());
        }

        Queue<String> kolejka = new LinkedList<>();
        int dlugoscKolejki = random.nextInt(10) + 1;
        int mojaPozycjaWKolejce = random.nextInt(dlugoscKolejki) + 1;
        for (int i = 1; i <= dlugoscKolejki; i++) {
            kolejka.offer("Osoba " + i);
        }

        List<String> kolejkaList = new ArrayList<>(kolejka);
        Collections.shuffle(kolejkaList);
        kolejka = new LinkedList<>(kolejkaList);

        System.out.println("\nKolejka:");
        for (String osoba : kolejka) {
            System.out.println(osoba);
        }
        System.out.println("Moja pozycja w kolejce: " + mojaPozycjaWKolejce);
    }
}