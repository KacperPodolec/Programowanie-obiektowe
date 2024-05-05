public class Command {
    String ciagZnakow;

    Command(String ciagZnakow) {
        this.ciagZnakow = ciagZnakow;
    }

    void operation() {
        System.out.println(ciagZnakow);
    }
}
