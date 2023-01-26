package Gun02_Escape_Character;

public class _04_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        // \n -> yeni satir aciyor, alt satıra geciriyor
        // \t -> tab tusuna basilmis gibi yapiyor
        // \b -> backspace basilmis etkisi yapar, yani 1 karakter geri siler
        // \" -> cift tirnak yazar
        // \\ -> \ isareti yaziyor
        // \r -> satir basina geri gidiyor ve satir basina kadar olan karaterlerin hepsini siler

        System.out.println("MerhabaDunya");
        System.out.println("Merhaba\nDunya");
        System.out.println("Merhaba\tDunya");
        System.out.println("Merhaba\bDunya");
        System.out.println("Merhaba\"Dunya");
        System.out.println("Merhaba\\Dunya");
        System.out.println("Merhaba\rDunya");

    }
}
