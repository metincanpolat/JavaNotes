package Gun05_Scanner;

import java.util.Scanner;

public class _09_Odev {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        /**** 1 *****/
        System.out.print("İsminiz:");
        String isim= oku.next();

        /**** 2 ****/

        System.out.print("Yaşınız: ");
        int yas= oku.nextInt();

        /**** 3 ****/

        System.out.print("En Sevdiğin Meyve: ");
        String meyve=oku.next();

        /**** 4 ****/
        System.out.print("Arabandaki Kapı Sayısı: ");
        int kapi= oku.nextInt();

        /**** 5 ****/
        System.out.print("10 Sene Önce Yaşadığınız Şehir: ");
        String sehir= oku.next();

        /**** 6 ****/
        Scanner okuStr=new Scanner(System.in);

        System.out.print("Doğum Gününüz (Gün - Ay): ");
        String dGunu= okuStr.nextLine();

        /**** 7 ****/
        Scanner okuBool=new Scanner(System.in);

        System.out.print("Bir Banka Hesabınız Var mı?: ");
        boolean hesap=okuBool.nextBoolean();

        /**** 8 ****/

        System.out.print("Ağırlığınız: ");
        byte agirlik=oku.nextByte();

        /**** 9 ****/

        System.out.print("Boyunuz: ");
        float boy=oku.nextFloat();





        System.out.println("İsim :" + isim);
        System.out.println("Sayı :" + yas);
        System.out.println("En Sevdği Meyve: " + meyve);
        System.out.println("Arabanızdaki Kapı Sayısı: " + kapi);
        System.out.println("10 Sene Önce Yaşadığı Şehir: " + sehir);
        System.out.println("Doğum Günü: " + dGunu);
        System.out.println("Banka Hesabı Var/Yok: " + hesap);
        System.out.println("Ağırlık = " + agirlik+"kg");
        System.out.println("Boyu = " + boy+"cm");




    }
}
