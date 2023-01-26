package Gun21_Return;

import java.util.Scanner;

public class _11_Soru12 {
    public static void main(String[] args) {
        //2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi
        // ve rakam olan değerlerle doldurunuz.
        //sonrasında bir fonksiyonda  bütün RAKAMLARI toplayıp toplam para değerini bulunuz,
        // toplam parayı main de yazdırınız.


        int toplamPara = toplamBul(array());
        System.out.println("Toplam Para= "+toplamPara);



    }
    public static int toplamBul(String[][] array){
        int toplam = 0;
        String simgeliFiyat;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                simgeliFiyat = array[i][j].substring(1);
                toplam += Integer.parseInt(simgeliFiyat);
            }
        } return toplam;
    }
    public static String[][] array() {
        Scanner input = new Scanner(System.in);
        String[][] array = new String[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print("başına simgesini($,€,..) ekleyerek fiyat giriniz: ");
                array[i][j] = input.nextLine();
            }
        }
        return array;
    }
}
