import java.io.*;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        zapiszDate();
        odczytajDate();
    }

    public static void zapiszDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę urodzenia (dzień miesiąc rok):");
        int dzien = scanner.nextInt();
        int miesiac = scanner.nextInt();
        int rok = scanner.nextInt();

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("urodziny.bin"))) {
            out.writeInt(dzien);
            out.writeInt(miesiac);
            out.writeInt(rok);
            System.out.println("Zapisano");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void odczytajDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku binarnego:");
        String sciezkaPliku = scanner.nextLine();

        try (DataInputStream in = new DataInputStream(new FileInputStream(sciezkaPliku))) {
            int dzien = in.readInt();
            int miesiac = in.readInt();
            int rok = in.readInt();
            System.out.println("\nData urodzenia: " + dzien + "." + miesiac + "." + rok);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//C:\Users\Kacper\Desktop\Lab 08\lab_11\\urodziny.bin
