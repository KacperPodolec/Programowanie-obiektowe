public class Main {
    public static void main(String[] args) {
        int[] tab = new int[3];
        try {
            for (int i = 0; i < 19; i++) {
                tab[i] = (i + 1);
                System.out.println("tab[" + i + "] = " + tab[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Indeks tablicy poza zakresem! Wstrzymano działanie programu");
        } finally {

        }
    }
}