package Gun17_Split;

import java.util.Arrays;
import java.util.Scanner;

public class _08_12_soruOdev {
    public static void main(String[] args) {

        /****    SORU: 12    ****/

        // Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        ///Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.


        String[] kelimeler=new String[5];
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println((i+1)+".kelime girin: ");
            kelimeler[i]= oku.nextLine();
        }
        String enUzunK="";
        int basamak=0;
        for (int i = 0; i < kelimeler.length ; i++) {
            if (basamak<kelimeler[i].length()) {
                basamak = kelimeler[i].length();
                enUzunK=kelimeler[i];}

        }

        System.out.println(Arrays.toString(kelimeler));
        System.out.println("enUzunK = " + enUzunK);
        System.out.println("basamak = " + basamak);

        String ilkH=enUzunK.substring(0,1);
        String sonH=enUzunK.substring(basamak-1);

       /* char ilkH=enUzunK.charAt(0);
        char sonH=enUzunK.charAt(basamak-1);*/

       /* System.out.println("sonH = " + sonH);
        System.out.println("ilkH = " + ilkH);
        String kesilmisK=enUzunK.replace(enUzunK.charAt(basamak-1),ilkH);
        String sonhali=kesilmisK.replaceFirst(kesilmisK.charAt(0),sonH);

        System.out.println("kesilmisK = " + kesilmisK);
        System.out.println("sonhali = " + sonhali);*/

        String kesilmisK=enUzunK.substring(1,basamak-1);

        System.out.println("kesilmisK = " + kesilmisK);

       /* System.out.println(sonH);*/
        String degismisH=sonH+kesilmisK+ilkH;

        System.out.println("degismisH = " + degismisH);


    }
}
