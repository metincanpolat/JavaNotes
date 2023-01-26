package Gun25_Maps;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMaps {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"İsmet Temur");
        hm.put(1002, "Birkan Yıldız");
        hm.put(2001,"Hasan Aşık");
        hm.put(5001,"Hatice");
        hm.put(2003,"Eyüpcan Bilgin");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k: hm.keySet()) // key Integer olduğu için Integer yazdık
            System.out.println("k = " + k);

        for (String v :hm.values()) // value degeri String
            System.out.println("v = " + v);

        // Entry -> girilen(veri) , EntrySet -> girilenlerin seti yani veriler
        for (Map.Entry<Integer,String> kv: hm.entrySet()) //entrySet : bütünn varlığı
        {
            System.out.println("kv.getKey() = " + kv.getKey());
            System.out.println("kv.getValue() = " + kv.getValue());
        }

        for (Map.Entry<Integer,String> kv : hm.entrySet())
            System.out.println("anahtar ve değer = "+kv.getKey()+"-"+ kv.getValue()); // tek satırda yazdık


    }
}
