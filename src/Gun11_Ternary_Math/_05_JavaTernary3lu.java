package Gun11_Ternary_Math;

import java.util.Scanner;

public class _05_JavaTernary3lu {
    public static void main(String[] args) {
        // Soru: Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        // olduğunu Ternary operator ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();

        String sonuc=(sayi==0) ? "sayı sıfır" : (sayi<0) ? "negatif" : "pozitif";

        System.out.println("sonuc = " + sonuc);

    }
}
