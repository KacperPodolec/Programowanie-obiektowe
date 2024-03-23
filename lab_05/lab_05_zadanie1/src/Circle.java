//klasa koła
// r - promień
//settery i gettery
//metoda pole oraz obwód

public class Circle {
    private double r;
    private String name = "koło";

    public double pole(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double obwod(double r) {
        return 2 * Math.PI * r;
    }

    public void view() {
        System.out.println("Figura: " + name + "\nPromień: " + r + "\nPole koła: " + pole(r) + "\nObwód koła: " + obwod(r));
    }

    public void setR(double r) {
        this.r = r;
    }
}
