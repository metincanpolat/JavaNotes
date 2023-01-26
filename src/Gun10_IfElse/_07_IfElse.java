package Gun10_IfElse;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67
        Scanner oku=new Scanner(System.in);
        System.out.print("iki sayı giriniz:");

        String strIkiSayi= oku.nextLine(); // 45 67 önce ayır, int cevir sonra karşılatır.

        int bosluk=strIkiSayi.indexOf(" ");
        String strSayi1=strIkiSayi.substring(0,bosluk);
        String strSayi2=strIkiSayi.substring(bosluk+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt((strSayi2));

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        if (sayi1==sayi2){
            System.out.println("Eşit");}
        else System.out.println("Değil");

    }
}
