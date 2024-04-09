public class Wieloryb extends Ryba {
    @Override
    public void plyn() {
        System.out.println("Wieloryb płynie");
    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieoryb zanurza się");
    }

    @Override
    void jedz() {
        System.out.println("Wieloryb je");
    }

    @Override
    void wydalaj() {
        System.out.println("Wieloryb wydala się");
    }
}
