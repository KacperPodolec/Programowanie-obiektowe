
class Prostokat extends Figura {
    double wys = 0, szer = 0;
    float x, y = 0;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    Prostokat() {
        this.wys = wys;
        this.szer = szer;
    }

    Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;

    }

    Prostokat(float wys, float szer, String kolor) {
        this.wys = wys;
        this.szer = szer;
        this.kolor = getKolor();
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    void przesun(int x, int y) {
        this.x += x;
        this.y += y;
    }

    void getWsporzedne() {
        System.out.println(x + ", " + y);
    }

    String opis() {
        return "Klasa Figura. To jest Prostokąt";
    }
}