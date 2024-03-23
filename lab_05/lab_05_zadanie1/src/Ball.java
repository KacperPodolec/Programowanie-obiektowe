public class Ball {
    private double r;
    private String name = "kula";

    public double objetosc(double r) {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;
    }

    public void view() {
        System.out.println("Figura: " + name + "\nPromień: " + r + "\nObjętość kuli: " + objetosc(r));
    }

    public void setR(double r) {
        this.r = r;
    }
}
