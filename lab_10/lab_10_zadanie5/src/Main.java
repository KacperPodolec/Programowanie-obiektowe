import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Film> prywatnaKolekcja = new HashMap<Integer, Film>();

        Horror horror1 = new Horror(117, "Obcy");
        Komedia komedia1 = new Komedia(89, "Zoolander");

        komedia1.oznaczJakoObejrzany();

        prywatnaKolekcja.put(1, horror1);
        prywatnaKolekcja.put(2, komedia1);

        Iterator<Map.Entry<Integer, Film>> iterator = prywatnaKolekcja.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Film> entry = iterator.next();
            System.out.println("Nr: " + entry.getKey() +
                    "\nTytuł: " + entry.getValue().getTytul() +
                    "\nCzas trwania: " + entry.getValue().getCzasTrwania() +
                    "\nObejrzany: " + (entry.getValue().isCzyObejrzany() ? "tak" : "nie") +
                    "\nTyp: " + (entry.getValue() instanceof Horror ? ((Horror) entry.getValue()).getTyp() : (entry.getValue() instanceof Komedia ? ((Komedia) entry.getValue()).getTyp() : "Nieznany")));
        }
    }
}