package Gun10_IfElse;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Öğr notu = ");
        int not=oku.nextInt();

        //     1.Yöntem (önceki)
        //    if (not>=50){  // hangi not girilirse girilsin kontrol edilir
        //        System.out.println("tebrikler geçtiniz");
        //     }
        //
        //       if (not < 50){ // hangi not girilirse girilsin kontrol edilir
        //           System.out.println("tebrikler yaz kazandınız");
        //       }
        //
        //     2.Yöntem olması gereken
        //     Yukarıdaki iflerde herzaman kontrol edilme durumu vardır.
        //     halbuki aşağıdaki IF-ELSE yapısında IF şartı çalıştığında ELSE
        //     kontrol edilmesine gerek kalmaz.

        if (not>=50) { // her zaman tek bir kontrol yapar : baklava dilimi
            System.out.println("tebrikler geçtiniz");} //evet
        else {
            System.out.println("tebrikler yaz okulu kazandınız");}



        /****    7    ****/
        //Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        //Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        //Eğer ortalama not >=90 =>not=A
        //Eğer ortalama not >= 70 ve<90 => not=B
        //Eğer ortalama not >=50 ve <70 =>not=C
        //Eğer ortalama not <50 =>note=F
        //Aşağıdaki örnek çıktıya bakın:
        //int Quiz_score: 80
        //int mid_term_score: 68
        //int Final_score: 90
        //print (Your grade is B)
        //          (Notunuz B'dir)

        System.out.println("Quiz Score: ");
        int sayi51=oku.nextInt();
        System.out.println("Middle Term Score: ");
        int sayi52=oku.nextInt();
        System.out.println("Final Score");
        int sayi53=oku.nextInt();
        int average=(sayi51+sayi52+sayi53)/3;

    /*    if (average>=90) {
            System.out.println("Your grade is A");
            if (average<90 && average>=70) {
                System.out.println("Your grade is B");*/









            }
}
