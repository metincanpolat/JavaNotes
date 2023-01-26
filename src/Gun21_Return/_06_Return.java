package Gun21_Return;

import java.util.Scanner;

public class _06_Return {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.println("sayi giriniz");
        int sayi= oku.nextInt();
        int faktoryel=faktoryelBul(sayi);
        System.out.println("faktoryel = " + faktoryel);

        if (faktoryel%2==0)
            System.out.println("Çift");
        else System.out.println("Tek");





    }
    public static int faktoryelBul(int sayi)
    {
        int faktoryel=1;
        for (int i = 1; i <=sayi ; i++)
            faktoryel=faktoryel*i;
            return faktoryel;


    }
}
