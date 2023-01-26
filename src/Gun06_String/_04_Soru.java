package Gun06_String;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son harfni yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir string deger giriniz=");
        String isim=oku.nextLine();

        // 01234
        // bugun uzunluk =5  uzunluk -1 ile son karaktere ulaşırım.

        int uzunluk =isim.length();
        char sonHarf=isim.charAt(uzunluk-1);

        System.out.println("Son Harf: "+sonHarf);

        System.out.println("Son Harfi: "+ isim.charAt(isim.length()-1));



    }
}
