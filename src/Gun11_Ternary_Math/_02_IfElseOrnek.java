package Gun11_Ternary_Math;

import java.util.Scanner;

public class _02_IfElseOrnek {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Otoparkta kalıs süreniz:");
        int sure= oku.nextInt();

        if (sure<=3){
            System.out.println("Ucret 10TL");}
        else {
            if (sure>3 && sure<=5){  // sure<=5 deyip te bırakabilirdik. Zaten 3 ten küçük değilse buraya gelmişti
                System.out.println("Ucret 15TL");}
            else System.out.println("Ucret 20 ₺"); // TL işareti ₺ için AltGr+t
        }
    }
}
