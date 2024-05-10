public class Komedia extends Film {
    private final String typ = "komedia";

    public Komedia(int czasTrwania, String tytul) {
        super(czasTrwania, tytul);
    }

    public String getTyp() {
        return typ;
    }

    @Override
    void wypiszDane() {
        super.wypiszDane();
        System.out.println("Typ: " + typ);
    }
}
