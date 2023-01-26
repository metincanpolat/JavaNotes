package Gun09_JavaIf;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayının negatif mi, pozitif mi olduğunu yazırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = oku.nextInt();

        if (sayi > 0) {
            System.out.println("Sayı Pozitif"); }
        if (sayi<0){
            System.out.println("Sayı Negatif");}
        if (sayi==0){
            System.out.println("Sayı sıfır");}
    }
}
