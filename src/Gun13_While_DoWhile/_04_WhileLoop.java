package Gun13_While_DoWhile;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girilen 20 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz

        Scanner oku=new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        while (sayac<5){
            System.out.println((sayac+1)+".Sayı");
            int sayi=oku.nextInt();

            if (sayi>0)
                toplam=toplam+sayi;

            sayac++;
        }

        System.out.println("Toplam = "+ toplam);

    }
}
