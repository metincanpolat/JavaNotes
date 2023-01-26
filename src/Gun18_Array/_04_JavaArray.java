package Gun18_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi, 10 a kadar olan sayılarla random duldurunuz,
        // sonrasında kullancıdan alacağınız bir sayının dizide olup olmadığını
        // var veya yok diyerek yazdırınız.

        int[] dizi=new int[10];

        for (int i=0; i< dizi.length;i++)
            dizi[i] = (int) (Math.random() * 10);

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı giriniz= ");
        int sayi= oku.nextInt();
        int t=Arrays.binarySearch(dizi,sayi);

        if (t>-1)
            System.out.println("var");
        else System.out.println("yok");

    /*                ALTERNATİF HOCA ÇÖZÜMÜ     */

/*
        int[] dizi=new int[10];

        for (int i=0; i< dizi.length;i++)
            dizi[i] = (int) (Math.random() * 10);

        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı giriniz= ");
        int sayi= oku.nextInt();

        for (int i = 0; i < dizi.length ; i++) {

            if (dizi[i]==sayi){
                System.out.println("var");break;}
            else System.out.println("yok");break;*/

    }
}
