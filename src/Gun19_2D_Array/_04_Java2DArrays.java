package Gun19_2D_Array;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak dodurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz

        Scanner oku=new Scanner(System.in);

        int[][] tablo=new int[2][3];
        int enb=0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("sayı giriniz: ");
                tablo[i][j]= oku.nextInt();
            }
             }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (enb<tablo[i][j])
                    enb=tablo[i][j];

        }}
        System.out.println("enb = " + enb);


    }


}
