import java.util.Random;

public class Main {

    public static void main(String[] args) {
        while (DzieleniePrzezZeroException.liczbaWyjatkow < 3) {
            Random random = new Random();
            int min = -10;
            int max = 10;
            int a = random.nextInt(max - min + 1) - 10;
            int b = random.nextInt(max - min + 1) - 10;
            try {
                if (b == 0) {
                    System.out.println("A: " + a + "\nB: " + b);
                    throw new DzieleniePrzezZeroException("Wynik: Dzielenie przez zero!");
                }
                System.out.println("A: " + a + "\nB: " + b + "\nWynik: " + (a / b));

            } catch (DzieleniePrzezZeroException e) {
                System.out.println(e.getMessage());
            } finally {

            }
        }
    }
}