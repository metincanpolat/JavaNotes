package Gun06_String;

public class _09_StringEquals {
    public static void main(String[] args) {
        // equals: 2 stringin birbirine eşit olup olmadığını kontrol eder.
        // sonuç boolean

        String s1="Merhaba";
        String s2="MERHABA";

        Boolean esitMi=s1.equals(s2);

        System.out.println("esitMi = " + esitMi);

        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba"));

    }
}
