public abstract class Ryba extends Zwierze {
    void jedz() {
        System.out.println("Ryba je");
    }

    void wydalaj() {
        System.out.println("Ryba wydala się");
    }

    @Override
    public void plyn() {
        System.out.println("Ryba płynie");
    }

    @Override
    public void wynurz() {
        System.out.println("Ryba wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("Ryba zanurza się");
    }
}
