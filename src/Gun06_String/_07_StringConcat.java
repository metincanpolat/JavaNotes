package Gun06_String;

public class _07_StringConcat {
    public static void main(String[] args) {
        //concat: bir string diğerine birleştiriyor.
        String s1="Merhaba";
        String s2="Dunya";

        System.out.println("birleşik hali = " + s1+s2); //birleşmiş hali
        System.out.println("birleşik hali ="+s1.concat(s2)); //birleşmiş hali
        System.out.println("birleşik hali =" + s1.concat(" ").concat(s2));
        System.out.println("birleşik hali  = " + s1.concat(" "+s2));

        String sonHali=s1.concat(" "+s2);
        System.out.println("sonHali = " + sonHali);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

}
