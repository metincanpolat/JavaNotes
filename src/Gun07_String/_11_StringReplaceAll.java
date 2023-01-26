package Gun07_String;

public class    _11_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor.
        // regex : regular expression/düzenli ifadeler.

        String text="Merhaba Dünya123";

        System.out.println("text = " + text); // orjinal hali

        System.out.println(text.replaceAll("[abn]","_")); //abn harflerini değiştirdi
        System.out.println(text.replaceAll("[A-Z]","_")); //A ve Z arasındaki harfleri değiştir. - işareti ile
        System.out.println(text.replaceAll("[0-9]","")); // 0 ile 9 arasındaki sayıları sil
        System.out.println(text.replaceAll("[^0-9]","")); // rakamların dışındaakileri siler.




    }
}
