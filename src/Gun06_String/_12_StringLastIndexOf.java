package Gun06_String;

public class _12_StringLastIndexOf {
    public static void main(String[] args) {
        // indeOf gibi çalışır bu aramaya baştan başlar.
        // lastIndexOf ise aramaya sondan başlar.
        //         0123456
        String s1="Merhaba";

        System.out.println("Bastan sona dogru a yı arar = " + s1.indexOf("a")); //4
        System.out.println("Sondan basa dogru a yı arar = " + s1.lastIndexOf("a")); //6

        // index her zaman tek sadece sondan başlar


    }
}
