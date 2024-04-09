

class Trojkat extends Figura implements IFigury {
    int wys = 0;
    int podst = 0;

    Trojkat(int wys, int podst, String kolor) {

        this.wys = wys;
        this.podst = podst;
        super.kolor = kolor;
    }

    public String opis() {
        return "Trojkat o wymairach: " + wys + "  " + podst;
    }

    @Override
    void skaluj(float skala) {
        System.out.println("Wymiary przeskalowanego trójk¹ta: " + wys * skala + " " + podst * skala);
    }

    @Override
    public float getPowierzchnia() {
        return 0.5f * wys * podst;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }
}