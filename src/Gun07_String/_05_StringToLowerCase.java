package Gun07_String;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase: stringi küçük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("Orjinal hali = " + text); // Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        System.out.println("text büyük veya küçük harf de olsa me ile başlıyor mu? = " +
                text.toLowerCase().startsWith("me")); //true

        // kendisine atamazsak orjinal hali yukarıdaki işlemlerde değişmez. Buradan sonra artık text değişmiş olur.
        text=text.toLowerCase(); // merhaba dünya
        System.out.println("text = " + text);



    }
}
