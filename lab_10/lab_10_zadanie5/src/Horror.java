public class Horror extends Film {
    private final String typ = "horror";

    public Horror(int czasTrwania, String tytul) {
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
