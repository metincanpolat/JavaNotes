package Gun13_While_DoWhile;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Kullanıcı 0 değeri girene kadar, girdiği sayıların toplamını bulunuz.
        Scanner oku=new Scanner(System.in);

        System.out.println("Sayı giriniz= ");
        int sayi= oku.nextInt();
        int toplam=0;
        while (sayi!=0){
            toplam=toplam+sayi;

            System.out.println("Sayi giriniz= ");
            sayi=oku.nextInt();
        }
        System.out.println("Toplam:"+toplam);

        /**********************************/
// do while ile sadece sayıyı bir kez istedik.
        int sayi2;
        int toplam2=0;

        do { // bu döngüde döngüye bir kere mutlaka girer ve kontrol sonda.
            System.out.println("Sayı giriniz");
            sayi2=oku.nextInt();
            toplam2=toplam2+sayi2;

        } while (sayi2!=0);
        System.out.println("toplam2 = " + toplam2);


    }
}
