public class DzieleniePrzezZeroException extends Exception {
    static int liczbaWyjatkow = 0;

    public DzieleniePrzezZeroException(String message) {
        super(message);
        liczbaWyjatkow++;
    }
}
