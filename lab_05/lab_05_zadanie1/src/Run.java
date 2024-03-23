import java.awt.*;
import java.util.Scanner;

public class Run {
    boolean warunek = true;

    //metoda runing która będzie odpowiadać za wyświetlenie logiki tj. petla while w której będzie switch
    public void Runing() {
        int wybor;
        while (warunek) {
            Menu();
            wybor = InputInt();
            switch (wybor) {
                case 1 -> viewCircle();
                case 2 -> viewSquare();
                case 3 -> viewRectangle();
                case 4 -> viewCube();
                case 5 -> viewCuboid();
                case 6 -> viewBall();
                case 7 -> viewCone();
                case 8 -> exitProgram();
                default -> defaultInstruction();
            }
            nextFigure();
        }
    }

    private void nextFigure() {
        System.out.println("Czy chcesz obliczyć wartości kolejnej figury?");
        String next = InputString();
        if (next.equals("y")) {
            System.out.println("\nWybierz kolejną figurę");
        } else if (next.equals("n")) {
            System.out.println("n");
            exitProgram();
        } else {
            System.out.println("Niepoprawna wartość. Spróbuj ponownie");
            nextFigure();
        }
    }

    private void exitProgram() {
        System.out.println("Czy chcesz opuścic program?");
        String odpowiedz = InputString();
        if (odpowiedz.equals("y")) {
            System.out.println("Opuszczasz program. Do zobaczenia");
            warunek = false;
        } else if (odpowiedz.equals("n")) {
            System.out.println("Program nie zostanie wyłączony");
        } else {
            System.out.println("Niepoprawna wartość. Spróbuj ponownie");
            exitProgram();
        }
    }

    private void defaultInstruction() {
        System.out.println("Niepoprawna wartość. Spróbuj ponownie");
    }

    private void viewCone() {
        Cone cone = new Cone();
        System.out.println("Podaj promień: ");
        double r = InputDouble();
        System.out.println("Podaj wysokość: ");
        double h = InputDouble();
        if (r > 0 && h > 0) {
            cone.setR(r);
            cone.setH(h);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(r));
            cone.setR(Math.abs(r));
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(h));
            cone.setH(Math.abs(h));
        }
        cone.view();
    }

    private void viewBall() {
        Ball ball = new Ball();
        System.out.println("Podaj promień: ");
        double r = InputDouble();
        if (r > 0) {
            ball.setR(r);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(r));
            ball.setR(Math.abs(r));
        }
        ball.view();
    }

    private void viewCuboid() {
        Cuboid cuboid = new Cuboid();
        System.out.println("Podaj pierwszy bok: ");
        double a = InputDouble();
        System.out.println("Podaj drugi bok: ");
        double b = InputDouble();
        System.out.println("Podaj trzeci bok: ");
        double c = InputDouble();
        if (a > 0 && b > 0 && c > 0) {
            cuboid.setA(a);
            cuboid.setB(b);
            cuboid.setC(c);
        } else if (a < 0 || b < 0 || c < 0) {
            System.out.println("Wykryto jedną lub więcej wartości ujemnych, zostały one zamienione na wartości dodatnie");
            cuboid.setA(Math.abs(a));
            cuboid.setB(Math.abs(b));
            cuboid.setC(Math.abs(c));
        }
        cuboid.view();
    }

    private void viewCube() {
        Cube cube = new Cube();
        System.out.println("Podaj bok: ");
        double a = InputDouble();
        if (a > 0) {
            cube.setA(a);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a));
            cube.setA(Math.abs(a));
        }
        cube.view();
    }

    private void viewRectangle() {
        Rectangle rectangle = new Rectangle();
        System.out.println("Podaj pierwszy bok: ");
        double a = InputDouble();
        System.out.println("Podaj drugi bok: ");
        double b = InputDouble();
        if (a > 0 && b > 0) {
            rectangle.setA(a);
            rectangle.setB(b);
        } else if (a > 0 && b < 0) {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. b = " + Math.abs(b));
            rectangle.setB(Math.abs(b));
            rectangle.setA(a);
        } else if (a < 0 && b > 0) {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a));
            rectangle.setA(Math.abs(a));
            rectangle.setB(b);
        } else if (a < 0 && b < 0) {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a));
            rectangle.setA(Math.abs(a));
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. b = " + Math.abs(b));
            rectangle.setB(Math.abs(b));
        }
        rectangle.view();
    }

    private void viewSquare() {
        Square square = new Square();
        System.out.println("Podaj bok: ");
        double a = InputDouble();
        if (a > 0) {
            square.setA(a);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a));
            square.setA(Math.abs(a));
        }
        square.view();
    }

    private void viewCircle() {
        Circle circle = new Circle();
        System.out.println("Podaj promień: ");
        double r = InputDouble();
        if (r > 0) {
            circle.setR(r);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. r = " + Math.abs(r));
            circle.setR(Math.abs(r));
        }
        circle.view();
    }

    public void Menu() {
        System.out.println("Menu programu:" +
                "\n1.Koło" +
                "\n2.Kwadrat" +
                "\n3.Prostokąt" +
                "\n4.Sześcian" +
                "\n5.Prostopadłościan" +
                "\n6.Kula" +
                "\n7.Stożek" +
                "\n8.Wyjście" +
                "\n\nWybierz opcje: ");
        //kalkulator figur geom; elementy
    }

    public String InputString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
        return input;
    }

    public int InputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public double InputDouble() {
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }
}