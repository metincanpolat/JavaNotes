package Gun33_Encapsulation._01_Ornek;

import jdk.nashorn.internal.objects.annotations.Getter;


public class Kisi {

    private String ad; //25 karakter olsun
    private String soyad;
    private int yas; // korumaya aldım

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
    void yasAta(int yas) // veriyi kontrol ederek
    {
        if (yas>0)
            this.yas=yas;
        else
            System.out.println("hatalı yaş");
    }
    int yasVer()
    {
        return this.yas;
    }
    void setAd(String ad)
    {
        if (ad.length()<25)
            this.ad=ad;
    }
    String getAd()
    {
        return this.ad;
    }
    void setSoyad(String soyad)
    {
        if (soyad.length()<25)
            this.soyad=soyad;
    }
    String getSoyad()
    {
        return this.soyad;
    }



}
