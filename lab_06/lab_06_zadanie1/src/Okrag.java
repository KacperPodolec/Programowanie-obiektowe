public class Okrag extends Figura {
    Point srodek;
    double promien;

    public double getPowierznichnia(double promien) {
        return Math.PI * Math.pow(promien, 2);
    }

    public double getSrednica(double promien) {
        return 2 * promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public Okrag() {
        this.srodek = new Point();
        this.promien = 0;
    }

    public Okrag(Point srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }
}
