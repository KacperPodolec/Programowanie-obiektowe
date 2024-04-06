public class Ksiazka extends Ksiegarnia {
    double cena;
    String tytul;
    String autor;

    void ksiazkaInfo() {
        System.out.println("Cena: " + cena + " zł\nTytuł: " + tytul + "\nAutor: " + autor);
    }
}
