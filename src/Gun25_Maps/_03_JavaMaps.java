package Gun25_Maps;

import java.util.HashMap;

public class _03_JavaMaps {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız.

        HashMap<String,String> vKartVizit=new HashMap<>();
        vKartVizit.put("isim", "Volkan Altıntaş");
        vKartVizit.put("email", "volkan@gmail.com");
        vKartVizit.put("adres", "Çekmeköy/Türkiye");
        vKartVizit.put("telefon", "05052358966");

        System.out.println("vKartVizit.get(\"isim\") = " + vKartVizit.get("isim"));
        System.out.println("vKartVizit.get(\"telefon\") = " + vKartVizit.get("telefon"));

        HashMap<String,String> eKartVisit=new HashMap<>();
        eKartVisit.put("isim", "Elba Gurbanov");
        eKartVisit.put("email", "elba@gmail.com");
        eKartVisit.put("adres", "Bakü/Azerbaycan");
        eKartVisit.put("telefon", "+994563254463");

        // Kartvizitlerim diye bir defteri nasıl tanımlardım.
        // volkan ın kartviziti
        // Elba nın kartviziti

        HashMap<String,HashMap<String,String>> Kartvizitlerim=new HashMap<>();
        Kartvizitlerim.put("volkan",vKartVizit);
        Kartvizitlerim.put("elba",eKartVisit);

        // volkan ın telefonuna nasıl ulaşırım
        System.out.println("Volkan ın kartviziti = " + Kartvizitlerim.get("volkan"));
        System.out.println("Volkan ın telefonu = " + Kartvizitlerim.get("volkan").get("telefon"));
        System.out.println("Elba nın adresi = " + Kartvizitlerim.get("elba").get("adres"));












    }
}
