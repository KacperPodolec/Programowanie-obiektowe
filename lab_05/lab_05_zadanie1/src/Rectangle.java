public class Rectangle {
    private double a;
    private double b;
    private String name = "prostokąt";

    public double pole(double a, double b) {
        return a * b;
    }

    public double obwod(double a, double b) {
        return 2 * a + 2 * b;
    }

    public void view() {
        System.out.println("Figura: " + name + "\nBok 1: " + a + "\nBok 2: " + b + "\nPole prostokątu: " + pole(a, b) + "\nObwód prostokątu: " + obwod(a, b));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
