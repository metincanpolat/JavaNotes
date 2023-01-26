package Gun11_Ternary_Math;

import java.util.Scanner;

public class _09_JavaRandomOrnek {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        // kullanıcı bilirse tebrikle yazdırınız

        // hangi sayıya kadar sayı üretilecek. yani sınırı alıcam
        // bu sayıyı bulabilmek için tahmin sayısını alıcam

        Scanner oku=new Scanner(System.in);
        System.out.println("Üretilecek sayı sınırı= ");
        int sinir= oku.nextInt();

        int tutulanSayi= (int) (Math.random()*(sinir+1));
        // Math.Rand -> 0.0 - 0.999999
        // (5+1) ile çarparsan -> 0.0 - 5.999999
        // int ile casting yaptığında 0-5

        System.out.println("Tahmininiz");
        int tahmin= oku.nextInt();

    /*    if (tutulanSayi==tahmin){
            System.out.println("tebrikler bildiniz");}
        else {
            System.out.println("bilemediniz");}*/

        //YADA

            System.out.println((tutulanSayi==tahmin) ? "tebrikler bildiniz" : "Bilemediniz");
            System.out.println("tutulanSayi = " + tutulanSayi);


       /* double randomDouble=Math.random();                   KENDİ YAPTIĞIM
        int randomint=(int) randomDouble*11;

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayi tahmin ediniz: ");
        int girilenSayi=oku.nextInt();

        if (girilenSayi==randomint){
            System.out.println("tebrikler");}
        else System.out.println("bilemediniz");*/

}}
