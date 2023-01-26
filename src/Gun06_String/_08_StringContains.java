package Gun06_String;

public class _08_StringContains {
    public static void main(String[] args) {
        // contain: bir stringin ierisinde karakter(lerin) var olup
        // olmadığını boolean cinsinde söyle true veya false

        String cumle="Merhaba Dünya";

        boolean varMi=cumle.contains("a");
        System.out.println("varMi = " + varMi);

        // direkt de yapabiliriz. Ikınci yöntem

        System.out.println("cumle = " + cumle.contains("ya"));
        System.out.println("cumle = " + cumle.contains("k"));
        System.out.println("cumle = " + cumle.contains("Dünya"));
        System.out.println("cumle = " + cumle.contains("düya"));





    }
}
