package Gun07_String;

public class _04_StringEndsWith {
    public static void main(String[] args) {
        // EndsWith : verilen karakter(ler) ile bitiyor mu?
        // sonuç true veya false yani boolean döner

        String text="Merhaba Dünya";

        System.out.println("ya ile bitiyor mu? = " + text.endsWith("ya")); //true
        System.out.println("a ile bitiyor mu? = " + text.endsWith("a")); // true
        System.out.println("text.endsWith(\"dünya\") = " + text.endsWith("dünya")); //false
        System.out.println("text.endsWith(\"Dünya\") = " + text.endsWith("Dünya")); // true

    }
}
