public class Powiesc extends Ksiazka {
    String typUtworu;
    String miejsceWydania;
    int dataWydania;

    Powiesc(double cena, String tytul, String autor, String typUtworu, String miejsceWydania, int dataWydania) {
        this.cena = cena;
        this.tytul = tytul;
        this.autor = autor;
        this.typUtworu = typUtworu;
        this.miejsceWydania = miejsceWydania;
        this.dataWydania = dataWydania;
    }

    void ksiazkaInfo() {
        super.ksiazkaInfo();
        System.out.println("Typ utworu: " + typUtworu +
                "\nMiejsce wydania: " + miejsceWydania +
                "\nData wydania: " + dataWydania);
    }
}
