package Gun06_String;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenen noktadaki karakteri verir
        // karakterlerin sırası 0(sıfır) dan başar.
        // buna index denir. index=> sıfırdan başlayan sayma sırası.
        //            0123456789 10 11 12 13
        String cumle="Merhaba Dünya";

        char ilkHarf=cumle.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        System.out.println("h harfi= "+cumle.charAt(3)); // cumle nin 3 deki karakter



    }
}
