import java.io.*;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pilku źródłowego: ");
        String fileName = scanner.nextLine();
        System.out.println("Podaj dzień urodzenia: ");
        int dzien = scanner.nextInt();
        System.out.println("Podaj miesiąc urodzenia: ");
        int miesiac = scanner.nextInt();
        System.out.println("Podaj rok urodzenia: ");
        int rok = scanner.nextInt();

        String dzienBin = Integer.toBinaryString(dzien);
        String miesiacBin = Integer.toBinaryString(miesiac);
        String rokBin = Integer.toBinaryString(rok);

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(new File(fileName)));
            writer.write(dzienBin);
            writer.newLine();
            writer.write(miesiacBin);
            writer.newLine();
            writer.write(rokBin);
            System.out.println("Dane zostały zapisane w pliku " + fileName);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}//zadanie3.txt
