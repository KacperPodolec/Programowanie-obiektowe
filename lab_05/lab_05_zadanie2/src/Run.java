import java.util.Scanner;

public class Run {
    boolean warunek = true;

    public void Runing() {
        int wybor;
        while (warunek) {
            Menu();
            wybor = InputInt();
            switch (wybor) {
                case 1 -> viewInformation();
                case 2 -> buildingAge();
                case 3 -> exitProgram();
                default -> defaultInstruction();
            }
            nextStep();
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

    private void buildingAge() {
        int wybor;
        System.out.println("Budynki:" +
                "\n1.Uniwersytet" +
                "\n2.Galeria" +
                "\n3.Szpital" +
                "\n\nWybierz budynek: ");
        wybor = InputInt();
        switch (wybor) {
            case 1 -> universityAge();
            case 2 -> shoppingMallAge();
            case 3 -> hospitalAge();
            default -> defaultInstruction();
        }
    }

    private void hospitalAge() {
        Building hospital = new Building();
        hospital.rokBudowy = 1980;
        hospital.ileMaLat(hospital.getRokBudowy());
    }

    private void shoppingMallAge() {
        Building shoppingMall = new Building();
        shoppingMall.rokBudowy = 2006;
        shoppingMall.ileMaLat(shoppingMall.getRokBudowy());
    }

    private void universityAge() {
        Building university = new Building();
        university.rokBudowy = 2001;
        university.ileMaLat(university.getRokBudowy());

    }

    private void Menu() {
        System.out.println("Menu programu:" +
                "\n1.Budynki - informacje" +
                "\n2.Oblicz wiek budynku" +
                "\n3.WYJŚCIE" +
                "\n\nWybierz opcje: ");
    }

    private void viewInformation() {
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

    private void viewHospital() {
        Building hospital = new Building();
        hospital.nazwa = "Kliniczny Szpital Wojewódzki Nr 2 im. Św. Jadwigi Królowej w Rzeszowie";
        hospital.rokBudowy = 1980;
        hospital.liczbaPieter = 3;
        hospital.informacje();
    }

    private void viewShoppingMall() {
        Building shoppingMall = new Building();
        shoppingMall.nazwa = "Millenium Hall";
        shoppingMall.rokBudowy = 2006;
        shoppingMall.liczbaPieter = 2;
        shoppingMall.informacje();
    }

    private void viewUniversity() {
        Building university = new Building();
        university.nazwa = "Uniwersytet Rzeszowski";
        university.rokBudowy = 2001;
        university.liczbaPieter = 3;
        university.informacje();
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