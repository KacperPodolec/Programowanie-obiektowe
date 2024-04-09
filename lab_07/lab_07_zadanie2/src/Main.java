//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Wieloryb wieloryb = new Wieloryb();

        wieloryb.plyn();
        wieloryb.wynurz();
        wieloryb.zanurz();
        wieloryb.jedz();
        wieloryb.wydalaj();

        System.out.println();

        Orzel orzel = new Orzel();
        orzel.lec();
        orzel.wyladuj();
    }
}