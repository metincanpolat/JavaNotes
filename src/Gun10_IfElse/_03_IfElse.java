package Gun10_IfElse;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi= oku.nextInt();

        if (sayi%2==0){
            System.out.println("Sayı CIFT SAYI");}
        else System.out.println("Sayı TEK SAYI");




    }
}
