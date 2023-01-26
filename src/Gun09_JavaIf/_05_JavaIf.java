package Gun09_JavaIf;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının sadece, birler basamağını yazı ile yazdırınız
        // 1 -> bir    2-> iki
        Scanner oku=new Scanner(System.in);
        System.out.print("sayıyı giriniz: ");
        int sayi= oku.nextInt();
        int kalan=sayi%10;
        if (kalan==0) {System.out.println("sıfır");}
        if (kalan==1) {System.out.println("bir");}
        if (kalan==2) {System.out.println("iki");}
        if (kalan==3) {System.out.println("üç");}
        if (kalan==4) {System.out.println("dört");}
        if (kalan==5) {System.out.println("beş");}
        if (kalan==6) {System.out.println("altı");}
        if (kalan==7) {System.out.println("yedi");}
        if (kalan==8) {System.out.println("sekiz");}
        if (kalan==9) {System.out.println("dokuz");}

    }
}
