package Gun06_String;

import java.util.Scanner;

public class _06_Soru {

    //Girilen bir ad soyadı "Ismet Temur" I.T. şeklinde yazdırınız.
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız Soyadınız: ");

        String isim= oku.nextLine();

        char isimB= isim.charAt(0);

        int boslukIndex=isim.indexOf(" ");

        char soyB=isim.charAt(boslukIndex+1);

        System.out.println("Baş Harfleri = " + isimB+"."+soyB+".");

        /* kendime deneme */
        byte klk= (byte) isim.indexOf(" ");
        System.out.println("klk = " + klk);




    }


}
