package Gun07_String;

public class _09_StringReplaceFirst {
    public static void main(String[] args) {
        // replaceFirst : bir string içindeki karakter(leri) verilenle değiştirir. Sadece ilkini.
        String text="Herkese Merhaba Dünya";

        System.out.println("Orjinal hali = " + text);
        System.out.println("ilk a, e ile değişti = " + text.replaceFirst("a","e"));
        System.out.println("ilk karşısına çıkan dunya değişti = " + text.replaceFirst("Dünya","Java"));
        System.out.println("ilk a yı silelim " + text.replaceFirst("a",""));
        System.out.println("ilk boşluğu temizle = " + text.replaceFirst(" ",""));


    }
}
