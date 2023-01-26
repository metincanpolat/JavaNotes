package Gun07_String;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        // toUpperCase : string buyuk harfe cevirir.

        String text="Merhaba Dünya";

        System.out.println("Orjinal hali = " + text);
        System.out.println("text in büyük hali = " + text.toUpperCase());

        // büyük veya küçük harf fark etmeksizin YA ile bitiyor mu?

        System.out.println("sonuç = " + text.toUpperCase().endsWith("YA"));



    }
}
