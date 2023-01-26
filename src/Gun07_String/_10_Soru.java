package Gun07_String;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz
        // ornegin 01.02.20 bu string de kaç tane nokta vardır?

        Scanner oku=new Scanner(System.in);

        System.out.print("Doğum Tarihinizi giriniz: ");

        String tarih=oku.nextLine();
        int ilkS=tarih.length();
        String tarih2=tarih.replace(".","");
        int sonS=tarih2.length();
        System.out.println("Toplam nokta sayısı= "+(ilkS-sonS));
        // noktaları sildirip sonnucu buldum.

    }
}
