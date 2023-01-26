package Gun06_String;

import java.util.Scanner;

public class _01_Ornek {

    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Cadde: ");
        String cadde=oku.nextLine();

        System.out.print("Sokak: ");
        String sokak= oku.nextLine();

        Scanner okuInt=new Scanner(System.in);
        System.out.print("Posta Kodu: ");
        int postaKodu= okuInt.nextInt();

        System.out.print("Ülke: ");
        String ulke=oku.nextLine();

        System.out.println("Adres : " + cadde+" "+sokak+" "+" "+postaKodu+" "+ulke);




    }
}
