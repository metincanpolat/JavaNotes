package Gun06_String;

public class _11_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty: bir string in boş olup olmadığını boolean olarak verir.

        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); //false

        String s2=" ";
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); //false

        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());

    }
}
