package Gun34_inheritance._03_Ornek_Soru;

public class Calisan {
    private String isim;
    private int ucret;
    private  double maasKatsayisi;

    public Calisan(String isim, int ucret, double maasKatsayisi) {
        setIsim(isim);
        setUcret(ucret);
        setMaasKatsayisi(maasKatsayisi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public double getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(double maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", ucret=" + ucret +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
    public double maasHesapla(int ucret,double maasKatsayisi)
    {
        double maas=ucret*maasKatsayisi;
        return maas;
    }


}
