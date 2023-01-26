package Gun10_IfElse;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize notu: ");
        int vize= oku.nextInt();
        System.out.print("Final notu: ");
        int sonN=oku.nextInt();

        double ortalama=0.4*vize+0.6*sonN;

        if (ortalama>=60){
            System.out.println("Geçtiniz, ort="+ortalama);}
        // int ort2=(int) (0.4*vize)+(int) (0.6*sonN); ondalıklı sayı istemiyorsak
        else System.out.println("Bütünlemeye kaldınız, ort= "+ortalama);



    }
}
