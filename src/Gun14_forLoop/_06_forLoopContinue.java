package Gun14_forLoop;

public class _06_forLoopContinue {
    public static void main(String[] args) {
        // 2 ler çarpım tablosunu , tablo olarak yazdırınız.

        for (int i=1; i<=10 ; i++){
            if (i>=5 && i<=7)// 5 le 7 arasındaysa
                continue; // döngüyü kırmaz, pas geçirir.
            System.out.println("2 x "+i+"="+(2*i));
        }

    }
}
