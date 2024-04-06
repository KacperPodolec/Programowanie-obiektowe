public class Klient {
    String imie;
    String nazwisko;

    Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    void klientInfo() {
        System.out.println("Imie: " + imie + "\nNazwisko: " + nazwisko);
    }
}
