import java.util.Scanner;

public class Run {
    Building uniwersytet = new Building("Uniwersytet Rzeszowski", 2001, 3);
    Building szpital = new Building("Kliniczny Szpital Wojewódzki Nr 2 im. Św. Jadwigi Królowej w Rzeszowie", 1980, 3);
    Building galeriaHandlowa = new Building("Millenium Hall", 2006, 2);
    boolean warunek = true;

    public void Runing() {
        int wybor;
        while (warunek) {
            Menu();
            wybor = InputInt();
            switch (wybor) {
                case 1 -> viewBuildings();
                case 2 -> exitProgram();
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

    private void defaultInstruction() {
        System.out.println("Niepoprawna wartość. Spróbuj ponownie");
    }

    private void viewHospital() {
        szpital.informacje();
    }

    private void viewShoppingMall() {
        galeriaHandlowa.informacje();
    }

    private void viewUniversity() {
        uniwersytet.informacje();
    }

    private void viewBuildings() {
        int wybor;
        System.out.println("Budynki:" +
                "\n1.Uniwersytet" +
                "\n2.Galeria handlowa" +
                "\n3.Szpital" +
                "\n\nWybierz budynek: ");
        wybor = InputInt();
        switch (wybor) {
            case 1 -> viewUniversity();
            case 2 -> viewShoppingMall();
            case 3 -> viewHospital();
            default -> defaultInstruction();
        }
    }

    private void Menu() {
        System.out.println("Menu programu:" +
                "\n1.Informacje o budynkach" +
                "\n2.WYJŚCIE" +
                "\n\nWybierz opcje: ");
    }

    public String InputString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
        return input;
    }

    public int InputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
}