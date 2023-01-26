package Gun03_Java_Variable;

public class _06_javaString {
    public static void main(String[] args) {
        String ad="Metin";  // String: kelime veya kelimeleri tutmak için kullanılır.
                            // sınırlarını " " ile belirleriz.
        String soyad="Canpolat";
        System.out.println("ad = " + ad);
        System.out.println("ad = " + ad+" "+soyad);  // aralarina bosluk vermek icin boyle yaptik.

        String tamAd= "metin"+" "+" canpolat";
        String tamAd2= ad+" "+soyad;
        System.out.println("tamAd = " + tamAd);
        System.out.println("tamAd2 = " + tamAd2);

        int sayiYas=45;  // int tanımlandı yani gerçekten sayı, toplamalarda kullanabiliriz.
        String kelimeSa="45";   // String türü bir değişken, simge durumunda, toplama işlemlerinde kullanılamaz.
                                // Dönüştürülmesi gerekir.

        String birNot="Bugun dersimizde\n string konusunu, \n gorduk.\n veri tiplerinden";
        System.out.println("birNot = " + birNot);

        /* SONRADAN NOTLAR */

        String a=""+123; // şeklinde yazılabilir.


    }
}
