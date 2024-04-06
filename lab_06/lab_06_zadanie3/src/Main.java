import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Podrecznik podrecznikJava = new Podrecznik(200, "Java. Kompendium programisty", "Herbert Schildt", "Helion", 1080, "oprawa twarda");
        Ksiazka ksiazka1 = (Podrecznik) podrecznikJava;

        Powiesc krzyzacy = new Powiesc(35, "Krzyżacy", "Henryk Sienkiewicz", "powieść historyczna", "Warszawa", 1900);
        Ksiazka ksiazka2 = (Powiesc) krzyzacy;

        Klient klient1 = new Klient("Jan", "Kowalski");

        Ksiegarnia wyporzyczenie1 = new Ksiegarnia(klient1, podrecznikJava);

        ksiazka1.ksiazkaInfo();
        System.out.println();

        ksiazka2.ksiazkaInfo();
        System.out.println();

        klient1.klientInfo();
        System.out.println();

        wyporzyczenie1.wyporzyczenia();
    }
}

