package Gun08_Operators;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen 3 basamaklı bir sayının basamaklarını bulunuz.
        Scanner oku=new Scanner(System.in);

        System.out.print("sayı giriniz: ");
        int sayi= oku.nextInt();

        int birler=sayi%10;
        int onlar=(sayi%100)/10;
        int yuzler=sayi/100;

        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);



    }
}
