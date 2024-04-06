public class Ksiegarnia {
    Klient klient;
    Ksiazka ksiazka;

    Ksiegarnia() {

    }

    Ksiegarnia(Klient klient, Ksiazka ksiazka) {
        this.klient = klient;
        this.ksiazka = ksiazka;
    }

    void wyporzyczenia() {
        System.out.println("Klient: " + klient.imie + " " + klient.nazwisko +
                "\nKsiążka: " + ksiazka.tytul);
    }
}
