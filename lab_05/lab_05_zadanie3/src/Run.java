import java.util.Scanner;

public class Run {
    Gatunek czlowiek = new Gatunek("człowiek", "człowiek rozumny", 23, 46, "Gatunek ssaka naczelnego, jedyny występujący współcześnie przedstawiciel rodzaju Homo.");
    Gatunek pies = new Gatunek("wilk", "pies domowy", 37, 74, "Udomowiony gatunek (lub podgatunek) ssaka drapieżnego z rodziny psowatych (Canidae), traktowany przez niektóre ujęcia systematyczne za podgatunek wilka.");
    Gatunek kot = new Gatunek("kot", "kot domowy", 19, 38, "Udomowiony gatunek ssaka z rzędu drapieżnych z rodziny kotowatych. Koty zostały udomowione około 9500 lat temu i są obecnie najpopularniejszymi zwierzętami domowymi na świecie.");
    boolean warunek = true;

    public void Runing() {
        int wybor;
        while (warunek) {
            Menu();
            wybor = InputInt();
            switch (wybor) {
                case 1 -> viewHuman();
                case 2 -> viewDog();
                case 3 -> viewCat();
                case 4 -> cloneObject();
                case 5 -> exitProgram();
                default -> {
                    defaultInstruction();
                    nextStep();
                }
            }
        }
    }

    private void nextStep() {
        System.out.println("Czy chcesz wybrać inną opcje? (y/n)");
        String next = InputString();
        if (next.equals("y")) {
            System.out.println("\nWybierz kolejną opcje:");
        } else if (next.equals("n")) {
            exitProgram();
        } else {
            System.out.println("Niepoprawna wartość. Spróbuj ponownie");
            nextStep();
        }
    }

    private void defaultInstruction() {
        System.out.println("Niepoprawna wartość. Spróbuj ponownie");
    }

    private void exitProgram() {
        System.out.println("Czy chcesz opuścic program? (y/n)");
        String odpowiedz = InputString();
        if (odpowiedz.equals("y")) {
            System.out.println("Opuszczasz program. Do zobaczenia");
            warunek = false;
        } else if (odpowiedz.equals("n")) {
            System.out.println("Program nie zostanie wyłączony");
        } else {
            System.out.println("Niepoprawna wartość. Spróbuj ponownie");
            exitProgram();
        }
    }

    private void cloneObject() {
        int wybor;
        System.out.println("Wybierz gatunek do sklonowania:" +
                "\n1.Człowiek" +
                "\n2.Pies" +
                "\n3.Kot" +
                "\nWybór: ");
        wybor = InputInt();
        switch (wybor) {
            case 1 -> cloning(czlowiek);
            case 2 -> cloning(pies);
            case 3 -> cloning(kot);
            default -> {
                defaultInstruction();
                nextStep();
            }
        }
    }

    private void cloning(Gatunek gatunek) {
        System.out.println("Informacje o sklonowanym gatunku:");
        Gatunek klon = gatunek.klonuj();
        klon.wszystkieDane();
    }

    private void coWyswietlic(Gatunek gatunek) {
        int wybor;
        System.out.println("Co wyświetlić?" +
                "\n1.Pełna nazwa" +
                "\n2.Haploidalna liczbę chromosomów" +
                "\n3.Wszystkie dane" +
                "\nWybierz: ");
        wybor = InputInt();
        switch (wybor) {
            case 1 -> gatunek.pelnaNazwa();
            case 2 -> gatunek.haploidalnaLiczbaChromosomowX();
            case 3 -> gatunek.wszystkieDane();
        }
    }

    private void viewCat() {
        coWyswietlic(kot);
    }

    private void viewDog() {
        coWyswietlic(pies);
    }

    private void viewHuman() {
        coWyswietlic(czlowiek);
    }

    private void Menu() {
        System.out.println("\nMenu programu:" +
                "\n1.Człowiek" +
                "\n2.Pies" +
                "\n3.Kot" +
                "\n4.Klonuj" +
                "\n5.WYJŚCIE" +
                "\n\nWybierz opcje: ");
    }

    public String InputString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
        return input;
    }

    private int InputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
}
