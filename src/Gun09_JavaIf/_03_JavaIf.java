package Gun09_JavaIf;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz");
        int sayi1= oku.nextInt();
        System.out.print("Ikinci sayıyı griniz:");
        int sayi2= oku.nextInt();
        if (sayi1>sayi2){
            System.out.println("Büyük Sayı="+sayi1);}
        if (sayi2>sayi1){
            System.out.println("Büyük Sayı="+sayi2);}
        if (sayi1==sayi2){
            System.out.println("Sayılar Eşit");}
    }
}
