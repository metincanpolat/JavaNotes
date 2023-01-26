package Gun16_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Odev {
    public static void main(String[] args) {

        /****    1    ****/
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.

        String[] array={"Apple" , "Orange" , "Banana" , "Pineapple"};
        boolean varmi;
        for (int i=0; i< array.length;i++){
            if (varmi=array[i].equals("Apple"))
            System.out.println("Apple stringi diziye ait mi? = " + varmi);break;
        }
        /****    2    ****/
        // int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int[] array1={12,2,5,15,8};
        int enb=0;
        for (int i=0; i< array1.length;i++){
            if (enb<array1[i])
                enb=array1[i];
        }
        System.out.println("\n"+"En büyük sayı = " + enb);

        /****    3    ****/
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int[] array2={14,19,5,21};
        int enb1=0;
        for (int i=0; i< array2.length;i++){
            if (enb1<array2[i])
                enb1=array2[i];}

        int eks=enb1;
        for (int j=0; j< array2.length;j++){
            if (eks>array2[j])
                eks=array2[j];}

        System.out.println("\n"+"En küçük Sayı = " + eks);

        /****    4    ****/
        // int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] array4={15,25,22,18,30};
        int[] array3=new int[5];
        int enb11=0;
        for (int i=0; i< array4.length;i++){
            if (enb11<array4[i])
                enb11=array4[i];}

        for (int i=0; i< array4.length;i++) {
            if (array4[i]<enb11)
                array3[i]=array4[i];
}

        int enb2=0;
        for (int i=0; i< array3.length;i++){
            if (enb2<array3[i])
                enb2=array3[i];}
        System.out.println("\n"+"En büyük ikinci sayı = " + enb2);

        /****    5    ****/

        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.

        int[] array5={5,6,8,12,14,19};
        int toplam=0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 == 0)
                toplam += array5[i];
            else toplam -= array5[i];
        }
            System.out.println("\n"+"toplam = " + toplam);
        /****    6    ****/
        // LISTEDE SORU YOK.

        /****    7    ****/
        //Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve
        // int array'inin(ilk oluşturduğunuz array) ilk ve
        // son elementlerini kapsayan yeni array'e return edin
        // Oluşturacağınız int array'i =   ([1, 2, 3, 4])
        //Sonuç bu şekilde olmalıdır. [1, 4]

        int[] array6={1,2,3,4,5,6,7};
        int basamak=array6.length;
        int[] array7=new int[2];
        array7[0]=array6[0];
        array7[1]=array6[basamak-1];

        System.out.println("\n"+"İlk Array= "+Arrays.toString(array6));
        System.out.println("İkinci Array= "+Arrays.toString(array7));


        /****    8    ****/
        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int[] array8={12,14,21,23,10,4};

        int toplam8=0;

        for (int i = 0; i < array8.length; i++) {
            toplam8+=array8[i];

        }
        int ortalama=toplam8/array8.length;

        System.out.println("\n"+"ortalama = " + ortalama+"\n");

        /****    9    ****/
        //String Array (Dizi) oluşturunuz.
        // elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.

        String[] array9={"Apple","Orange","Babana","Kiwi"};

        for (int i = 0; i < array9.length; i++)
            System.out.println(i+". kutu = " + array9[i]);

        /****    10    ****/

        //String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız
        //Cevap 4 olmalı.

        String[] array10={"new jersey","new york","boston","California"};
        System.out.println("\n"+"Eleman sayısı= "+array10.length);

        /****    11    ****/

        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.

        int[] array11={25,30,30,35,100};
        int toplam11=0;

        for (int i = 0; i < array11.length ; i++)
            toplam11+=array11[i];

        System.out.println("Dizi elemanlarının toplamı = " + toplam11);

        /****    12    ****/
        // AYRI SRC DOSYASI OLARAK GÖNDERİLDİ

        /****    13    ****/

        //Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
        //ayrı bir döngüde en büyük ve en küçük rakamın farkını bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] array12=new int[10];

        for (int i = 0; i < array12.length; i++) {
            System.out.println((i+1)+". sayıyı giriniz");
            array12[i]=oku.nextInt();}

        for (int i = 0; i < array12.length; i++) {
            System.out.println(array12[i]);
        }
        int enb12=0;
        for (int i = 0; i < array12.length;i ++) {
            if (enb12<array12[i])
                enb12=array12[i];
            }
        int eks12=enb12;
        for (int i = 0; i < array12.length;i ++) {
            if (eks12>array12[i])
                eks12=array12[i];
        }
        int fark12=enb12-eks12;
        System.out.println("En büyük ve en küçük sayının farkı " + fark12);

        /****    14    ****/
        //Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
        //ayrı bir döngüde çift rakam sayısını bulunuz ve yazdırınız

        int[] array13=new int[10];

        for (int i = 0; i < array13.length; i++) {
            System.out.println((i+1)+". sayıyı giriniz");
            array13[i]=oku.nextInt();}

        for (int i = 0; i < array13.length; i++) {
            System.out.println(array13[i]);
        }
        int ciftS13=0;
        for (int i = 0; i < array13.length;i ++) {
            if (array13[i]%2==0)
                ciftS13++;
        }
        System.out.println("Çift sayı miktarı= "+ciftS13);

    }
}
