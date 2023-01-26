package Gun28._03_GununSorusu;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    String name;
    int maxLimit;

    ArrayList<Lesson> dersleri=new ArrayList<>();



    void dersEkle(Lesson yeniDers)
    {
        // şu ana kadar kaç saat dersi var
        // geleni ekleyip max saati geçip geçmediği
        //kontrol etmem gerekiyor
        int aldigiToplamSaat=0;
        for (Lesson d:dersleri)
            aldigiToplamSaat=aldigiToplamSaat+d.saat;

        if (aldigiToplamSaat+ yeniDers.saat>maxLimit)
            System.out.println("Max Ders saati aşıldı. Ders eklenemedi.");
        else
            dersleri.add(yeniDers);
    }
    void dersleriYazdir()
    {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d:dersleri)
            System.out.println(d.name+" "+d.saat);
    }

    static void universiteKuralları()
    {
        System.out.println("Kural1 : Kahvaltı yapmadan derse gelme");
        System.out.println("Kural2 : Uykunu mutlaka al, erken yat");
        System.out.println("Kural3 : Her zaman dinç dinamik ol");
        System.out.println("Kural4 : Başta verdiğin kararı unutma!");
        System.out.println("Kural5 : Biz imkansızlıkları, inş aşacağız");
    }








}
