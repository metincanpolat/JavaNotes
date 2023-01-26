package Gun12_Switch;

import java.util.Scanner;

public class _07_Odev {
    public static void main(String[] args) {
        /****    01    ****/
        // 1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.println("Ay numarası giriniz: ");
        int sayi= oku.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Ocak 31 Gün");break;
            case 2:
                System.out.println("Şubat 28-29 Gün");break;
            case 3:
                System.out.println("Mart 31 Gün");break;
            case 4:
                System.out.println("Nisan 30 Gün");break;
            case 5:
                System.out.println("Mayıs 31 Gün");break;
            case 6:
                System.out.println("Haziran 31 Gün");break;
            case 7:
                System.out.println("Temmuz 31 Gün");break;
            case 8:
                System.out.println("Ağustos 31 Gün");break;
            case 9:
                System.out.println("Eylül 30 Gün");break;
            case 10:
                System.out.println("Ekim 31 Gün");break;
            case 11:
                System.out.println("Kasım 30 Gün");break;
            case 12:
                System.out.println("Aralık 31 Gün");break;
            default:
                System.out.println("Hatalı bilgi girişi");break;}

            /****    02    ****/
            // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

            System.out.println("Bir sayı giriniz: ");
            int sayi2= oku.nextInt();
            int yuzler=sayi2/100;
            int onlar=(sayi2/10)%10;
            int birler=sayi2%10;

            String on="On";
            String yirmi="Yirmi";
            String otuz= "Otuz";
            String kırk= "Kırk";
            String elli= "Elli";
            String atmıs= "Atmış";
            String yetmis="Yetmis";
            String seksen="Seksen";
            String doksan="Doksan";
            String bir="Bir";
            String iki="İki";
            String uc="Üç";

            switch (yuzler) {
                case 1:
                    System.out.print("yüz ");break;
                case 2:
                    System.out.print("iki yüz ");break;
                case 3:
                    System.out.print("üç yüz ");break;
                case 4:
                    System.out.print("dört yüz ");break;
                case 5:
                    System.out.print("beş yüz ");break;
                case 6:
                    System.out.print("altı yüz ");break;
                case 7:
                    System.out.print("yedi yüz ");break;
                case 8:
                    System.out.print("sekiz yüz ");break;
                case 9:
                    System.out.print("dokuz yüz ");break;
                }
            switch (onlar){
                case 0:
                    System.out.print("");break;
                case 1:
                    System.out.print("on ");break;
                case 2:
                    System.out.print("yirmi ");break;
                case 3:
                    System.out.print("otuz ");break;
                case 4:
                    System.out.print("kırk ");break;
                case 5:
                    System.out.print("elli ");break;
                case 6:
                    System.out.print("altmış ");break;
                case 7:
                    System.out.print("yetmiş ");break;
                case 8:
                    System.out.print("seksen ");break;
                case 9:
                    System.out.print("doksan ");break;}
            switch (birler){
                case 0:
                    System.out.print("");break;
                case 1:
                    System.out.print("bir");break;
                case 2:
                    System.out.print("iki");break;
                case 3:
                    System.out.print("üç");break;
                case 4:
                    System.out.print("dört");break;
                case 5:
                    System.out.print("beş");break;
                case 6:
                    System.out.print("altı");break;
                case 7:
                    System.out.print("yedi");break;
                case 8:
                    System.out.print("sekiz");break;
                case 9:
                    System.out.print("dokuz");break;}

        /****    03    ****/
        //20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.
        System.out.println("\n");
        int uretilenSayi= (int)(Math.random()*(80-20))+(20);
        System.out.println("uretilenSayi = " + uretilenSayi);

        int birler2=uretilenSayi%10;
        switch (birler2){
            case 0:
                System.out.print("Birler basamağı: sıfır");break;
            case 1:
                System.out.print("Birler basamağı: bir");break;
            case 2:
                System.out.print("Birler basamağı: iki");break;
            case 3:
                System.out.print("Birler basamağı: üç");break;
            case 4:
                System.out.print("Birler basamağı: dört");break;
            case 5:
                System.out.print("Birler basamağı: beş");break;
            case 6:
                System.out.print("Birler basamağı: altı");break;
            case 7:
                System.out.print("Birler basamağı: yedi");break;
            case 8:
                System.out.print("Birler basamağı: sekiz");break;
            case 9:
                System.out.print("Birler basamağı: dokuz");break;}


    }
}
