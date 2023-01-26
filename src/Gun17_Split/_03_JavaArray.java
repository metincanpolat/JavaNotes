package Gun17_Split;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında tek ve çift eleman sayılarını bulunuz.

        int[] dizi=new int[100]; // 100 elemanlı bir dizi

        int diziSayisi= dizi.length;

        for (int i=0; i<diziSayisi;i++)
            dizi[i]= (int) (Math.random()*100);

        for (int i=0; i<diziSayisi;i++) //kontrol için yazdırdık
            System.out.println(i+".sayı= "+dizi[i]);

        int tekS=0;
        int ciftS=0;
        for (int i=0; i<diziSayisi;i++){
            if (dizi[i]%2==0)
            ciftS+=1;
            else tekS+=1;
            }

        System.out.println("cift sayısı= " + ciftS);
        System.out.println("tek sayısı= " + tekS);








    }
}
