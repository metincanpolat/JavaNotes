package Gun24_Sets;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _06_Soru {
    public static void main(String[] args) {
        // Soru : 20 dan  60 kadar olan random sayılarla 10 elemanlı normal
        // bir diziyi doldurunuz. Sonrasında farklı olan rakamları , bir başka diziye
        // atayınız.(aynı rakamlar atılmayacak)
        // 2.Aşama - bir başka diziye atma işlemini bu sefer SET ile yapınız.


        /*** 1. Bölüm ***/

        int[] randomDizi=new int[10];
        int ayniSayisi=0;
        int[] sadeDizi=new int[10];

        for (int i = 0; i < randomDizi.length; i++)
            randomDizi[i]=(int) (Math.random()*(60-20)+20);

        Arrays.sort(randomDizi);

        System.out.println("RandomArray= "+Arrays.toString(randomDizi));



          for (int i = 0; i < randomDizi.length-1; i++) {
            if (randomDizi[i]!=randomDizi[i+1])
                sadeDizi[i]=randomDizi[i];
        }

          sadeDizi[9]=randomDizi[9];
        System.out.println("SıfırlıArray= "+Arrays.toString(sadeDizi));




        for (int i = 0; i < sadeDizi.length; i++) {
            if (sadeDizi[i]!=0)
                ayniSayisi++;
        }

        int[] diziSonHali=new int[ayniSayisi];

        int j=0;
        for (int i = 0; i < sadeDizi.length; i++) {
            if (sadeDizi[i]!=0){
            diziSonHali[j]=sadeDizi[i];
            j++;}
        }
        System.out.println("TekrarsızArray= "+Arrays.toString(diziSonHali));

        /*** 2. Bölüm ***/

        LinkedHashSet<Integer> tekrarsizSayilar=new LinkedHashSet<>();

        for (int i = 0; i < randomDizi.length; i++)
            tekrarsizSayilar.add(randomDizi[i]);

        System.out.println("tekrarsizLinkedHashSet = " + tekrarsizSayilar);


      /*  for (int i = 0; i < randomDizi.length; i++) {
            if (Arrays.binarySearch(sadeDizi,randomDizi[i])<0)
                sadeDizi[i]=randomDizi[i];
        }
        System.out.println(Arrays.toString(sadeDizi));*/





    }
}



