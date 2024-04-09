//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        samochod.jedzie();

        Samolot samolot = new Samolot();
        samolot.lec();

        Statek statek = new Statek();
        statek.plyn();
    }
}