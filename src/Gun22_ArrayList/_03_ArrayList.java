package Gun22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_ArrayList {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[6];


        for (int i = 0; i < 6; i++) {

            System.out.println("Sayı giriniz: ");
            int sayi= oku.nextInt();
            dizi[i]=sayi;

        }
        System.out.println(Arrays.toString(dizi));

        ArrayList<Integer> tekler=new ArrayList<>(); //methodla bağladığımız için gri yaptı.direkt aşağıda yapabilirdin diyor Intellij

       // 1.Yöntem

       /* for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1)
                tekler.add(dizi[i] );
        }
        System.out.println("tekler = " + tekler);*/

        //2.Yöntem
        tekler=tekElemanlarAta(dizi);
        System.out.println("tekler = " + tekler);


    }
    public static ArrayList<Integer> tekElemanlarAta(int[] dizi)
    {
        ArrayList<Integer> tekler=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1)
                tekler.add(dizi[i]);

        }return tekler;
    }




}
