package Gun34_inheritance._03_Ornek_Soru;

public class GenelMudur extends Calisan{
    private int tazminat;

    public GenelMudur(String isim, int ucret, double maasKatsayisi,int tazminat) {
        super(isim, ucret, maasKatsayisi);
        setTazminat(tazminat);

    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    public double maasHesapla(int ucret, double maasKatsayisi,int tazminat) {
        return super.maasHesapla(ucret, maasKatsayisi)+tazminat;
    }






    @Override
    public String toString() {
        return "GenelMudur{" +"isim='" + getIsim() + '\'' +
                ", ucret=" + getUcret() +
                ", maasKatsayisi=" + getMaasKatsayisi() +
                ", tazminat=" + tazminat +
                '}';
    }
}
