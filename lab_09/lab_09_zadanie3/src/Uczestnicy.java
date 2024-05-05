public class Uczestnicy {
    private int id;
    private String imie;
    private int wiek;

    Uczestnicy(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "ID: [" + id + "], imię: " + imie + ", wiek:" + wiek;
    }

    public int getWiek() {
        return wiek;
    }
}