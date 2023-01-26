package Gun31_Static_Final._01_StaticModifier.Ornek01;

public class Okul {
    public static void main(String[] args) {


        Ogrenci ogr1 = new Ogrenci("ismet", "temur");
        Ogrenci ogr2 = new Ogrenci("metin", "demir");
        Ogrenci ogr3 = new Ogrenci("ahmet", "yıldız");

        //....
        //....

        Ogrenci ogr499 = new Ogrenci("ahmet", "yıldız");
        Ogrenci ogr500 = new Ogrenci("ahmet", "yıldız");




        System.out.println(ogr1.okulAd);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi


    }

}
