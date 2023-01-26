package Gun26_Classes._02_Ornek;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        OkulKayit ogrenci=new OkulKayit(); // artık ogrenci bir varlık, OkulKayit ise onun tipi
                                           // insan bir tip, ismet ise onun tipinde bir varlık.

        Scanner okuStr=new Scanner(System.in);

        System.out.print("Adı: ");
        ogrenci.adi= okuStr.nextLine();
        System.out.print("Soyadı: ");
        ogrenci.soyadi=okuStr.nextLine();
        System.out.print("Sınıfı: ");
        ogrenci.sinifi=okuStr.nextLine();
        System.out.print("Adresi: ");
        ogrenci.adres=okuStr.nextLine();

        System.out.println("ogrenci adı = " + ogrenci.adi);
        System.out.println("ogrenci soyadı= " + ogrenci.soyadi);
        System.out.println("ogrenci sınıfı= " + ogrenci.sinifi);
        System.out.println("ogrenci adresi= " + ogrenci.adres);


    }
}
class OkulKayit
{
    String adi;
    String soyadi;
    String sinifi;
    String adres;




}
