public class Pary {
    String imie1;
    String imie2;

    public Pary(String imie1, String imie2) {
        this.imie1 = imie1;
        this.imie2 = imie2;
    }

    public boolean zawieraImie(String imie) {
        return imie1.equals(imie) || imie2.equals(imie);
    }

    public String zwrocPartnera(String imie) {
        if (imie1.equals(imie)) {
            return imie2;
        } else if (imie2.equals(imie)) {
            return imie1;
        } else {
            return null;
        }
    }
}
