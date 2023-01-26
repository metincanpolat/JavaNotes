package Gun08_Operators;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");

        int sayi= oku.nextInt();

        System.out.println("(sayi%2 = " + ((sayi%2)==1));



    }
}
