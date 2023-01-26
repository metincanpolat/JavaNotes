package Gun11_Ternary_Math;

import java.util.Scanner;

public class _07_JavaMathOrnek {
    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayı giriniz:");
        int sayi= oku.nextInt();

        System.out.print("İkinci sayı giriniz:");
        int sayi2= oku.nextInt();

        System.out.print("Ucuncu sayı giriniz:");
        int sayi3= oku.nextInt();

        // 1.yöntem
        int enb=Math.max(sayi,sayi2);
        enb=Math.max(enb,sayi3);
        System.out.println("enb = " + enb);

        //2. Yöntem
        int enb2=Math.max(sayi, Math.max(sayi2,sayi3));
        System.out.println("enb2 = " + enb2);

        //3 Yöntem
        System.out.println(Math.max(sayi,Math.max(sayi2,sayi3)));




    }
}
