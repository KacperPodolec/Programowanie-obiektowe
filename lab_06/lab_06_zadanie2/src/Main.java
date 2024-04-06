public class Main {
    public static void main(String[] args) {
        SamochodOsobowy samochodOsobowy1 = new SamochodOsobowy();
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod("Toyota", "Camry", "Sedan", "Srebrny", 2020, 123000);

        System.out.println("\nPierwszy samochód: ");
        samochodOsobowy1.carInfo();
        System.out.println("\nDrugi samochód: ");
        samochod1.carInfo();
        System.out.println("\nTrzeci samochód: ");
        samochod2.carInfo();
    }
}