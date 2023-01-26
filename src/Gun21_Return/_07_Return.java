package Gun21_Return;

import java.util.Scanner;

public class _07_Return {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının toplamını
        // bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi giriniz");
        int sayi1= oku.nextInt();
        System.out.println("Sayi giriniz");
        int sayi2= oku.nextInt();

        int toplam=toplamBul(sayi1,sayi2);

        System.out.println("toplam = " + toplam);

    }
    public static int toplamBul(int s1,int s2)
    {
        return s1+s2; // Bu şekilde kısa da yazabiliyoruz.
    }

}
