import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    float waga;
    float pojemnoscSilnika;
    int iloscOsob;

    SamochodOsobowy() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę samochodu (przedział: 2t - 4,5t) ");
        waga = scanner.nextFloat();
        while (waga < 2 || waga > 4.5) {
            System.out.println("Waga powinna być z przedziału 2-4.5 t. Podaj poprawną wartość: ");
            waga = scanner.nextFloat();
        }

        System.out.println("Podaj pojemność silnika (przedział: 0,8l - 3,0l): ");
        pojemnoscSilnika = scanner.nextFloat();
        while (pojemnoscSilnika < 0.8 || pojemnoscSilnika > 3.0) {
            System.out.println("Pojemność silnika powinna być z przedziału 0.8-3.0. Podaj poprawną wartość: ");
            pojemnoscSilnika = scanner.nextFloat();
        }

        System.out.println("Podaj ilość osób: ");
        iloscOsob = scanner.nextInt();
    }

    void carInfo() {
        super.carInfo();
        System.out.println("Waga: " + waga + " kg" +
                "\nPojemność silnika: " + pojemnoscSilnika +
                "\nIlość osób: " + iloscOsob);
    }
}
