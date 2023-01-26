package Gun21_Return;

import java.util.Scanner;

public class _05_Return {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının büyük olanını bulma işlemini
        //bir metodda yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("sayı giriniz");
        int sayi1= oku.nextInt();
        System.out.println("sayı giriniz");
        int sayi2= oku.nextInt();


        int buyukS= enbBul(sayi1,sayi2);
        System.out.println("buyukS = " + buyukS);


    }
    public static int enbBul (int sayi1, int sayi2)
    {

        int donecek=0;

        donecek=sayi1>sayi2 ? sayi1 : sayi2;

        return donecek;

        /* 2 Yöntem*/

    //    if (sayi1>sayi2)
      //      return sayi1;
     //   else return sayi2;



    }

}
