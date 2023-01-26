package Gun18_Array;

import java.util.Arrays;

public class _01_JavaArrayOnemli {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.

        int[] dizi=new int[100];

        int diziSayisi= dizi.length;

        int[] tekSayilar=new int[100];

        for (int i=0; i<diziSayisi;i++)
            dizi[i]= (int) (Math.random()*100);

        int j=0;
        for (int i=0; i<diziSayisi;i++) {
            if ((dizi[i])%2 == 1){
                tekSayilar[j]=dizi[i];
            j++;}                      // Tek sayıların index sayacını ayrı tuttuk.
        }                              // Buradaki pratik hareket önemli ayrıca döngü olmadan j artıyor



        System.out.println("dizi= "+ Arrays.toString(dizi));
        System.out.println("tek sayılar= "+ Arrays.toString(tekSayilar));





    }
}
