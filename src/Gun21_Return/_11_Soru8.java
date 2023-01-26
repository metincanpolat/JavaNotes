package Gun21_Return;

import java.util.Scanner;

public class _11_Soru8 {
    public static void main(String[] args) {
        //powerOfThree isminde bir method oluşturun.
        //Parametre olarak int
        //Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true
        //**Örnek 2:**
        //**Girdi:** 0
        //**Çıktı:** false
        //**Örnek 3:**
        //**Girdi:** 9
        //**Çıktı:** true

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı 3 ve kuvvet mi?\nSayı giriniz: ");
        int sayi= oku.nextInt();
        System.out.println(powerOfThree(sayi));


    }
    public static boolean powerOfThree(int sayi)
    {
        if (sayi%3==0) {
            while (sayi % 3 == 0) {
                sayi /= 3;
            }
            return (sayi==1)?true:false;
        }
        else return false;

    }

}
