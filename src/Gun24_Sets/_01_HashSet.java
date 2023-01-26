package Gun24_Sets;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // hafızada 1 sayı saklar
        int[] dizi=new int[6]; // hafızada 6 sayı saklar
        int[][] tablo=new int[3][4]; // hafızada 12 sayı saklar

        //dinamik boyutlu olanlar geçik
        ArrayList<Integer> liste=new ArrayList<>(); // boyu eklendikçe artar
        ArrayList<ArrayList<Integer>> listelerinListesi=new ArrayList<>(); // dinamik boyut

        // Bana artık her eklenmeye çalışılan elamanı eklemeyecek, yani TEKRAR a izin
        // VERMEYEN bir dizi lazım (SET), bu kriterden hangi türlü sıra istiyorsam
        //LINKEDHashSet (Ekleme sırasına göre),TreeSet (herzaman sıralı), HashSet(Hızlı,Sra yok)
        // toplu işlemler için kullanıldığından index kavramı yoktur.
        // bir dizideki tekrarlı elemanlardan nasıl kurtulursun -> SETE atararak

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMiIlk= hs1.add(5); // burada aynı zamanda eklemiş oluyor.
        boolean tekrarEklendiMi= hs1.add(5); // tekrar aynı bilgi girilirse eklemiyor.
        hs1.add(5);

        System.out.println("eklendiMiIlk = " + eklendiMiIlk);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);






    }
}
