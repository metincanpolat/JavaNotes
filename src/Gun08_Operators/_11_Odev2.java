package Gun08_Operators;

import java.util.Scanner;

public class _11_Odev2 {
    public static void main(String[] args) {
        /****    1    ****/
        //Girilen bir cümlenin ilk ve son harfini bulunuz
        Scanner oku=new Scanner(System.in);

        System.out.print("Bir Cümle Giriniz: ");
        String cumle= oku.nextLine();
        int uzunluk=cumle.length();
        char ilkH=cumle.charAt(0);
        System.out.println("ilk Harf = " + ilkH);
        char sonH=cumle.charAt(uzunluk-1);
        System.out.println("son Harf = " + sonH);

        /****    2    ****/
        //Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız

        System.out.println("3 kelimelik bir cümle giriniz");

        String cumle2= oku.nextLine();
        int uzunluk2=cumle2.length();
        int ilkBosluk=cumle2.indexOf(" ");
        int sonBosluk=cumle2.lastIndexOf(" ");
        String ilkK=cumle2.substring(0,ilkBosluk);
        String ikinciK=cumle2.substring(ilkBosluk+1,sonBosluk);
        String sonK=cumle2.substring(sonBosluk+1,uzunluk2);

        System.out.println("ilk Kelime = " + ilkK);
        System.out.println("ikinci Kelime = " + ikinciK);
        System.out.println("üçüncü Kelime = " +sonK);

        /****    3    ****/
        //Girilen 3 kelimelik bir cümlenin kelimelrinin ilk karakterlerini bulunuz.

        System.out.println("3 kelimelik bir cümle giriniz");

        String cumle3=oku.nextLine();
        int ilkB=cumle3.indexOf(" ");
        char ikiHar=cumle3.charAt(ilkB+1);
        int sonBo=cumle3.lastIndexOf(" ");
        char sonHa=cumle3.charAt(sonBo+1);
        System.out.println(" = " + cumle3.charAt(0)+" "+ikiHar+" "+sonHa);
        /****    4    ****/
        //Girilen bir kelimenin içerisinde B harifnin geçip geçnmediğini bulunuz.

        System.out.println(" Bir kelime giriniz: ");
        String kelime= oku.next();
        System.out.println("B harfi içeriyor mu?: "+ kelime.contains("B"));



    }
}
