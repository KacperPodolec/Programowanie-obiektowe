public class Cone {
    private double r;
    private double h;
    private String name = "stożek";

    public double polePodstawy(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double objetosc(double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }

    public void view() {
        System.out.println("Figura: " + name + "\nPromień: " + r + "\nWysokość: " + h + "\nObjętość stożka: " + objetosc(r, h));
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }
}
