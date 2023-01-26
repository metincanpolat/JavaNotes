package Gun33_Encapsulation.Soru;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
        //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
        //  3- Bütün fieldlar için encapsulation uygulayınız.
        //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
        //     ArrayList cinsinden Öğrencileri olsun.
        //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
        //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
        //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
        //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

        Scanner okuInt=new Scanner(System.in);
        Scanner okulStr=new Scanner(System.in);


        // bir okulumuz olmalı, max kontejyanı olan adı olan
        Okul yeniOkul=new Okul("Kabataş ilkokulu",3);

        do {
            //scanner işlemleri, kullanıcıdan veri alma, öğrenci bilgi alma kısmı
            System.out.println("Öğrenci Adı= "); String ad= okulStr.nextLine();
            System.out.println("Öğrenci Soyadı= "); String soyad=okulStr.nextLine();
            System.out.println("Öğrenci Yaşı= "); int yas= okuInt.nextInt();

            //yas kontrol
            if (yas<15){ //ise öğrenci ekle
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
            } // YAZZZZZZZZZZZZZZZZZZZZZZZ

        }while (1<2);











    }
}
