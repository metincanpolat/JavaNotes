package Gun14_forLoop;

import java.util.Scanner;

public class _09_Odev {
    public static void main(String[] args) {
        /****    1    ****/
       // 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
       // _Not: 0 ve 100 dahildir._

        for (int i=2; i<=100 ; i=i+2)
            System.out.println(i);

        /****    2    ****/
       /* 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
`Sonuç bu şekilde olmalıdır.`
        ```
        0
        20
        40
        60
        80
        100
        ```*/
        System.out.println("\n"+"Hem 4'e hem de 5'e tam bölünen sayılar:"+"\n"+"'''");
        for (int i=1; i<=100 ; i++){
            if ((i%4==0) && (i%5==0) )
                System.out.println(i);}
        System.out.println("'''");

        /****    3    ****/
        //Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i=0 ; i<10 ; i++){
            System.out.println("sayı giriniz: ");
            int sayi= oku.nextInt();
            if (sayi%2==0)
                System.out.println("Toplam= "+(toplam=toplam+sayi));
            else break;
        }System.out.println("Tek sayı girdiniz program sonlandı."+"\n"+"Toplam= "+toplam);

        /****    4    ****/
        //Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz.

        System.out.println("sayı giriniz: ");
        int sayi11=oku.nextInt();
        int i=0;

        for (i=0; sayi11>0 ; i++ ){
            sayi11=sayi11/10;}
        System.out.println("Girilen sayı " + i+" basamaklıdır.");
        // sayıyı string olarak alıp veya çevirip de StringLength ile de saydırabilirdik.

        /****    5    ****/
        //Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz
        System.out.println("sayı giriniz: ");
        int sayi21=oku.nextInt();
        int sonB=sayi21%10;

        while (sayi21>9){
            sayi21=sayi21/10;
        }
        if (sayi21==sonB)
            System.out.println("İlk ve son basamaklar esit");
        else System.out.println("İlk ve son basamaklar farklı");

        /****    6    ****/
        //Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz

        System.out.println("\n"+"Sayıyı Ters Çevirme Programına Hoşgeldiniz");

        System.out.println("sayı giriniz: ");
        int sayi31=oku.nextInt();
        int terSa=1, basamak1=0, sayi32=sayi31, yeniint=0;
        System.out.println("Girilen sayının ters hali= ");
        for (basamak1=0; sayi32>0 ; basamak1++ ){
            sayi32=sayi32/10;}
        int sayac=basamak1;
        for (int i41=1 ; terSa>=0 ; i41*=10){
            if (i41==Math.pow(10,basamak1))break;
            System.out.print((terSa=(sayi31/i41)%10));
            yeniint+=(terSa*(Math.pow(10,sayac-1)));
        sayac--;}
        System.out.println("\n"+"Sayının tersi int cinsinden :) = " + yeniint);
        /*ALTERNATİF ÇÖZÜM*/
       /* String strS=Integer.toString(sayi31);
        int basamak=strS.length();
        String tersS="";

        for (int i31=basamak-1 ; i31>=0 ; i31--){
            tersS=tersS+strS.charAt(i31);}
        System.out.println("Girilen sayının ters hali= " + tersS);
        int intTersS=Integer.parseInt(tersS);*/

        /****    7    ****/
        //Kullanıcından 10 sayı isteyiniz, ve ekrana yazdırınız,
        // eğer sonra girilen sayı önce girilenden büyük ise dikkate almasın(pass geçsin).
        System.out.println("Sayı giriniz: ");
        int sayi61=oku.nextInt();
        System.out.println("SAYI = " + sayi61);
        for (int i61=1; i61<10 ; i61++) {
            System.out.println("Sayı giriniz: ");
            int sayi62 = oku.nextInt();
            if (sayi62 < sayi61) continue;
            System.out.println("BUYUK SAYI = " + sayi62);
            sayi61=sayi62;
        }
        System.out.println("10 tane giriş hakkınız bitti!");




        }



    }

