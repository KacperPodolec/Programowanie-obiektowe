public class Cube {
    private double a;
    private String name = "sześcian";

    public double objetnosc(double a) {
        return Math.pow(a, 3);
    }

    public void view() {
        System.out.println("Figura: " + name + "\nBok: " + a + "\nObjętość sześcianu: " + objetnosc(a));
    }

    public void setA(double a) {
        this.a = a;
    }
}
