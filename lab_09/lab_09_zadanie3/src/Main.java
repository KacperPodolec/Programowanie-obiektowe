import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        listaUczestnikow();
    }

    public static void listaUczestnikow() {
        Uczestnicy ucz1 = new Uczestnicy(01, "Anna", 27);
        Uczestnicy ucz2 = new Uczestnicy(02, "Bartosz", 40);
        Uczestnicy ucz3 = new Uczestnicy(03, "Kamil", 17);

        List<Uczestnicy> uczestnicy = new ArrayList<>();

        uczestnicy.add(ucz1);
        uczestnicy.add(ucz2);
        uczestnicy.add(ucz3);

        System.out.println("Lista uczestników:");
        for (Uczestnicy uczestnik : uczestnicy) {
            System.out.println(uczestnik);
        }

        //osoby niepełnoletnie ArrayList
        List<Uczestnicy> niepelnoletniArrayList = filtorwanieOsobyNiepelnotenieArrayList(uczestnicy);
        System.out.println("\nOsoby niepełnotenie (ArrayList):");
        for (Uczestnicy uczestnik : niepelnoletniArrayList) {
            System.out.println(uczestnik);
        }

        //osoby niepełnotenie LinkedList
        List<Uczestnicy> niepelnoletniLinkedList = filtrowanieOsobyNiepelnoletnieLinkedList(uczestnicy);
        System.out.println("\nOsoby niepełnoletnie (LinkedList):");
        for (Uczestnicy uczestnik : niepelnoletniLinkedList) {
            System.out.println(uczestnik);
        }
    }

    //filtrowanie ArrayList
    public static List<Uczestnicy> filtorwanieOsobyNiepelnotenieArrayList(List<Uczestnicy> lista) {
        List<Uczestnicy> niepelnoletni = new ArrayList<>();
        for (Uczestnicy uczestnik : lista) {
            if (uczestnik.getWiek() < 18) {
                niepelnoletni.add(uczestnik);
            }
        }
        return niepelnoletni;
    }

    //filtrowawnie LinkedList
    public static List<Uczestnicy> filtrowanieOsobyNiepelnoletnieLinkedList(List<Uczestnicy> lista) {
        List<Uczestnicy> niepelnoletni = new LinkedList<>();
        for (Uczestnicy uczestnik : lista) {
            if (uczestnik.getWiek() < 18) {
                niepelnoletni.add(uczestnik);
            }
        }
        return niepelnoletni;
    }
}