package Gun08_Operators;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // girilen bir cümledeki ilk kelimeyi yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("cumle yazınız: ");

        String cumle=oku.nextLine();

        int bosluk=cumle.indexOf(" ");
        System.out.println("ilk kelime = " + cumle.substring(0,bosluk));




    }
}
