package Gun36_polymorphism._04_Poly_Soru;

import Gun36_polymorphism._02_Final.atributeFinal.Kisi;

public class OkulMain {
    public static void main(String[] args) {
        //1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
        //2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
        //3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
        //  olacak kimlik belgesi formu oluşturan tek bir metod yazınız.
        //
        //  not: 3.istekdeki gibi her iki sınıfnda çalşacağı bir metodun olabilmesi için,
        //    her iki sınıfın da bir üst sınıftan türetilmesi zorunludur.
        //    aksi halde ayrı ayı 2 metod yazılmak zorunda kalınır.

        //NOT:
        // class dan bir nesne oluşturuyorsun
        //Araba a= new Araba(); // nesne oluşturma
                                // instance oluşturma
        // a kimin instance ı? Araba nın instance ıdır.

        Ogrenci ogr=new Ogrenci("Ayşe","Yılmaz","öğrenci","5A");
        Calisan cal=new Calisan("ismet","temur","öğretmen","yazılım");

        Kisi.KimlikBelgesiYaz(ogr);
        Kisi.KimlikBelgesiYaz(cal);


    }
}
