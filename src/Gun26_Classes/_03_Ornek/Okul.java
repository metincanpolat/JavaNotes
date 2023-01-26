package Gun26_Classes._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri yazdırınız. Sonra metodda yazdırınız.

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        ArrayList<Ogrenci> snf = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.println("okul no= ");
            ogr.okulNo = okuInt.nextInt();
            System.out.println("tam ad= ");
            ogr.tamAd = okuStr.nextLine();
            System.out.println("not= ");
            ogr.not = okuInt.nextInt();

            snf.add(ogr);
        }

//        //1.Yöntem
//        for (Ogrenci ogr : snf){
//            System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ ogr.not);
//        }

        bilgiYazdir(snf);

        //Sınıf ortalamasını bir metodda bulduktan sonra geçen öğrencilerin aynı metodda
        // isimlerini yazdırınız.
        ortalamaHesap(snf);



    }

    public static void bilgiYazdir(ArrayList<Ogrenci> snf) {
        for (Ogrenci ogr : snf)
            System.out.println(ogr.okulNo + " " + ogr.tamAd + " " + ogr.not);
    }
    public static void ortalamaHesap (ArrayList<Ogrenci> snf) {
        int toplam = 0;
        int sayac = 0;
        for (Ogrenci ogr : snf) {
            toplam = ogr.not + toplam;
            sayac++;

        }
        int ort = toplam / sayac;

        for (Ogrenci ogr : snf) {
            if (ogr.not > ort)
                System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ogr.not+"Geçti");
            else
                System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ogr.not+"Kaldı");
        }

    }

}