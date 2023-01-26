package Gun37._06_Soru.DiziGiris;

import Utility.MyFunc;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        System.out.println(d.alani(4,5));
        System.out.println(d.cevresi(4,5));

        Kare k=new Kare();
        System.out.println(k.alani(4));
        System.out.println(k.cevresi(4));

        Daire daire=new Daire();
        System.out.println("daire alanı(3) = " + daire.alani(3));
        System.out.println("daire cevresi(3) = " + daire.cevresi(3));

        double yeniSayi = MyFunc.rollUp(daire.cevresi(3));
        System.out.println("daire cevresi(3) = " + yeniSayi);


        System.out.printf("%.2f", daire.cevresi(3));
        // printf : formatlı (toplam kaç hane ye yaz, noktadan sonra kaç hane kullan) yazdırma
        //  % : virgülden sonraki değişkeni gözteriyor
        // .  : ondalıklı bölümü gösteriyor
        // 6  : toplamda ekrandan kaç digit kullanılacak,soldan boşluk bırakarak devam ediyor.
        //      Başına - koyarsak sağa boşluk bırakıyor.
        // 2  : ondalıklı kısmından kaç hane alınacağını gösteriyor
        // f  : double veya float için kullanılıyor, tam sayılar için d kullanılır
        //      stringler için s kullanılır.

    }
}
