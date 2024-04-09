public class Okrag extends Figura implements RuchFigury{
    int x, y,promien;

    Okrag(int x, int y, int promien){
        this.x = x;
        this.y = y;
        this.promien = promien;
    }
    @Override
    String opis() {
        return "X: " +x+ "\nY: " +y+ "\nPromie?: " +promien;
    }

    @Override
    void skaluj(float skala) {

    }

    @Override
    public void przesun(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
