package Gun18_Array;

import java.util.Arrays;

public class _03_JavaArray {
    public static void main(String[] args) {
// 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // tek elemanlarını ayrı bir diziye, çift elemanlarını ayrı bir başka
        // diziye, sadece atanana elemanların sayısı kadar olacak şekilde atayınız.

        int[] dizi=new int[10];
        int tekMiktar=0, ciftMiktar=0;

        for (int i=0; i< dizi.length;i++) {
            dizi[i] = (int) (Math.random() * 100);

            if (dizi[i] % 2 == 1)
                tekMiktar++;
            else ciftMiktar++;
        }
        int[] tekler=new int[tekMiktar];
        int[] ciftler=new int[ciftMiktar];


        int j=0,r=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==1){
                tekler[j]=dizi[i];
                j++; }
            else {ciftler[r]=dizi[i];
                r++;}
        }


        System.out.println("dizi= "+ Arrays.toString(dizi));
        System.out.println("Tekler dizisi: "+Arrays.toString(tekler));
        System.out.println("Çiftler dizisi: "+Arrays.toString(ciftler));




    }
}
