import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Command> q = WypelnianieKolejki.wypelnij();

        TrzeciaKlasa.konsumuj(q);
    }
}