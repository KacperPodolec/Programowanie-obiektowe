
class Trojkat extends Figura {
    double wys = 0, podst = 0;

    Trojkat(double wys, double podst) {
        this.wys = wys;
        this.podst = podst;
    }

    Trojkat(float wys, float podst, String kolor) {
        this.wys = wys;
        this.podst = podst;
        this.kolor = kolor;
    }

    String opis() {
        return "Klasa Figura. To jest Trójkąt";
    }
}