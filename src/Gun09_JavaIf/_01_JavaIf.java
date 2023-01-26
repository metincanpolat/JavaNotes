package Gun09_JavaIf;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // Baklava dilimi= if
        //Girilen bir sayı 10 dan büyük ise ekrana 10 büyük yazdırnız.
        /*1- Başla - > main {
        2- sayı oku -> Scanner işlemleri
        3- sayi > 10 ise "10 dan büyük yaz -> if (sayi>10) sout...
        4-Dur    -> }         */

        Scanner oku=new Scanner((System.in));

        System.out.println("Sayi = ");
        int sayi= oku.nextInt();

        if (sayi>10);
        { // şart doğru ise bu parantezlerin arası çalışacak.
            System.out.println("10 dan büyük");
        }

    }
}
