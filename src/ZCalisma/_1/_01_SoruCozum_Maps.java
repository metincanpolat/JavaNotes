package ZCalisma._1;

import java.util.HashMap;

public class _01_SoruCozum_Maps {
    public static void main(String[] args) {

        String s="ABDlZACp57";

        System.out.println(repetitiveChar(s));
    }
    public static String repetitiveChar(String s){
        HashMap<String,Integer> mapStorage=new HashMap<>();
        String karakter=null;
        for (int i = 0; i < s.length(); i++) {
             karakter=s.substring(i,i+1); //A

            if (!mapStorage.containsKey(karakter))
                mapStorage.put(karakter,i);
            else return karakter;

        }
        return "tekrarlayan harf yok";
    }
}
