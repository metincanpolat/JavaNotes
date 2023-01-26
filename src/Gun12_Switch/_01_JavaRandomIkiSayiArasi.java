package Gun12_Switch;

import java.util.Scanner;

public class _01_JavaRandomIkiSayiArasi {
    public static void main(String[] args) {
        //0-5 arası gibi ürettik, hep sıfırdan başladı
        // 4-9 arası üretsin nasıl derdim, nasıl yapardım
        // önce aralık kadar ürettirip, sonra ona min kısmı eklesem
        // 4-9 için : önce 0-5 üret : sonra çıkan sayıya 4 ekle.

        Scanner oku=new Scanner(System.in);

        System.out.println("min=");
        int min= oku.nextInt();

        System.out.println("max=");
        int max= oku.nextInt();

        for (int i = 0; i < 20; i++) {
            int belirliAraliktaUretilen= (int)(Math.random()*(max-min))+min;
            System.out.println("belirliAraliktaUretilen = " + belirliAraliktaUretilen);}




    }
}
