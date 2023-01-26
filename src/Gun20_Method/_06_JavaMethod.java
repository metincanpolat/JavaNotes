package Gun20_Method;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int[] dizi = new int[5];
        diziDoldur(dizi);

        enkSayiYaz(dizi);
        enbSayiYaz(dizi);
        ortalamaBulYaz(dizi);



    }

    public static void diziDoldur(int[] array)

    {
      Scanner oku = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("sayı giriniz: ");
            array[i]= oku.nextInt();
        }
        System.out.println(Arrays.toString(array));
        }
        
        public static void enkSayiYaz(int[] array)
        {   int enk=array[0];
            for (int i = 0; i < array.length ; i++) {
                if (array[i]<enk)
                    enk=array[i];
            }
            System.out.println("En küçük sayı= "+enk);

        //    Arrays.sort(array);  Bu şekilde de kolaylıkla enk sayı bulunabilir.
         //   System.out.println(array[0]);
        }

        public static void enbSayiYaz(int[] array1)
        {   int enb=0;
            for (int i = 0; i < array1.length; i++) {
                if (enb<array1[i])
                    enb=array1[i];
            }
            System.out.println("En büyük sayı= "+enb);
            }
        public static void ortalamaBulYaz(int[] array)
        {   int ortalama=0, toplam=0;
            for (int i = 0; i < array.length ; i++) {
                toplam+=array[i];
                ortalama=toplam/ array.length;
            }
            System.out.println("Ortalama= "+ortalama);
        }

        }



