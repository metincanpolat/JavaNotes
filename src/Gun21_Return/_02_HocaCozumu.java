package Gun21_Return;

import java.util.Scanner;

public class _02_HocaCozumu {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        int secim;
        do {
            menuYaz();
            secim= oku.nextInt();
            if (secim<5) islemYap(secim);
            }while (secim <5); // dönme sartı seçim < 5
        System.out.println("çıkış yapıldı");

    }
    public static void menuYaz()
    {
        System.out.println("\n1-toplama\n" +
                "2-çıkarma\n" +
                "3-çarpma\n" +
                "4-bolme\n" +
                "5-Çıkış\n" +
                "Seçiminiz: ");
    }
    public static void islemYap(int secim)
    {
        Scanner oku=new Scanner(System.in);
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
