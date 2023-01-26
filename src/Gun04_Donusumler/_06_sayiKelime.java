package Gun04_Donusumler;

public class _06_sayiKelime {
    public static void main(String[] args) {
        /****** Stringi sayıya cevirmek*****/      // Wrapper Class
        String ad="ismet";
        String kelimeSayi="65";  // şu anda bu aynı ad gibi simge yani rakam değil
        // fakat rakam, sayi görünümlü ise sayıya dönüştürülebilir.

        int intDeger=Integer.parseInt(kelimeSayi);  // sayi görünümlü simgeyi, sayıya(int) dönüştürdü.
        System.out.println("intDeger = " + intDeger);
        int toplam=intDeger+5;

        byte byteDeger=Byte.parseByte(kelimeSayi); //sayi görünümlü simgeyi, sayıya(byte) dönüştürdü.
        System.out.println("byteDeger = " + byteDeger);

        /****** Sayıları String e cevirmek icin *****/

        int sicaklik=18;
        // Bugün hava sıcaklığı 18 derece
        System.out.println("Bugün hava sıcaklığı "+sicaklik+" derece"); //otomatik stringe dönüştü.

        String sicaklikKelimeHali=Integer.toString(sicaklik); // artıl matematikte kullanılamaz.
        // int toplam2= sicaklikKelimeHali + 5; yapılamaz çünkü o artık string

        System.out.println("Bugün hava sıcaklığı "+sicaklikKelimeHali+" derece");

        /* 2.YÖNTEM */

        String strHali=String.valueOf(22); // Bu komut ile de int string e dönüşebilir.
        System.out.println(strHali+2);



    }
}
