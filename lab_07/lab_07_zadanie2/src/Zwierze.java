public abstract class Zwierze implements Plywanie, Latanie {

    @Override
    public void plyn() {
        System.out.println("płynie");
    }

    @Override
    public void wynurz() {
        System.out.println("wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("zanurza się");
    }

    @Override
    public void lec() {
        System.out.println("leci");
    }

    @Override
    public void wyladuj() {
        System.out.println("ląduje");
    }
}
