package Gun09_JavaIf;

import java.util.Scanner;

public class _09_odev {
    public static void main(String[] args) {
        /****    1    ****/
        //Girilen 1 sayının onlar basamağının tek olup olmadıüını yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz= ");
        int sayi1= oku.nextInt();
        int onlar=(sayi1/10)%10;  //  545/10=54   54%10=4  4%2==0

        if (onlar%2==0) { System.out.println("Onlar basamağı ÇIFT");}

        if (onlar%2!=0) { System.out.println("Onlar basamağı TEK");}

        /****    2    ****/
        //Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.
        Scanner oku2=new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        String sifre= oku2.nextLine();
        boolean esitMi=sifre.equals("Bayrak");
        System.out.println("Eşit mi? = " + esitMi);


        /****    3    ****/
        //Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.
        System.out.print("Bir kelime giriniz: ");
        String kelime=oku2.next();
        int basamak=kelime.length();
        if (kelime.charAt(0)==kelime.charAt(basamak-1)) {
            System.out.println("Harfler ESIT ");}
        if (kelime.charAt(0)!=kelime.charAt(basamak-1)) {
            System.out.println("Harfler ESIT DEGIL ");}

        /****    4    ****/
        //Girilen bir kelimede A harfinin olup olmadığını yazdırınız.
        System.out.print("Bir kelime giriniz: ");
        String kelime2=oku2.next();
        int index=kelime2.indexOf("A");
        if (index==-1){
            System.out.println("\"A\" YOK");}
        if (index>=0){
            System.out.println("\"A\" VAR");}

        /****    5    ****/
        //Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız.
        System.out.print("Ilk kelimeyi giriniz: ");
        String ilkK=oku2.next();
        System.out.print("Ikinci kelimeyi giriniz: ");
        String ikinciK=oku2.next();
        int ilkU=ilkK.length();
        int ikincU=ikinciK.length();
        if (ilkU==ikincU){
            System.out.println("Uzunlukları aynı");}
        if (ilkU!=ikincU){
            System.out.println("Uzunlukları aynı değil");}












    }
}
