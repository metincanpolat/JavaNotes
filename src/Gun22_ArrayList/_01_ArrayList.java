package Gun22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : Boyut sayısı belli ve sonradan boyutu değiştirelemez.
        int[] dizi=new int[5]; // Array 5 elemanlı boyutu sonradan değiştirilemiyor.

        // Boyutu dinamik olsa, eleman eklendikçe uzasa, sildikçe kısalsa.
        // ArrayList : boyutu başta vermene gerek yok, boyutu 0 başta,
        // eleman ekledikçe artar, sildikçe azalır.

       // List<String> departments=new ArrayList<>(List.("Electronics","Ekonomy"));

       // ArrayList<String> friends =  new ArrayList<>(List.of("Peter", "Paul"));

        List<String> departments=new ArrayList<>(Arrays.asList("ansdkjas","jasnfj"));
        List<String> departments2= Arrays.asList("dvsd","jdjsj");

        ArrayList<Integer> integerList=new ArrayList<>(); // tanımlama
        ArrayList<Boolean> booleanLiest=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();

  //      Integer s1=5;// hem sayı hem de içinde fonksiyonlar saklıyor. default null -> ismi var cismi yok
  //      int s2=6; // bu hafızada sadece rakam saklayabilen bir değişken, ilkel tip, primitive tip, default 0

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler); // hızlı yazdırma

        isimler.add("Ahmet"); // uzunluğu 1
        isimler.add("Ayşe"); // uzunluğu 2
        isimler.add("Kaya");
        isimler.add("Ali"); // hem dizinin sonuna ekliyor

        System.out.println("isimler = " + isimler);
        

        System.out.println("isimler.size() = " + isimler.size()); // lenght almak için kullanıyoruz.

        isimler.add(1,"Fatih"); // verilen indexe ekliyor, diğerleri sona doğru kayıyor.
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zeynep");
        System.out.println("isimler = " + isimler); // belli bir indexteki elemanı değiştirme.

        // sıralama
        Collections.sort(isimler);
        System.out.println("sorted : "+isimler);

        isimler.remove("Zeynep"); // elemanı bulup siler.
        System.out.println("isimler = " + isimler);

        isimler.remove(0); // 0 index ini siler.
        System.out.println("isimler = " + isimler);

        int indexOfKaya= isimler.indexOf("Kaya"); // verilen elemanın indexini verir
        System.out.println("isimler = " + isimler);

        for (int i = 0; i < isimler.size(); i++)
            if (isimler.get(i).equalsIgnoreCase("kaya")) // büyük/küçük harf duyarlı silmek için
                isimler.remove(i);

        String ilkKelime=isimler.get(0); //indexdeki elemanı alma sayi=dizi[0]
        System.out.println("ilkKelime = " + ilkKelime);

        isimler.clear(); // tüm list boşaltıldı. ilk hale geldi.
        System.out.println("isimler = " + isimler);

        //Arraylist işlemciden yiyor, array ramden yiyor.


        List<String> asd=new ArrayList<>();
        asd.add("metin");
        asd.add("metin1");
        asd.add("metin2");
        asd.add("metin3");

        asd.removeIf(a -> a.equals("metin1"));

//        for (String s: asd)
//            if (s.equals("Metin1"))
//                asd.remove(s);

        System.out.println("asd.size() = " + asd.size());








    }
}
