package Gun10_IfElse;

import java.util.Scanner;

public class _04_Mantiksalfadeler {
    public static void main(String[] args) {
        // Mantıksal (Lojik) ifadeler
        // && (shift 6) , ||  (alt <)  veya

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        // hem tek hem pozitif  ->  (sayi%2 == 1) && (sayi > 0)

        /* VE     &&   ifade1  &&  ifade2: Her iki ifade de doğru ise doğru sonuç üretir.
           VEYA   ||   ifade1  ||  ifade2: ifadelerden en az biri doğru ise doğru sonuç üretir
           DEĞİL  !                !ifade: ifadenin tersini üretir. */

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi>0){ // hem tek hem de pozitif VE koşulu
            System.out.println("uygun sayı girildi");}
        else {// yukarıdaki şart değilse
            System.out.println("uygun sayı GİRİLMEDİ");}

    }
}
