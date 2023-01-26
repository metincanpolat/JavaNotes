package Gun34_inheritance._03_Ornek_Soru;

public class SirketMain {
    public static void main(String[] args) {
        //Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
        //consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
        //GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
        //GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
        //SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
        //maaşları hesaplatıp, bordroyu yazdırınız.

        Calisan eleman1=new Calisan("metin",1000,0.7);

        GenelMudur genelMudur=new GenelMudur("Ahmet",1200,0.7,200);

        System.out.println("Çalışan Maaşı= "+eleman1.maasHesapla(eleman1.getUcret(), eleman1.getMaasKatsayisi())+" TL");

        System.out.println("Genel Müdür Maaşı= "+genelMudur.maasHesapla(genelMudur.getUcret(),
                genelMudur.getMaasKatsayisi(), genelMudur.getTazminat())+" TL");

        System.out.println("eleman1 = " + eleman1);
        System.out.println("genelMudur = " + genelMudur);

    }
}
