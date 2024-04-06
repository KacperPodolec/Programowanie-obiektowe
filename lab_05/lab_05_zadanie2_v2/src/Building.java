import java.time.LocalDate;
import java.time.Period;

public class Building {
    private String nazwa;
    private int rokBudowy;
    private int liczbaPieter;

    public Building(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public void informacje() {
        System.out.println("Nazwa: " + nazwa +
                "\nRok budowy: " + rokBudowy +
                "\nLiczba pięter: " + liczbaPieter +
                "\nWiek budynku: " + obliczWiek() + " lat\n");
    }

    private int obliczWiek() {
        LocalDate aktualnaData = LocalDate.now();
        LocalDate dataBudowy = LocalDate.of(rokBudowy, 1, 1);
        Period period = Period.between(dataBudowy, aktualnaData);
        return period.getYears();
    }
}