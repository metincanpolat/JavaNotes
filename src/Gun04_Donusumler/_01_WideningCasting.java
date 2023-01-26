package Gun04_Donusumler;

public class _01_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        int sayi=9;
        long toplam=678;
        double oran=3.2;

        oran=sayi;  // oran = 9, kayıp olmadı.
        // bu tip donusumlere genisletilme yonunde donusum denir.
        System.out.println("oran = " + oran);

        toplam=sayi;
        System.out.println("toplam = " + toplam);

        oran = toplam;
        System.out.println("oran = " + oran);


    }
}
