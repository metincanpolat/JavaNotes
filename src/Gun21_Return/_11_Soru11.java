package Gun21_Return;

import java.util.Arrays;
import java.util.Scanner;

public class _11_Soru11 {
    static int sayac=1;
    public static void main(String[] args) {
        // 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız.
        // Dizideki en küçük ve enbüyük elemanları bir fonksiyonda buldurup maın de arasındaki farkı bulunuz.

        int[] array=createArray();
        int[] array1=minMaxArray(array);

        System.out.println("En büyük ve En küçük elemanların farkı= "+(array1[1]-array1[0]));


    }
    static int[] createArray(){
        Scanner oku=new Scanner(System.in);
        System.out.println(sayac+". diziniz kaç elamanlı olacak?: ");
        int[] array= new int[oku.nextInt()];
        System.out.println("Elemanları girmeye başlayabilirsiniz. \nEleman girip 'enter'a basınız");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1+". elemanı giriniz: ");
            array[i]= oku.nextInt();
        }
        System.out.println(sayac+".Dizi: "+ Arrays.toString(array));
        sayac++;
        return array;
    }
    static int[] minMaxArray(int[] array){
        Arrays.sort(array);
        int[] array1=new int[2];
        array1[0]=array[0];
        array1[1]=array[array.length-1];
        return array1;
    }
}
