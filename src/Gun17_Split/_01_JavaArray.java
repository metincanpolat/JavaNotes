package Gun17_Split;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 2 atayınız  yazdırınız.

        int[] dizi=new int[50];

        int diziSayisi= dizi.length;

        for (int i=0; i<diziSayisi;i++)
            dizi[i]= (int) (Math.random()*10);

        for (int i=0; i<diziSayisi;i++)
            System.out.println(i+".sayı= "+dizi[i]);

        for (int i=0; i<diziSayisi;i++) {
            if (dizi[i] % 2 == 1)
                dizi[i] = 1; //tek olanlar 1
            else
                dizi[i] = 2; // çift olanlar 2 oldu.
        }

        System.out.println("***********************");
        for (int i=0; i<diziSayisi;i++)
            System.out.println(i+".sayı= "+dizi[i]);

    }
}
