package Gun25_Maps;

import java.util.HashMap;

public class _01_JavaMaps {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        //Map = Anahtar+Set -> Anahtarlı set

        //anahtarımın tipi Integer, değerimin tipi String olacak
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"İsmet Temur");
        hm.put(1002, "Birkan Yıldız");
        hm.put(2001,"Hasan Aşık");
        hm.put(5001,"Hatice");
        hm.put(2001,"Eyüpcan Bilgin"); // 2001 deki bilgiyi GÜNCELLİYOR.

        System.out.println("hm = " + hm); // hem key hem de value leri yazdırdı.
        System.out.println("hm.get(1002) = " + hm.get(1002));
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.l = " + hm.keySet()); // key numaralarını toplu yazdırdı
        System.out.println("hm.values() = " + hm.values()); // atadığımız değerleri toplu listeledi

        hm.remove(2001); // 2001 anahtarındaki eleman silindi.
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size()); // içerisinde kaç eleman olduğunu gösterdi

        hm.clear(); // tamamını sildi.
        System.out.println("hm = " + hm);










    }
}
