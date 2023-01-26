package Gun13_While_DoWhile;

import java.util.Scanner;

public class _09_Odev {
    public static void main(String[] args) {
        /****    1    ****/
       // Girilen bir sayıya kadar olan sayıların çarpım sonucunu bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= oku.nextInt();

        int sayac=1;
        int toplam=1;

        while (sayac<(sayi+1)){
            toplam=toplam*sayac;
        sayac++;}
        System.out.println("Sayılar çarpımı = " + toplam+"\n");

        /****    2    ****/
       // 0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz.
        int sayac1=0;
        int toplamTek=0;
        int toplamCift=0;

        while (sayac1<100){
            if ((sayac1%2)==0)
                toplamCift=toplamCift+sayac1;
            else toplamTek=toplamTek+sayac1;

            sayac1++;
        }
        System.out.println("100'den 0'a kadar olan");
        System.out.println("Tek sayıların toplamı = " + toplamTek);
        System.out.println("Çift sayıların toplamı = " + toplamCift+"\n");

        /****    3    ****/
       // 100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        System.out.println("100'den 0'a kadar olan tek sayılar: ");
        int sayac2=99;

        while (sayac2>0){
            System.out.print(sayac2+"-");
            sayac2=sayac2-2;}

        /****    4    ****/
       // 0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.

        int sayac11=1;
        System.out.println("\n"+"\n"+"0-100 arasındaki 4 ve 5 e tam bölünen sayılar:");
        while (sayac11<100){
            if ((sayac11%4==0) && (sayac11%5==0))
                System.out.println(sayac11);
            sayac11++;
        }
        /****    5    ****/
        //Sayı bulmaca oyununu tam hali ile cözünüz. kullanıcıya 10 hak veriniz.
        System.out.println("\n"+"Oyun sınırı kaça kadar olsun?");
        int sinir=oku.nextInt();
        int sayac21=0;

        while (sayac21<10) {
            int tutulanSayi = (int) (Math.random() * (sinir + 1));
            System.out.println("Tahmininiz=");
            int tahmin = oku.nextInt();

            if (tutulanSayi==tahmin)
                System.out.println("Tebrikler bildiniz.");
            else System.out.println("Bilemediniz.");

            sayac21++;
        }
        System.out.println("Oyun sona erdi.");



    }
}
