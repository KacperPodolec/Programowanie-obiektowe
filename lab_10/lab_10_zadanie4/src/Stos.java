import java.util.LinkedList;

public class Stos<T> {
    private LinkedList<T> stos = new LinkedList<>();

    public void push(T v) {
        stos.addFirst(v);
    }

    public T peek() {
        return stos.getFirst();
    }

    public T pop() {
        return stos.removeFirst();
    }

    boolean empty() {
        return stos.isEmpty();
    }

    @Override
    public String toString() {
        return stos.toString();
    }
}
