package Gun17_Split;

public class _02_JavaArrayIndexBulma {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int[] dizi=new int[100]; // 100 elemanlı bir dizi

        int diziSayisi= dizi.length;

        for (int i=0; i<diziSayisi;i++)
            dizi[i]= (int) (Math.random()*100);

        for (int i=0; i<diziSayisi;i++) //kontrol için yazdırdık
            System.out.println(i+".sayı= "+dizi[i]);

        int enb=0;
        int enbIndex=0;
        for (int i=0; i<diziSayisi;i++)
            if (dizi[i]>enb) {
                enb = dizi[i];
                enbIndex = i;
            }

        System.out.println("enbIndex = " + enbIndex);
        System.out.println("enb = " + enb);








    }
}
