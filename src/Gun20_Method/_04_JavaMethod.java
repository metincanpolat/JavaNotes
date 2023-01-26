package Gun20_Method;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        tekMiCftMi(55);
        tekMiCftMi(30);

        // kullanıcıdan bir sayı alarak tek mi çift mi yazdırırız.
        tekMiCiftMi();
        tekMiCiftMi();
        tekMiCiftMi();




    }
    public static void tekMiCiftMi()
    {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();
        //tekMiCiftMi(sayi);  If Else yerine buraya bu şeklde yazarak diğer fonksiyondan da yararlanabilirdik
        if (sayi%2==0)
            System.out.println("cift");
        else System.out.println("tek");
    }
    public static void tekMiCftMi(int sayi)
    {
        if (sayi %2==0)
            System.out.println("Çift");
        else System.out.println("Tek");



    }

}
