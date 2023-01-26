package Gun14_forLoop;

import java.util.Scanner;

public class _11_deneme {
    public static void main(String[] args) {

        //  Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
        //sayı olup olmadığını bulunuz,,

        // Sayının simetrik olduğunu nasıl anlarsın?
        // sayının tersi kendisiyle aynı ise, 121 -> 121
        // sayının sondaki basamağını alacasın, ve onu yeni basamak geldikçe 10 ile çarpıp
        // yeni basamakla çarpacaksın.
        // 12521 -> 1 -> 1*10+2  -> 121*10+5 -> 125*10+2 -> 1252*10+1  -> 12521

        Scanner oku=new Scanner(System.in);

        System.out.println("sayı giriniz: ");
        int sayi1=oku.nextInt();
        int terSa=1, basamak=0, sayi2=sayi1, yeniint=0;

        for (basamak=0; sayi2>0 ; basamak++ ){
            sayi2=sayi2/10;}
        int sayac=basamak;
        for (int i=1 ; terSa>=0 && i<Math.pow(10,basamak) ; i*=10){
           // if (i==Math.pow(10,basamak))break; veya bu eklenebilir.
            terSa=(sayi1/i)%10;
            yeniint+=(terSa*(Math.pow(10,sayac-1)));
            sayac--;}
        System.out.println("\n"+"Sayının tersi int cinsinden = " + yeniint);

        if (yeniint==sayi1)
            System.out.println("Sayı Simetrik");
        else System.out.println("Sayı Simetrik Değil.");


    }
}
