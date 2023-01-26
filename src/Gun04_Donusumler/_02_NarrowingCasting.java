package Gun04_Donusumler;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.7;
        int sayi =5;

        sayi = (int) oran;
        System.out.println("sayi = " + sayi);

        long genelToplam= 378;
        sayi=(int) genelToplam; // veri kaybi olacak mi? Hayir.
        System.out.println("genelToplam = " + genelToplam);




    }
}
