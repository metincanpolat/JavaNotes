package Gun20_Method;

import java.util.Arrays;
import java.util.Scanner;

public class _07_deneme {
    public static void main(String[] args) {

        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int arananSayi = oku.nextInt();


        int sayc = 0;


        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == arananSayi) {
                System.out.println("var");
                break;}
            else {sayc++;}

        }
        if (sayc == dizi.length)
        {System.out.println("yok");}

    }
}
