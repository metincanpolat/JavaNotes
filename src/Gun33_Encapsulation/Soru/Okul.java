package Gun33_Encapsulation.Soru;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    private int kontejyan;

    ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int kontejyan) {
        setOkulAd(okulAd);
        setKontejyan(kontejyan);
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public void setKontejyan(int kontejyan) {
        this.kontejyan = kontejyan;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public int getKontejyan() {
        return kontejyan;
    }
}
