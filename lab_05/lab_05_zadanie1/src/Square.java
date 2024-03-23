public class Square {
    private double a;
    private String name = "kwadrat";

    public double pole(double a) {
        return Math.pow(a, 2);
    }

    public double obwod(double a) {
        return 4 * a;
    }

    public void view() {
        System.out.println("Figura: " + name + "\nBok: " + a + "\nPole kwadratu: " + pole(a) + "\nObwód kwadratu: " + obwod(a));
    }

    public void setA(double a) {
        this.a = a;
    }
}


