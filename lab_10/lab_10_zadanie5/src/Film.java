public class Film {
    private int czasTrwania;
    private String tytul;
    private boolean czyObejrzany;

    Film(int czasTrwania, String tytul) {
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        this.czyObejrzany = false;
    }

    public void oznaczJakoObejrzany() {
        this.czyObejrzany = true;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isCzyObejrzany() {
        return czyObejrzany;
    }

    void wypiszDane() {
        System.out.println("Tytuł: " + tytul +
                "\nCzas trwania: " + czasTrwania + " minut" +
                "\nCzy obejrzany: " + czyObejrzany);
    }
}
