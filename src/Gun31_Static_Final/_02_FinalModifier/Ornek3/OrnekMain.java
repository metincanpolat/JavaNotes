package Gun31_Static_Final._02_FinalModifier.Ornek3;

import java.util.Scanner;

public class OrnekMain {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.(bu degerler değiştirilemez olmalı)
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.
        int gun=0;
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.println("Gun= ");
        gun= oku.nextInt();
        System.out.printf("Saat= ");
        saat= oku.nextInt();
        System.out.printf("Dakika= ");
        dak= oku.nextInt();

        //1.Yöntem
        int toplamSaniye=
                gun*Sabitler.birGundekiSaatSayisi*
                        Sabitler.birSaattekiDakikaayisi*
                        Sabitler.birDakikadakiSaniyeSayisi
                +
                        saat*Sabitler.birSaattekiDakikaayisi*
                                Sabitler.birDakikadakiSaniyeSayisi
                +
                        dak*Sabitler.birDakikadakiSaniyeSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        /* 2. Yöntem ve olması gereken yönem */

        System.out.println(Sabitler.toSecond(gun,saat,dak));








    }
}
