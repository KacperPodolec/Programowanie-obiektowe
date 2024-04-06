public class Main {
    public static void main(String[] args) {

        Point punkt1 = new Point(1, 2);
        Point punkt2 = new Point(3, 4);
        Point punkt3 = new Point(5, 6);

        punkt1.opis();
        System.out.println(punkt1.getX());
        System.out.println(punkt1.getY());
        punkt1.setX(11);
        punkt1.setY(22);
        punkt1.opis();

        System.out.println();

        punkt2.opis();
        punkt2.zeruj();
        punkt2.opis();

        System.out.println();

        punkt3.opis();
        punkt3.przesun(5, 6);
        punkt3.opis();

        System.out.println();

        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(17, 5);
        Trojkat trojkat = new Trojkat(5, 4);

        System.out.println(figura.opis());
        System.out.println(prostokat.getPowierzchnia());

        System.out.println();

        prostokat.setX(17);
        prostokat.setY(48);
        prostokat.przesun(3, 5);
        prostokat.getWsporzedne();

        System.out.println();

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.setSzer(8);
        kwadrat.setWys(8);

        System.out.println(prostokat.opis());
        System.out.println(kwadrat.opis());
        System.out.println(trojkat.opis());
    }
}