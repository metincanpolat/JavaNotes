package Gun07_String;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadın (tam ad) adını ve soyadını ayırıp, ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız: ");

        String adSoyad=oku.nextLine();

        int bosluk=adSoyad.indexOf(" ");

        String ad=adSoyad.substring(0,bosluk);
        System.out.println("ad = " + ad);

        String soyA=adSoyad.substring(bosluk+1);
        System.out.println("soyA = " + soyA);

        // boslugun indexini bulup ona göre ayırdık.

    }
}
