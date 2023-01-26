package Gun09_JavaIf;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("sayıyı giriniz: ");
        int sayi= oku.nextInt();

        // sayının 1 3 5 7 9 bunları 2 ye böldüğümüzde kalan 1 ise tektr.
        int kalan=sayi%2; // mod% bize bölümünden kalanı verir

        if (kalan!=0){ //negatif sayı olursa diye bunu yaptık.
            System.out.println("tek");}
        if (kalan==0){
            System.out.println("çift");}
        // sayıyı önce pozitife çevirip sonra klasik şartları ekleyebilirdik
        // Ismet hoca cozümü. sayi<0 sa sayi*-1  bu şekilde sayı ozitife döner.
    }
}
