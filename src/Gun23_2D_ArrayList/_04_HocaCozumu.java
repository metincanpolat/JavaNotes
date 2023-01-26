package Gun23_2D_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_HocaCozumu {
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

        System.out.println("***************");
        Scanner oku=new Scanner(System.in);
        System.out.println("0-Mat, 1-Fiz, 2-Kim");
        System.out.print("Ders No: ");
        int dersNo= oku.nextInt();

        dersNotlariniYazdir(dersNo, notlarListesi);




    }
    public static void dersNotlariniYazdir(int dersNo,ArrayList<ArrayList<Integer>> notlarListesi )
    {
        // ders no belli olduğudan dersleri saydıran for a ihtiyacım yok, bu değer belli dersNo
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++)

            System.out.println(notlarListesi.get(dersNo).get(i));

        }


    }





