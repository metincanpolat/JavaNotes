package Gun13_While_DoWhile;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Girilen 20 sayının toplamının sonucunu yazdırınız.

        Scanner oku=new Scanner(System.in);

        int sayac=0;
        int toplam=0;


        while (sayac<3){
            System.out.println("sayı giriniz= ");
            int sayi=oku.nextInt();
            toplam=toplam+sayi;

            sayac++;

        }

        System.out.println("toplam = " + toplam);



    }
}
