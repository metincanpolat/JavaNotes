package Gun13_While_DoWhile;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // ekrana 5 kez merhaba yazdırınız.
        int sayac=0;
        // 0 1 2 3 4 -> 5 adım
        while (sayac<5) // iken yap
        {// şart sağlandığı sürece parantezlerin arasını çalıştırır
            System.out.println("merhaba");
            sayac++;  // sayac=sayac+1
        }
    }
}
