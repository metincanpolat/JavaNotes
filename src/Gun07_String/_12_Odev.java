package Gun07_String;

import java.util.Scanner;

public class _12_Odev {
    public static void main(String[] args) {

       /****    1    ****/
        String text1="paper";

        System.out.println("paper buyuk hali = " + text1.toUpperCase());

        /****    2    ****/
        String text2="OraNge";

        System.out.println("OraNge küçük hali = " + text2.toLowerCase());

        /****    3    ****/
        String text3="New Jersey";

        System.out.println("New Jersey Büyük hali = " + text3.toUpperCase());

        /****    4    ****/
        String text4="New York";

        System.out.println("New York küçük hali = " + text4.toLowerCase());

        /****    5    ****/
        String text5="PADDLE";

        System.out.println("PADDLE küçük hali = " + text5.toLowerCase());

        /****    6    ****/
        String text6="apple";
        System.out.println("apple içinde app var mı? = " + text6.contains("app"));

        /****    özel soru 1    ****/
        Scanner oku=new Scanner(System.in);

        System.out.println("Bir Cümle Yazınız: ");

        String cumle=oku.nextLine();
        int ilkS=cumle.length();
        String bosluksuz=cumle.replace(" ","");
        int sonS=bosluksuz.length();
        System.out.println("Kelime Sayısı= "+ ((ilkS-sonS)+1));

        /****    özel soru 2    ****/


        System.out.print("Adınız ve Soyadınız: ");
        String adiSoyadi=oku.nextLine();
        System.out.println("adiSoyadi = " + adiSoyadi);

        System.out.println("adiSoyadi.charAt(0) = " + adiSoyadi.charAt(0)+" "+adiSoyadi.charAt(adiSoyadi.indexOf(" ")+1)+" "+
                adiSoyadi.charAt(adiSoyadi.lastIndexOf(" ")+1));














    }
}
