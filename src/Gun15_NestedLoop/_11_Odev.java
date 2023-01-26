package Gun15_NestedLoop;

import java.util.Scanner;

public class _11_Odev {
    public static void main(String[] args) {
        /****    1    ****/
        //  Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
        //sayı olup olmadığını bulunuz
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

        /****    2    ****/
        // Aşağıdaki do-while döngüsüne denk  while döngüsü hangisidir?
        // do {
        //  x = x + y;
        //} while (x < z);

        int x=1 , z=10 ,y=3;

        while (x>=0 || x<=0){
            x = x + y;
            if (x>=z){
                System.out.println("x = " + x) ; break;
            }}
        /****    3    ****/
        // Aşağıdaki for döngüsüne denk while döngüsü hangisidir?  (başlangıçta toplam=0 varsayın)
        //for (i = 1; i <= 100; i = i + 1)
        //    toplam = toplam + i;

        int toplam=0;
        int sayac11=0;

        while (sayac11<=100){
            toplam=toplam+sayac11;
            sayac11++;
        }
        System.out.println("toplam = " + toplam+"\n");

        /****    4    ****/
        //Aşağıdaki çıktıyı veren programı yazınız
        //     *****
        //      ****
        //       ***
        //        **
        //         *


        for ( int i=0; i<5; i++ ) {
            for ( int j = 0; j < i; j++)
                System.out.print(" ");
            for (int r=5 ; r>i ; r--)  //54321
                System.out.print("*");

            System.out.println(); // satır işi bitince satır atla
        }
        /****    5    ****/
        //Aşağıdaki çıktıyı veren programı yazınız
        //     **********    0   10   0
        //      ********     1    8   1
        //       ******      2    6   2
        //        ****       3    4   3
        //         **        4    2   4

        for ( int i=0; i<5; i++ ) {
            for ( int p = 0; p < i; p++)
                System.out.print(" ");
            for ( int j = 10; j > i*2 ;j--)
                System.out.print("*");

            for (int k=0 ; k<i ; k++)
                System.out.print(" ");


            System.out.println(); // satır işi bitince satır atla
        }

    }
}
