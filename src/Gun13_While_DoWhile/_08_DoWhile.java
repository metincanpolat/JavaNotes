package Gun13_While_DoWhile;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner oku=new Scanner(System.in);
        int deger=0;
        do {
            System.out.println("veri giriniz:");
            String veri= oku.nextLine();
            if (!veri.equalsIgnoreCase("x"))
                System.out.println("Program çalışıyor");
            else deger=1;

        } while (deger!=1);
        System.out.println("program bitti");

        /*******************************/

        String okunan2="";

        do {
            System.out.println("ifade giriniz: ");
            okunan2=oku.nextLine();
            if (!okunan2.equalsIgnoreCase("x"))
                System.out.println("Program çalışıyor");
        } while (!okunan2.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}
