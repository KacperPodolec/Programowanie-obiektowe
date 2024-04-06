public class Podrecznik extends Ksiazka {
    String wydawnictwo;
    int liczbaStron;
    String druk;

    Podrecznik(double cena, String tytul, String autor, String wydawnictwo, int liczbaStron, String druk) {
        this.cena = cena;
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.liczbaStron = liczbaStron;
        this.druk = druk;
    }

    void ksiazkaInfo() {
        super.ksiazkaInfo();
        System.out.println("Wydawnictwo: " + wydawnictwo +
                "\nLiczba stron: " + liczbaStron +
                "\nDruk: " + druk);
    }
}
