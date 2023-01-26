package Gun21_Return;

import java.util.Scanner;

public class _03_HocaCozumuDevam {
    public static void main(String[] args) {
// 5 faktöryel eklenecek case ler fonksiyonlara bölünecek.BİTMEDİ
        Scanner oku=new Scanner(System.in);

        int secim;
        do {
            menuYaz();
            secim= oku.nextInt();
            if (secim<6) islemYap(secim);
        }while (secim <6); // dönme sartı seçim < 6
        System.out.println("çıkış yapıldı");

    }
    public static void menuYaz()
    {
        System.out.println("\n1-toplama\n" +
                "2-çıkarma\n" +
                "3-çarpma\n" +
                "4-bolme\n" +
                "5-Faktöryel\n" +
                "6-Çıkış\n" +
                "Seçiminiz: ");
    }
    public static void islemYap(int secim)
    {
        Scanner oku=new Scanner(System.in);
        do {
            if (secim == 5) {
                System.out.println("sayıyı giriniz= ");
                int sayiF = oku.nextInt();
                int faktoriyel = 1;
                for (int i = 1; i <= sayiF; i++) {
                    faktoriyel = faktoriyel * i;
                }
                System.out.println(faktoriyel);
            }
        }while (secim!=5);
            System.out.println("Sayı1= ");
        int sayi1= oku.nextInt();
        System.out.println("Sayi2= ");
        int sayi2= oku.nextInt();

        switch (secim){
            case 1:System.out.println("Sonuç= "+(sayi1+sayi2));break;
            case 2:System.out.println("Sonuç= "+(sayi1-sayi2));break;
            case 3:System.out.println("Sonuç= "+(sayi1*sayi2));break;
            case 4:System.out.println("Sonuç= "+(sayi1/sayi2));break;
        }
    }





}
