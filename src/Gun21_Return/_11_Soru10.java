package Gun21_Return;

import java.util.Arrays;
import java.util.Scanner;

public class _11_Soru10 {
    static int sayac=1;
    public static void main(String[] args) {
        //**isUnique** adında bir method oluşturun.
        //Parametre olarak int array alır.
        // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
        //örneğin, list isminde bir array'imiz varsa,
        //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
        //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        int[] array1 = createArray();

        System.out.println(isUnique(array1));

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
    static boolean isUnique(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if ((array[i]==array[i+1])) return false;break;
        }
        return true;
    }

}
