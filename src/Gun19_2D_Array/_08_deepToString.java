package Gun19_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _08_deepToString {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(i + "," + j + "sayı giriniz: ");
                tablo[i][j] = oku.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(tablo));

    }
}
