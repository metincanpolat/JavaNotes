package Gun25_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_JavaMaps {
    public static void main(String[] args) {

        Map<Integer,String> hm=new HashMap<>();// Maplerden HashMap. Bu şekilde de yazabiliriz.
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm); //hızlı çalışmak için kendisine göre sıralıyor.

        Map<Integer,String> lhm=new LinkedHashMap<>(); // Map lerden LınkedHashMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm); // ekleme sırasına göre saklıyor

        Map<Integer,String> tm=new TreeMap<>(); // Map lerden TreeMap
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm); // her zaman sıralı







    }
}
