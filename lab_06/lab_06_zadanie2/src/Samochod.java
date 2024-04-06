import java.util.Scanner;

public class Samochod {
    String marka;
    String model;
    String nadwozie;
    String kolor;
    int rokProdukcji;
    int przebieg;

    Samochod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj markę samochodu: ");
        marka = scanner.nextLine();
        System.out.println("Podaj model samochodu: ");
        model = scanner.nextLine();
        System.out.println("Podaj rodzaj nadwozia: ");
        nadwozie = scanner.nextLine();
        System.out.println("Podaj kolor samochodu: ");
        kolor = scanner.nextLine();
        System.out.println("Podaj rok produkcji: ");
        rokProdukcji = scanner.nextInt();
        System.out.println("Podaj przebieg: ");
        przebieg = scanner.nextInt();
        while (przebieg < 0) {
            System.out.println("Przebieg nie może być ujemny. Podaj poprawną wartość: ");
            przebieg = scanner.nextInt();
        }
    }

    Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    void carInfo() {
        System.out.println("Marka: " + marka +
                "\nModel: " + model +
                "\nNadwozie: " + nadwozie +
                "\nKolor: " + kolor +
                "\nRok produkcji " + rokProdukcji +
                "\nPrzebieg: " + przebieg + " t");
    }
}
