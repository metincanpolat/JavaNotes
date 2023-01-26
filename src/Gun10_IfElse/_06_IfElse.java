package Gun10_IfElse;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Yeni Sifreyi Giriniz: ");
        String sifre= oku.nextLine();
        if (sifre.length()>7 && !sifre.contains("pass") && sifre.length()<13){
            System.out.println("UYGUN");}
        else System.out.println("UYGUN DEGIL");
        // !sifre.contains("pass") dediğimizde aksi seçeneği alıyor.
        // sonuç tersi çıkıyor.Başına ! koyduk. Boolean ler için.




    }
}
