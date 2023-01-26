package Gun16_Array;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] sayi=new int[7]; //trl+altd düzeltme satır BAK

        int toplam=0;

        for (int i=0 ; i<sayi.length ; i++){
            System.out.println((i+1)+"."+"sayı giriniz:"); // (i+1) kaçıncı sayıyı girdiğimizi bilmek için.
            sayi[i]=oku.nextInt();
            toplam=toplam+sayi[i];}


        int ort=toplam/ sayi.length;

        int gecensayisi=0;

        for (int i=0; i<sayi.length;i++)
            if (sayi[i]>ort && sayi[i]%2==1 ){ // hem ortalama büyük hem de tek
            System.out.println("i = " + sayi[i]);
            gecensayisi++;}

        System.out.println("gecensayisi = " + gecensayisi);
        System.out.println("Ortalama"+ort);


}}
