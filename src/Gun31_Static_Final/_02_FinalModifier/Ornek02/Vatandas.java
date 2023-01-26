package Gun31_Static_Final._02_FinalModifier.Ornek02;

public class Vatandas {
    String isim;
    private final int tcNo;
    private static int sayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo=sayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
