package Gun36_polymorphism._04_Poly_Soru;

import Gun36_polymorphism._02_Final.atributeFinal.Kisi;

public class Calisan extends Kisi {
    String departman;

    public Calisan(String ad, String soyad, String gorev,String departman)
    {
        super(ad, soyad, gorev);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
