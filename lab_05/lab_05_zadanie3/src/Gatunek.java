public class Gatunek {
    private String nazwa_rodzaju;
    private String nazwa_gatunkowa;
    private int liczbaChromosomow2n;
    private int podstawowaLiczbaChromosomowX;
    private String opis;

    public Gatunek(String nazwa_rodzaju, String nazwa_gatunkowa, int liczbaChromosomow2n, int podstawowaLiczbaChromosomowX, String opis) {
        this.nazwa_rodzaju = nazwa_rodzaju;
        this.nazwa_gatunkowa = nazwa_gatunkowa;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomowX = podstawowaLiczbaChromosomowX;
        this.opis = opis;
    }

    public void pelnaNazwa() {
        System.out.println("Rodzaj: " + nazwa_rodzaju + "\nGatunek: " + nazwa_gatunkowa);
    }

    public void haploidalnaLiczbaChromosomowX() {
        System.out.println("Haploidalna liczba chromosomów (n): " + liczbaChromosomow2n);
    }

    public void wszystkieDane() {
        System.out.println("Nazwa rodzaju: " + nazwa_rodzaju +
                "\nNazwa gatunkowa: " + nazwa_gatunkowa +
                "\nLiczba chromosomów 2n: " + liczbaChromosomow2n +
                "\nPodstawowa liczba chromosomów X: " + podstawowaLiczbaChromosomowX +
                "\nOpis: " + opis);
    }

    public Gatunek klonuj() {
        return new Gatunek(nazwa_rodzaju, nazwa_gatunkowa, liczbaChromosomow2n, podstawowaLiczbaChromosomowX, opis);
    }
}
