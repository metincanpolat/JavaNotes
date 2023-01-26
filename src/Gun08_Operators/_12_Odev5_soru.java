package Gun08_Operators;

import java.util.Scanner;

public class _12_Odev5_soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        /****    5    ****/
        //Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567

        System.out.println("Kredi Kartı Numaranızı giriniz.: ");
        String kartnumara= oku.nextLine();
        int sonBoslu=kartnumara.lastIndexOf(" ");
        String yildizli=kartnumara.substring(0,sonBoslu);
        String yildizsiz=kartnumara.substring(sonBoslu);
        System.out.println("Kart Numarası:"+yildizli.replaceAll("[0-9]","*")+" "+yildizsiz);

        /****    6    ****/
        //Girilen bir cümledeki son kelimeyi bulunuz

        System.out.println("Bir cümle giriniz: ");

        String cumle= oku.nextLine();
        int sonB=cumle.lastIndexOf(" ");
        System.out.println("Son Kelime = " + cumle.substring(sonB+1));

    }
}
