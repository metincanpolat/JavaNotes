package Gun23_2D_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        // 3 öğrencinin ders notlarını bir değişkende nasıl birleştiririz.

        ArrayList<Integer> matNotlari = new ArrayList<>(); // tek bir desin notu // 1 yaprak
        ArrayList<Integer> fizNotlari = new ArrayList<>(); // fizik dersinin notları // 1 yaprak
        ArrayList<Integer> kimNotlari = new ArrayList<>(); // kimya dersinin notları // 1 yaprak
        ArrayList<Integer> cogNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);
        matNotlari.add(75);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        cogNotlari.add(56);

        // ArrayList in ArrayList i nasıl yaparım.

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
        notlarListesi.add(cogNotlari);


        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersIsimleri = new ArrayList<>();
        dersIsimleri.add("Matematk");
        dersIsimleri.add("Fizik");
        dersIsimleri.add("Kimya");
        dersIsimleri.add("Cografya");


        for (int i = 0; i < notlarListesi.size(); i++) { //satırları takip ediyor satır
            System.out.print(dersIsimleri.get(i) + " : ");
            for (int j = 0; j < notlarListesi.get(i).size(); j++) // her satırdaki sutunları
                System.out.print(notlarListesi.get(i).get(j) + "\t"); // tablo[i][j]
            System.out.println();
        }
        //Soru 1 :Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda yazdırınız
        //Soru 2 :Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.
        //Soru 3 :Tüm Derslerin Not yani tum notların ortalamasını(double) bir fonksiyonda buldurup mainde yazdırınız.
        //Soru 4 :En büyük ve en küçük notu bir maın ıcınde bulunuz (fonksiyon zorunlu değil)
        System.out.println("notlarListesi = " + notlarListesi);

        /****    1    ****/

        dersNotuSecim(notlarListesi);



        /****    2    ****/









    }
public static void dersNotuSecim (ArrayList<ArrayList<Integer>> dizi) {
    int siraNo;
    do {
        Scanner okuInt = new Scanner(System.in);
        System.out.println("Listelemek istediğiniz dersin sıra numarasını giriniz:\n 1 Matematik \n 2 Fizik \n 3 Kimya" +
                "\n 4 Coğrafya \n 5 Çıkış ");
        siraNo = okuInt.nextInt();

        switch (siraNo) {
            case 1:
                System.out.println("Matematik Notları = " + dizi.get(0) + "\n");
                break;
            case 2:
                System.out.println("Fizik Notları = " + dizi.get(1) + "\n");
                break;
            case 3:
                System.out.println("Kimya Notları = " + dizi.get(2) + "\n");
                break;
            case 4:
                System.out.println("Coğrafya Notları = " + dizi.get(3) + "\n");
                break;
            case 5:
                System.out.println("Çıkış yaptınız" + "\n");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız" + "\n");
                break;
        }
    } while (siraNo < 5);
 }


}

