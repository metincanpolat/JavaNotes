package Gun30_Access_Modifiers._04_Soru;

import java.util.Scanner;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int)(direk erişim olmamalı))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.


        Musteri kisi1=new Musteri();
        kisi1.adi="Metin";
        kisi1.soyad="Canpolat";
       // kisi1.MusteriHesap.yatan=200;


        hosgeldiniz(kisi1);


    } public static void hosgeldiniz(Musteri kisi)
    {
        Scanner oku=new Scanner(System.in);
        int secim;
        System.out.println("*********************************");
        System.out.println("Sayın "+kisi.adi+" "+kisi.soyad+"\nBIZIM Banka Hoşgeldiniz.");
        do {
            System.out.println("********************************");
            System.out.print("\n1-Şifre değiştirme \n2-Para Çekme \n3-Para Yatırma \n4-Bakiye Görüntüleme\n5-Çıkış"
                    +"\n Yapmak istediğiniz işlemi seçiniz:" );

             secim= oku.nextInt();

            switch (secim) {
                case 1:kisi.MusteriHesap.sifreDegistirme();break;
                case 2:kisi.MusteriHesap.paraCekme(); break;
                case 3:kisi.MusteriHesap.paraYatirma();break;
                case 4:kisi.MusteriHesap.bakiyeSorgulama();break;

            }
        }while (secim!=5);



    }

}
