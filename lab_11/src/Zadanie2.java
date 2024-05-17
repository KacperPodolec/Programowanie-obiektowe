import java.io.*;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę pilku źródłowego: ");
        String filePath = scanner.nextLine();
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            String linia;
            int licznik = 0;
            while ((linia = fileReader.readLine()) != null) {
                System.out.println(linia);
                licznik++;
            }
            System.out.println("\nIlość lini znajdujących się w pliku: " + licznik);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}//C:\Users\Kacper\Desktop\Lab 08\lab_11\zadanie1.txt