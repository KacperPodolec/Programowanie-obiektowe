import java.time.LocalDate;
import java.time.Period;

public class Building {
    public String nazwa;
    public int rokBudowy;
    public int liczbaPieter;

    public void informacje() {
        System.out.println("Nazwa: " + nazwa + "\nRok budowy: " + rokBudowy + "\nLiczba pięter: " + liczbaPieter);
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public void ileMaLat(int rokBudowy) {
        LocalDate aktualnaData = LocalDate.of(2024, 01, 1);
        LocalDate rokBudowyData = LocalDate.of(rokBudowy, 1, 1);

        Period period = Period.between(aktualnaData, rokBudowyData);
        System.out.println("Budynek ma " + Math.abs(period.getYears()) + " lata");
    }
}