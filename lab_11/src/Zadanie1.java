import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter output = null;
        String line;
        System.out.println("Podaj ścieżkę pilku źródłowego: ");
        try {
            output = new FileWriter(scanner.nextLine());
            System.out.println("Podaj zawartość pliku: ");
            while (true) {
                line = scanner.nextLine();
                if (line.equals("-")) break;
                output.write(line);
                output.write(System.lineSeparator());
            }
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}//C:\Users\Kacper\Desktop\Lab 08\lab_11\zadanie1.txt