package Gun17_Split;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {


        // Arrays.toString(dizi)
        String[] isimler = {"ahmet","melike","sümeyra","inanç","mert"};
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        //["ahmet","melike","sümeyra","inanç","mert"]

        //Arrays.sort(isimler)
        Arrays.sort(isimler); //sıralama işlemi yapıldı
        System.out.println("isimler = "+ Arrays.toString(isimler));
        //[ahmet,inanç,melike,mert,,sümeyra]

        //Diziler eşit mi? Arrays.equals(dizi1,dizi2)

        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println(Arrays.equals(a,b)); //true
        System.out.println(Arrays.equals(a,c)); //false

        //Arrays.fill-> bütün kutucuklaara 7 atar;
        Arrays.fill(c,7);
        System.out.println(Arrays.toString(c));

        //Arrays.binarySearch(rakamlar, 5)   -> Sıralı dizide aranan elemanın indexi verir
        // aranan elaman birden fazla ise herhangi birini verebilir.
        // esas amacı var mı yok mu kontrolü, var ise INDEXini verir, yok ise negatif sayı döndürür

        int[] rakamlar={2,7,4,6,5};

        System.out.println(Arrays.toString((rakamlar)));
        Arrays.sort(rakamlar);
        System.out.println(Arrays.toString((rakamlar)));

        System.out.println(Arrays.binarySearch(rakamlar,7));


        /* SONRADAN NOTLAR */

        int[] gr={10,20,32,36,52,22,874,};
        int[] sr = new int[10];

        System.arraycopy(gr,0,sr,0,7); // bir arrayi başka bir array e koyalama.For döngüsü ile aynı sistem.

        // Buna DeepCopy deniyor.

        // gr=sr dediğimiz zaman liste sabit kalıyor ve ona giden yeni bir adres ekleniyor. Bu noktada sr de yapacağımız değişiklik
        // gr yi de etkiliyor. Bu kopyalamaya Shallow Copy deniyor.

        //(kopyalanacak array, kaçıncı indexden kopyalamaya başlayacak, yeni array, kaçıncı indexten başlayacak,kopyalanacak index adedi)

        System.out.println(Arrays.toString(c));

    }
}
