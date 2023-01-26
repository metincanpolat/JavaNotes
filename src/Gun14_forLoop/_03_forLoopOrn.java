package Gun14_forLoop;

import java.util.Scanner;

public class _03_forLoopOrn {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi= oku.nextInt();
        int toplam=0;


        for (int i=0; i<sayi;i++)
            toplam=toplam+i;
        System.out.println("toplam = " + toplam);



    }
}
