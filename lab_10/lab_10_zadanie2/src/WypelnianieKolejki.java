import java.util.LinkedList;
import java.util.Queue;

public class WypelnianieKolejki {
    public static Queue<Command> wypelnij() {
        Queue<Command> queue = new LinkedList<>();

        queue.offer((new Command("qwerty")));
        queue.offer((new Command("abcdef")));
        queue.offer((new Command("asdfgh")));

        return queue;
    }
}
