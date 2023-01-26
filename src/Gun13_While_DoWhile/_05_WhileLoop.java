package Gun13_While_DoWhile;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar (girilen sayı dahil) olan sayıların
        // toplamını bularak yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("Kaça kadar sayı toplanacak=");
        int sinir=oku.nextInt();

        int sayac=0;
        int toplam=0;

        while (sayac<=sinir){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);

        // 2. yöntem, sayaç kullanmadan

        toplam=0;
        while (sinir>0){
            toplam=toplam+sinir;
            sinir--;
        }
        System.out.println("toplam2 = " + toplam);





           Scanner oku2=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi=oku2.nextInt();

        int sayac1=0;
        int toplam1=0;

        while (sayac1>0){
            toplam1=toplam1+sayi;
            sayac1=sayi-1;
        }

        System.out.println("toplam = " + toplam);
    }
}
