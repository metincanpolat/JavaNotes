package Gun23_2D_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar = " + rakamlar);

        //Sıralama İşlemi
        Collections.sort(rakamlar);
        System.out.println("Collections.sort(rakamlar) = " + rakamlar);

        //tersine çevir
        Collections.reverse(rakamlar);
        System.out.println("Collections.reverse rakamlar = " + rakamlar);

        //Max ve Min eleman bulma
        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        //Bütün elemanları set etme
        Collections.fill(rakamlar,0); //bütün elemanlara 0 atar
        System.out.println("Collections.fill rakamlar = " + rakamlar);

        //replace
        Collections.replaceAll(rakamlar,0,5); //0 lara 5 atadı
        System.out.println("Collections.replaceAll rakamlar = " + rakamlar);

        //tanımlarken değer atama
        int[] dizi={2,3,4,5}; // burada olduğu gibi direk içeriği oluşturuyoruz.
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(2,3,4,5,6));//içerisine normal dizi atıp dönüştürme de yapabiliriz.
        ArrayList<String> strListe=new ArrayList<>(Arrays.asList("2","3","4","5","6"));



    }
}
