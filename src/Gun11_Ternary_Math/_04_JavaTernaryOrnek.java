package Gun11_Ternary_Math;

import java.util.Scanner;

public class _04_JavaTernaryOrnek {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();

        int sonuc=(sayi>50) ? 1 : 0;
        System.out.println("sonuc = " + sonuc);



    }
}
