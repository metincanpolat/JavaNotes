package Gun09_JavaIf;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının birler ve onlar
        // basamağının eşit olup olmadığını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("sayıyı giriniz: ");
        int sayi= oku.nextInt();

        // Yöntem: istediğin rakam sonda kalacak şekilde sayıyı böl.
        // sonra %10 yaparak son rakamı al.

        int birler=sayi%10;
        int onlar=(sayi/10)%10; // 456 -> 456/10 -> 45 -> %10 -> 5
        if (birler==onlar){
            System.out.println("eşit");}
        if (birler!=onlar){
            System.out.println("eşit değil");}



    }
}
