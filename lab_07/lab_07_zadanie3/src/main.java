import java.util.ArrayList;
import java.util.List;

class main {
    public static void main(String[] arg) {
        Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
        Trojkat rownoboczny = new Trojkat(7, 4, "bia³y");
        //maly_punkt.zwieksz(3,4);

        //Figura figura = new Figura();
        Kwadrat kwadrat = new Kwadrat(10, "czerwony");
        Prostokat prostokat = new Prostokat(8, 4, "pomara?czowy");
        Punkt punkt = new Punkt(2, 4);
        Trojkat trojkat = new Trojkat(10, 34, "?ó?ty");

        //System.out.println(figura.getKolor());
        System.out.println(prostokat.opis());
        System.out.println(trojkat.opis());

        System.out.println();

        Figura[] tablicaFigur = new Figura[10];

        for (int i = 0; i < tablicaFigur.length; i++) {
            tablicaFigur[i] = new Prostokat(10, 20, "zielony");
            System.out.println(tablicaFigur[i]);
        }

        //metoda opis wywo?ana z klasy Prostokat
        for (int i = 0; i < tablicaFigur.length; i++) {
            System.out.println(tablicaFigur[i].opis());
        }

        System.out.println();

        System.out.println(prostokat.opis());
        prostokat.skaluj(4);
        System.out.println(trojkat.opis());
        trojkat.skaluj(4);

        System.out.println();

        List<IFigury> figury = new ArrayList<>();
        figury.add(new Kwadrat(22, "niebieski"));
        figury.add(new Prostokat(12, 8, "fioletowy"));
        figury.add(new Trojkat(4, 20, "ró?owy"));

        for (IFigury item : figury) {
            System.out.println("Powierzchnia: " + item.getPowierzchnia());
        }

        System.out.println();

        Okrag okrag = new Okrag(2, 2, 4);
        System.out.println(okrag.opis());
        okrag.przesun(10, 25);
        System.out.println(okrag.opis());
    }
}