package Gun14_forLoop;

import java.util.Scanner;

public class _04_forLoopOrn {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // 2.: carpımın degeri 100 ü geçtiğinde işlem sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= oku.nextInt();
        int toplam=1;

        for (int i=1 ; i<=sayi ; i++){
            toplam=toplam*i;

            if (toplam>100){
                System.out.println("break çalıştı");
                break;}}
            System.out.println("toplam = " + toplam);




    }
}
