package Gun21_Return;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _11_Soru9 {
    static int sayac=1;
    public static void main(String[] args) {
        //Write a method called `append`
        //`append adında bir method oluşturun.`
        //`Parametre olarak iki int array  oluşturun.`
        // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir:
        // {2, 4, 6, 1, 2, 3, 4, 5}.

        int[] array1 = createArray();
        int[] array2 = createArray();
        int[] array3 = append(array1,array2);


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
        System.out.println(sayac+".Dizi: "+Arrays.toString(array));
        sayac++;
        return array;
    }
    static int[] append(int[] array1,int[] array2){
        int[] array=new int[array1.length+ array2.length];
        for (int i = 0; i < array.length; i++) {
            if (i<array1.length)
                array[i]=array1[i];
            if (i<array2.length)
                array[i+array1.length]=array2[i];
        }
        System.out.println("Yeni diziniz: "+Arrays.toString(array));

        return array;
    }
}
