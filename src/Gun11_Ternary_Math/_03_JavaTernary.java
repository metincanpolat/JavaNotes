package Gun11_Ternary_Math;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();
        // 1.Yöntem
        if (sayi%2==0){
            System.out.println("çift");}
        else System.out.println("tek");

        // tek satırda yazma yöntemi : Ternary
        String sonuc=(sayi%2==0) ? "çift" : "tek"; // : else olarak çalıştı.
        // şart doğru ise ilk bölüm değil se son bölüm çalışır.
        System.out.println("sonuc = " + sonuc);

        // direkt so nun içinde kullanma yöntemi.
        System.out.println((sayi%2==0) ? "çift" : "tek");

    }
}
