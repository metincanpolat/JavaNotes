package Gun45._02_ExeptionHandling;

import java.util.Scanner;

public class _02_JavaRuntimeExeption {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");


        for (int i = 0; i < 3; i++) {
            Scanner oku=new Scanner(System.in); // Scanner dışarıda olunca sonsuz döngüye giriyor. Tam anlamadım ama bu şekilde her döngüde Scanner tekrar oluştuğu için sorun olmuyor.

            try { // hata bölgesini try{} ine aldık
                System.out.println("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.println("Sayi2=");
                int sayi2 = oku.nextInt();



                System.out.println("bölümü = "+(sayi1/sayi2));
                }
            catch (Exception hata) // hata mesajlarını hata(orjinalde "ex" kullanılır) isimli Exception cinsinden değişkene attım
            {
                System.out.println("hata.getMessage() = " + hata.getMessage());
                i--; // hata olduğu zaman sayacın artmamasını sağlıyor. sadece hata olunca buraya uğruyor çünkü.
            }

        }


        System.out.println("program bitti");

    }
}
