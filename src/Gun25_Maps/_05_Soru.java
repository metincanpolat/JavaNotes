package Gun25_Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {

        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        System.out.println("Sözlüğe Hoş Geldiniz.\n");


        Map<String,String> sozluk=new TreeMap<>();
        int secim;
        do {
            System.out.println("Yapmak istediğinizi seçiniz: \n1- Ekleme \n2- Düzeltme \n3- Listeleme \n4- Arama" +
                    "\n5-Silme \n6- Çıkış" );
            secim=okuInt.nextInt();
            switch (secim)
            {
                case 1:
                    System.out.println("Yeni kelime giriniz: ");
                    String yeniK=okuStr.nextLine();
                    System.out.println("Anlamını giriniz: ");
                    String yeniAnlam=okuStr.nextLine();
                    sozluk.put(yeniK,yeniAnlam);break;
                case 2:
                    System.out.println("Düzeltmek istediğiniz kelimeyi giriniz: ");
                    String duzeltKlm=okuStr.nextLine();
                    System.out.println("Anlamını giriniz: ");
                    String duzeltAnlam=okuStr.nextLine();
                    sozluk.put(duzeltKlm,duzeltAnlam);break;
                case 3:
                    System.out.println("Tüm sözlük = " + sozluk);break;

                case 4:
                    System.out.println("Arama yapmak istediğiniz kelime: ");
                    String arananK=okuStr.nextLine();
                 //   for (String str : sozluk.containsKey("metin"))
                  //      System.out.println("str = " + str);




            }


        }while (secim!=6);












    }
}
