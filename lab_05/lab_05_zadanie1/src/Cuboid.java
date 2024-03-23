public class Cuboid {
    private double a;
    private double b;
    private double c;
    private String name = "prostopadłościan";

    public double objetnosc(double a, double b, double c) {
        return a * b * c;
    }

    public void view() {
        System.out.println("Figura: " + name + "\nBok 1: " + a + "\nBok 2: " + b + "\nBok c: " + c + "\nObjętość prostopadłościanu: " + objetnosc(a, b, c));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
