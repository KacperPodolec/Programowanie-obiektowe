public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", " + wiek;
    }
}
