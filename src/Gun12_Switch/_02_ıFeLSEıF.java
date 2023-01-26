package Gun12_Switch;

import java.util.Scanner;

public class _02_ıFeLSEıF {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz= ");
        int sayi1= oku.nextInt();
        System.out.println("ikinci sayıyı giriniz= ");
        int sayi2= oku.nextInt();

        System.out.println("Toplama T");
        System.out.println("Çıkarma Ç");
        System.out.println("Çarpma P");
        System.out.println("Bölme B");
        System.out.print("Seçiminiz");

        Scanner oku2=new Scanner(System.in);
        String islem=oku2.next();

        //ladder if, merdiven tipi if kullanımı

        if (islem.equalsIgnoreCase("T"))
            System.out.println("Topam="+ (sayi1+sayi2));
        else
            if (islem.equalsIgnoreCase("Ç"))
                System.out.println("Farkı="+ (sayi1-sayi2));
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println("Çarpımı="+ (sayi1*sayi2));
                else
                    if (islem.equalsIgnoreCase("B"))
                        System.out.println("Böümü="+(sayi1/sayi2));
                    else
                        System.out.println("Hatalı seçim");




    }
}
