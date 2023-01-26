package Gun32_ENUM.Mentoring;
public class Mentor2 {


    enum Islem {
        TOPLA, CIKAR, BOL, CARP;



    }

    public static void main(String[] args) {

        // Verilen rakamlari istenilen matematik islemi ile sonucunu hesaplayan bir method yaziniz
        System.out.println(hesapla(Islem.BOL, 12, 23));


    }

    public static int hesapla(Islem islem, int sayi1, int sayi2 )
    {
        int sonuc=0;
        if (islem==Islem.TOPLA)       sonuc=sayi1+sayi2;
        else if (islem==Islem.CIKAR)  sonuc=sayi1-sayi2;
        else if (islem==Islem.CARP)   sonuc=sayi1*sayi2;
        else if (islem==Islem.BOL)    sonuc=sayi1/sayi2;

        return sonuc;
    }






}






