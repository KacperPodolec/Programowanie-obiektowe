import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        szukaniePary();
    }

    public static void szukaniePary() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pary> listaPar = new ArrayList<>();

        while (true) {
            System.out.println("Podaj imiona pary: ");
            System.out.print("- pierwsze imie: ");
            String pierwszeImie = scanner.nextLine().trim();
            if (pierwszeImie.equals("-")) {
                break;
            }

            System.out.print("- drugie imie: ");
            String drugieImie = scanner.nextLine().trim();
            if (drugieImie.equals("-")) {
                break;
            }

            Pary para = new Pary(pierwszeImie, drugieImie);
            listaPar.add(para);
        }

        if (!listaPar.isEmpty()) {
            System.out.println("Podaj imię aby znaleźć parę: ");
            String imiePartnera = scanner.nextLine().trim();

            for (Pary para : listaPar) {
                if (para.zawieraImie(imiePartnera)) {
                    String partner = para.zwrocPartnera(imiePartnera);
                    System.out.println("Szukana para: " + imiePartnera + " i " + partner);
                } else {
                    System.out.println("Nie znaleziono pary");
                }
            }
        }
    }
}