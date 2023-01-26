package Gun33_Encapsulation.Soru;

public class Ogrenci {

    private int ID;
    private String ad;
    private String soyad;
    private int yas;

    private static int sayacID=0;

    public Ogrenci(String ad, String soyad, int yas) {
        this.ID= ++sayacID; // önce arttır sonra işlem yap
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
