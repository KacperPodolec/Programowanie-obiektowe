import java.util.Queue;

public class TrzeciaKlasa {
    public static void konsumuj(Queue<Command> queue) {
        while (!queue.isEmpty()) {
            Command command = queue.poll();
            command.operation();
        }
    }
}

