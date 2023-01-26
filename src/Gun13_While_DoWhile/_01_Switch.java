package Gun13_While_DoWhile;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // 1- Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.println("Ay numarası giriniz: ");
        int sayi= oku.nextInt();

        switch (sayi){
            case 1:
            case 5:
            case 3:
            case 6:                 // Bu şekilde aynı istekleri beraber yazabiliyoruz.
            case 10:
            case 7:
            case 8:
            case 12:
                System.out.println("31 Gün");break;
            case 9:
            case 4:
            case 11:
                System.out.println("30 Gün");break;

            case 2:
                System.out.println("28-29 Gün");break;
                default:
                System.out.println("Hatalı bilgi girişi");break;}
    }
}
