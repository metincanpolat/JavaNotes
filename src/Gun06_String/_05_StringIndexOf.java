package Gun06_String;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // verilen karaker(ler)in String içindeki INDEX ini verir

        String cumle="Merhaba Dünya";

        System.out.println(cumle.indexOf("r")); // 2
        System.out.println(cumle.indexOf("ha")); // 3 ha nın başladığı yerin indexini veriyor.
        System.out.println(cumle.indexOf("a")); // 4 birden fazla varsa ilkini verir.
        System.out.println("cumle.indexOf(ny) = " + cumle.indexOf("ny")); //10
        System.out.println("cumle.indexOf(\" \") = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(\"A\") = " + cumle.indexOf("A")); // -1 yok demenin diğer adı
        System.out.println("cumle.indexOf(\"a\",5) = " + cumle.indexOf("a",5)); //6
        // a yı aramaya 5 (dahil) nolu index ten sonra başla.

    }
}
