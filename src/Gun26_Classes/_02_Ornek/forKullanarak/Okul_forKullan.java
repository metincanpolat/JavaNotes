package Gun26_Classes._02_Ornek.forKullanarak;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul_forKullan {
    public static void main(String[] args) {

        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.

        Scanner okuStr=new Scanner(System.in);
        //OkulKayit[] dizi=new OkulKayit[100]; // Bu şekilde 100 elemanlı bir değişken tanımladık Göstermek için yazılı

        ArrayList<OkulKayit> liste=new ArrayList<>(); //OkulKayıt tipinde bir list

        for (int i = 0; i < 3; i++) { // denemek için 3 tane kayıt yaptırdık
            OkulKayit ogrenci = new OkulKayit();
            System.out.print("Adı: ");
            ogrenci.adi = okuStr.nextLine();
            System.out.print("Soyadı: ");
            ogrenci.soyadi = okuStr.nextLine();
            System.out.print("Sınıfı: ");
            ogrenci.sinifi = okuStr.nextLine();
            System.out.print("Adresi: ");
            ogrenci.adres = okuStr.nextLine();

            liste.add(ogrenci); // her bir kutuda bir öğrenci var.
        }



        for (OkulKayit ogrenci : liste) {
            System.out.println("ogrenci adı = " +ogrenci.adi );
            System.out.println("ogrenci soyadı= " + ogrenci.soyadi);
            System.out.println("ogrenci sınıfı= " + ogrenci.sinifi);
            System.out.println("ogrenci adresi= " + ogrenci.adres);
        }

    }
}


