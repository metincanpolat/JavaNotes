package Gun19_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra ö sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.
        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(i + "," + j + "sayı giriniz: ");
                tablo[i][j] = oku.nextInt();
            }
        }
        System.out.println("\n"+"2 Boyutlu Dizi:");
        int tekSayilar = 0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");
                if (tablo[i][j] % 2 == 1) {
                    tekSayilar++;
                }
            }
            System.out.println();

        }
        int[] tekDizi = new int[tekSayilar];
        int m = 0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j] % 2 == 1) {
                    tekDizi[m] = tablo[i][j];
                    m++;
                }
            }

        }
        System.out.println("\n"+"Tek Sayılar Dizisi: "+Arrays.toString(tekDizi));
    }
}