import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1
        List<Kangur> listaKangurow = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaKangurow.add(new Kangur(i));
        }

        /*for (int i = 0; i < listaKangurow.size(); i++) {
            (listaKangurow.get(i)).skok();
        }*/

        //2
        /*Iterator<Kangur> iterator2 = listaKangurow.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().skok();
        }*/

        //3
        Map<String, Kangur> mapaKangurow = new HashMap<>();
        mapaKangurow.put("Jacek", new Kangur(1));
        mapaKangurow.put("Marta", new Kangur(2));
        mapaKangurow.put("Natalia", new Kangur(3));
        mapaKangurow.put("Błażej", new Kangur(4));
        mapaKangurow.put("Krystian", new Kangur(5));
        mapaKangurow.put("Tetiana", new Kangur(6));
        mapaKangurow.put("Piort", new Kangur(7));
        mapaKangurow.put("Paweł", new Kangur(8));
        mapaKangurow.put("Maria", new Kangur(9));
        mapaKangurow.put("Karolina", new Kangur(10));

        Iterator<String> iterator3 = mapaKangurow.keySet().iterator();

        /*while (iterator3.hasNext()) {
            String imie = iterator3.next();
            Kangur kangur = mapaKangurow.get(imie);
            System.out.print(imie + ", ");
            kangur.skok();
        }*/

        //4
        Map<String, Kangur> posortowanaMapa = new TreeMap<>(mapaKangurow);

        Map<String, Kangur> linkedHashMap = new LinkedHashMap<>(posortowanaMapa);

        for (Map.Entry<String, Kangur> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().nrKangura);
        }
    }
}