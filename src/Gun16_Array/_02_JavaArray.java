package Gun16_Array;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi=0;// daha önce değişkeni bu şekilde tanımlıyorduk,1 tane yer açtı hafızada
        int[] dizi=new int[5]; // 0,1,2,3,4 index li 5 adet sayılık yer açtı hafızada

        dizi[0]=5;
        dizi[1]=56;
        //dizi[5]=45; // bu OLAMAZ Challenger patlar, en son 4 olabilir, 01234

        System.out.println("dizi = " + dizi.length); // bu bana kaç eleman olduğunu verir

        Scanner oku=new Scanner(System.in);
        for (int i=0 ; i< dizi.length ; i++)
        {
            System.out.println("sayı giriniz=");
            dizi[i]=oku.nextInt();
        }

        System.out.println("dizinin 4.sırası = " + dizi[4]);

        for (int i=0; i< dizi.length;i++)
            System.out.println(dizi[i]);




    }
}
