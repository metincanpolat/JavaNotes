package Gun12_Switch;

import java.util.Scanner;

public class _06_SwitchOrnek {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayıyı giriniz= ");
        int sayi1= oku.nextInt();
        int onlar=(sayi1/10)%10;

        switch (onlar){
            case 1:
                System.out.println("Onlar basamağı : Bir");break;
            case 2:
                System.out.println("Onlar basamağı : İki");break;
            case 3:
                System.out.println("Onlar basamağı : Üç");break;
            case 4:
                System.out.println("Onlar basamağı : Dört");break;
            case 5:
                System.out.println("Onlar basamağı : Beş");break;
            case 6:
                System.out.println("Onlar basamağı : Altı");break;
            case 7:
                System.out.println("Onlar basamağı : Yedi");break;
            case 8:
                System.out.println("Onlar basamağı : Sekiz");break;
            case 9:
                System.out.println("Onlar basamağı : Dokuz");break;
            case 0:
                System.out.println("Onlar basamağı : Sıfır");break;
            default:
                System.out.println("Hatalı giriş");break;

        }


    }
}
