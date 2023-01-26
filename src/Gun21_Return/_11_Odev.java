package Gun21_Return;

import java.util.Arrays;
import java.util.Scanner;

public class _11_Odev {
    public static void main(String[] args) {
        /****    01    ****/
       //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.
        System.out.println("1. SORU");

        Scanner okuInt=new Scanner(System.in);
        System.out.println("Kaça kadar random sayı üretsin? : ");
        int maxSayi=okuInt.nextInt();
        int randomSayi=randomNum(maxSayi);
        System.out.println("randomSayi = " + randomSayi);

        /****    02    ****/
        //"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum.
        //print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca
        System.out.println("2. SORU");

        Scanner okustr=new Scanner(System.in);
        System.out.println("3 kelimeli bir cümle giriniz: ");
        String cumle=okustr.nextLine();
        String kelime=OrtaKelime(cumle);
        System.out.println("Ortadaki kelime = " + kelime);

        /****    03    ****/
        //reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ
        System.out.println("3. SORU");


        System.out.println("Bir cümle giriniz: ");
        String cumle1=okustr.nextLine();
        tersCevirme(cumle1);

        /****    04    ****/
        // adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java
        //Örnek 2:
        //Dize: Sakin olun ve evde kalın
        //dönüş olmalı: kalın evde ve olun sakin
        System.out.println("\n4. SORU");


        System.out.println(" Bir cümle giriniz: ");
        String cumle2=okustr.nextLine();
        terstenYazdir(cumle2);

        /****    05    ****/
        //getSum isminde bir method oluşturun.
        //Parametresi Array'tir.
        //Dizideki tüm $ ları kaldır ve tüm sayıları topla
        //return yaptğımız veri tipi 'int' olmalıdır.
        //sonuç 0'dan küçükse, -1 yazdırın.
        //Örnek1:
        //Array = $13, $15, $20
        //Cevap = 48 olmalı
        //Örnek 2 :
        //Array= $-13, $0, $0
        //Cevap = -1 olmalı.

        System.out.println("\n5. SORU");
        String[] dolarFiyat=new String[3];

        for (int i = 0; i < dolarFiyat.length; i++) {
            System.out.println("\nFiyat Giriniz");
            dolarFiyat[i]="$"+okustr.nextLine();
        }
        System.out.println("fiyat dizisi: "+ Arrays.toString(dolarFiyat));

        System.out.println("Toplam= "+ getSum(dolarFiyat));

        /****    06    ****/
        //EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        //toplam sonucu yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        //For example Örnek:
        //String =  "6678421312"
        //6+6-7+8+4+2-1-3-1+2
        //sonuç 16 olmalı
        System.out.println("\n6. SORU");

        System.out.println("İşlem Yapılmasın İstediğiniz 10 tane sayı Giriniz ");
        String sayilarStr= okustr.nextLine();

        System.out.println("Girilen Sayılar = " + sayilarStr);

        System.out.println("İşlenmiş Hali= "+EvenOddNums(sayilarStr));

        /****    07    ****/


        System.out.println("\n7. SORU");
        System.out.println("7. Soru ve sonrası ayrı src ile gönderildi.");


    }
    /*   6. SORU   */
    public static int EvenOddNums (String sayilar) {
        String[] sayilarArray = sayilar.split("");

        int toplam = 0;
        for (int i = 0; i < sayilar.length(); i++) {
            if (Integer.parseInt(sayilarArray[i]) % 2 == 0)
                toplam += Integer.parseInt(sayilarArray[i]);
            else toplam -= Integer.parseInt(sayilarArray[i]);
        }

        return toplam;
    }


    /*   5. SORU   */
    public static int getSum (String[] array) {
        int[] sadeceSayilar = new int[array.length];
        for (int i = 0; i < array.length; i++)
            //if (dolarFiyat[i].contains("$"))
            sadeceSayilar[i] = Integer.parseInt(array[i].replace("$", ""));

        int toplam = 0;
        for (int i = 0; i < sadeceSayilar.length; i++)
            toplam += sadeceSayilar[i];

        if (toplam > 0)
            toplam = toplam;
        else toplam = -1;
        return toplam;
    }
    /* 4.SORU */
    public static void terstenYazdir(String cumle2) {
        String[] diziCumle2 = cumle2.split(" ");
        for (int i = diziCumle2.length - 1; i > -1; i--)
            System.out.print(diziCumle2[i]+" ");

    }


    /* 3. SORU */
public static void tersCevirme(String cumle1)
{
    for (int i = cumle1.length(); i >0 ; i--)
        System.out.print(cumle1.charAt(i-1));
}
    /* 2. SORU */
    public static String OrtaKelime(String cumle) {
        int bosluk1 = cumle.indexOf(" ");
        int bosluk2 = cumle.lastIndexOf(" ");
        String kelime = cumle.substring(bosluk1 + 1, bosluk2);
        return kelime;
    }
    /* 1. SORU */
    public static int randomNum (int max)
    {
        int sayi=(int) (Math.random()*max);

        return sayi;
    }
}
