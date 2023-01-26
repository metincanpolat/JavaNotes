package Gun36_polymorphism._04_Poly_Soru;

import Gun36_polymorphism._02_Final.atributeFinal.Kisi;

public class Ogrenci extends Kisi {

    String subesi;


    public Ogrenci(String ad, String soyad, String gorev,String subesi) {
        super(ad, soyad, gorev);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}
