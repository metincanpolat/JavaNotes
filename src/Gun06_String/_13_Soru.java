package Gun06_String;

import java.util.Scanner;

public class _13_Soru {
    public static void main(String[] args) {
        // Girilen bir string de boşluk olup olmadığını bulunuz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir String Giriniz: ");

        String kelime= oku.nextLine();

        boolean varMi=kelime.contains(" ");
        System.out.println("varMi = " + varMi);

    }
}
