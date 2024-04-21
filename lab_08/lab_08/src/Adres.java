//do zadania trzeciego

import java.util.ArrayList;
import java.util.List;

public class Adres {
    String ulica;
    int numerDomu;
    String kodPocztowy;
    String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        List<String> bledy = new ArrayList<>();

        if (ulica == null) {
            bledy.add("Ulica nie może być nullem");
        }
        if (numerDomu <= 0) {
            bledy.add("Numer domu musi być większy od zera");
        }
        if (kodPocztowy == null) {
            bledy.add("Kod pocztowy nie może być nullem");
        }
        if (miasto == null) {
            bledy.add("Miasto nie może być nullem");
        }

        if (!bledy.isEmpty()) {
            throw new NieprawidlowyAdresException("Błędny adres:\n" + bledy);
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public void viewAdres() {
        System.out.println("Ulica: " + ulica +
                "\nNumer domu: " + numerDomu +
                "\nKod pocztowy: " + kodPocztowy +
                "\nMiasto: " + miasto);
    }
}
