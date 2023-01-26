package Gun36_polymorphism._02_Final.atributeFinal;

import Gun36_polymorphism._04_Poly_Soru.Calisan;
import Gun36_polymorphism._04_Poly_Soru.Ogrenci;

public class Kisi {
    String ad;
    String soyad;
    String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorev='" + gorev + '\'' +
                '}';
    }

    public static void KimlikBelgesiYaz(Kisi kisi)
    {
        System.out.println("\n***** Kimlik Belgesi *****");
        System.out.println("Adı = "+kisi.ad);
        System.out.println("Soyadı = "+kisi.soyad);
        System.out.println("Görevi = "+kisi.gorev);
        // şubesi de istiyorum öğrenciyse
        // departman da istiyorum çalışsansa

        if (kisi instanceof Ogrenci) // Kisi öğrenciyse
        {
            System.out.println("Şubesi = "+((Ogrenci) kisi).getSubesi());

        }
        if (kisi instanceof Calisan) // Kisi öğrenciyse
        {
            System.out.println("Şubesi = "+((Calisan) kisi).getDepartman());

        }
    }
}
