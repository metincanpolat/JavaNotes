package Gun21_Return;

import java.util.Scanner;

public class _11_Soru7 {
    public static void main(String[] args) {

        //addDigits isminde bir method oluşturun.
        //Parametresi int
        //Return tipi de int
        //Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        //Tek basamaklı çıktığında, döndürün
        //**Örnek1:**
        //```
        //**Girdi** `38`
        //**Çıktı:** 2
        //**Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`.
        //             2 , tek basamaklı olduğundan, bunu döndürün.
        //```987935= 9+8+7+9+3+5 =41 4+ 1 = 5

        Scanner okuInt=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=okuInt.nextInt();
        System.out.println(addDigits(sayi));


    }
    public static int addDigits(int sayi){
        String[] diziStr=(Integer.toString(sayi)).split("");
        int sonuc=0;
        for (int i = 0; i < diziStr.length; i++) {
            sonuc += Integer.parseInt(diziStr[i]);
        }
        return sonuc<10?sonuc:addDigits(sonuc);
    }


}
