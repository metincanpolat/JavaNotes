package Gun45._02_ExeptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");


        for (int i = 0; i < 3; i++) {
            Scanner oku=new Scanner(System.in);

            try {
                System.out.println("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.println("Sayi2=");
                int sayi2 = oku.nextInt();



                System.out.println("bölümü = "+(sayi1/sayi2));
            }
            catch (InputMismatchException ex) // bu tipten hata olursa
            {
                System.out.println("Sayı harici karakter girmeyiniz.");
                i--;
            }
            catch (ArithmeticException ex) // bu tipten hata olursa
            {
                System.out.println("Sıfıra bölme hatası");
                i--;
            }
            catch (Exception ex) // yukarıda belirtilenler haricinde genel hata durumu
            {
                System.out.println("Lütfen tekrar deneyiniz.");
                i--;
            }

        }


        System.out.println("program bitti");


    }
}
