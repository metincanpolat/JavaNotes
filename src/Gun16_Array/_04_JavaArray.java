package Gun16_Array;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 100 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırınız.

        // 6 7 3 8 1 -> 25 -> ort=25/eleman sayısı -> ort dan büyük kaç eleman var.

        Scanner oku=new Scanner(System.in);

        int[] notlar=new int[5];

        int toplam=0;
        for (int i=0; i<notlar.length; i++){
            System.out.println("Not=");
            notlar[i]= oku.nextInt();
            toplam=toplam+notlar[i];}

        int ort=toplam/notlar.length;

        int gecensayisi=0;
        for (int i=0 ; i<notlar.length ; i++)
        {
            if (notlar[i]>ort){
                System.out.println("notlar = " + notlar[i]);
                gecensayisi++;
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("gecensayisi = " + gecensayisi);









    }
}
