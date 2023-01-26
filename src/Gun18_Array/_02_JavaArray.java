package Gun18_Array;

import java.util.Arrays;

public class _02_JavaArray {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka yeni diziye atayınız.
        // yeni dizi de 0 lar olmasın.(yeni dizinin boyutu tekerin sayısı kadar olsun)

        int[] dizi=new int[10];
        int tekMiktar=0;

        for (int i=0; i< dizi.length;i++) {
            dizi[i] = (int) (Math.random() * 100);

            if (dizi[i] % 2 == 1)
                tekMiktar++;
        }

        int[] tekler=new int[tekMiktar];
        System.out.println(Arrays.toString(tekler));

        int j=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==1){
                tekler[j]=dizi[i];
                j++;
            }
        }


        System.out.println("dizi= "+ Arrays.toString(dizi));
        System.out.println("tek sayılar= "+ tekMiktar);
        System.out.println(Arrays.toString(tekler));
    }

}
