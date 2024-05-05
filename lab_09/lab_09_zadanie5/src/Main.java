import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista1.add(i + 1);
        }

        List<Integer> lista2 = new ArrayList<>();

        ListIterator<Integer> iteratorListy1 = lista1.listIterator(lista1.size());

        while (iteratorListy1.hasPrevious()) {
            lista2.add(iteratorListy1.previous());
        }
        System.out.println("Pierwsza lista: " + lista1);
        System.out.println("Druga lista: " + lista2);
    }
}