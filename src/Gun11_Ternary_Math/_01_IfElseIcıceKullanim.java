package Gun11_Ternary_Math;

import java.util.Scanner;

public class _01_IfElseIcıceKullanim {
    public static void main(String[] args) {
        // Girilen bir sayının pozitif,negatif veya sıfır olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi==0){
            System.out.println("Sayı sıfıra eşit");}
        else { // sıfır değilse buradan devam ediyor
             if (sayi>0){
            System.out.println("Sayı pozitif");}
             else {
                 System.out.println("Sayı negatif");
             }}

        // Bu şekilde iç içe yazabiliyoruz. Böylelikle bilgisayarı yormuyoruz.Doğru cevabı bulana
        // kadar ilerliyor, bulduktan sonra ilerlemiyor.


    }
}
