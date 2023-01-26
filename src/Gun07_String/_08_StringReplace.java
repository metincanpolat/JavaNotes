package Gun07_String;

public class _08_StringReplace {
    public static void main(String[] args) {
        // replace : bir stringin içindeki karakter(leri) verilen ile değiştirir.

        String text="Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replace(\"a\",\"e\") = " + text.replace("a","e")); // Merhebe Dünye
        System.out.println("text.replace(\"ba\",\"de\") = " + text.replace("ba","de")); // Merhade Dünya
        System.out.println("Dünya ->Java= " + text.replace("Dünya","Java")); //Merhaba Java
        System.out.println("a ları silelim: " + text.replace("a","")); // Merhb Düny
        System.out.println("boşlukları temizle: " + text.replace(" ","")); // MerhabaDünya









    }
}
