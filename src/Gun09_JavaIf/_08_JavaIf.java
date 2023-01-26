package Gun09_JavaIf;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        int sayi1= oku.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int sayi2= oku.nextInt();
        System.out.print("ucuncu sayıyı giriniz: ");
        int sayi3= oku.nextInt();
        int ilksonuc=0;
        int ikisonuc=0;



        if (sayi1>=sayi2)ilksonuc=sayi1;

        if (ilksonuc==0)ikisonuc=sayi2;

        if (ikisonuc>sayi3){
            System.out.println("Büyük Sayı = " + sayi2);}
        if (sayi3>=sayi2){
            System.out.println("Büyük Sayı = " + sayi3);}
        if (ilksonuc>sayi3){
            System.out.println("Büyük Sayı = " + sayi1);}
/*************************/
// Hoca yöntemi

        System.out.print("ilk sayıyı giriniz: ");
        int s1= oku.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int s2= oku.nextInt();
        System.out.print("ucuncu sayıyı giriniz: ");
        int s3= oku.nextInt();

        int enb=s1;

        if (s2>enb){enb=s2;}

        if (s3>enb);{enb=s3;}
        System.out.println("enb = " + enb);











    }
}
