package Gun17_Split;

import java.util.Arrays;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split : bir stringi parçalara ayırır, verilen krtere göre

        String cumle="Bugün hava oldukça soğuk"; //bunu kelimelere ayıracak
        //Bugün
        //hava
        //oldukça
        //soğuk
        String[] kelimeler=cumle.split(" "); // boşlukları yok edip oralardan itibaren böldü.
        //bir şey verilmezse karkterlerine ayırır.

        for (int i=0; i< kelimeler.length; i++)
            System.out.println(i+".kelime = " + kelimeler[i]);

        //kısa yazdırma yolu
        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

    }
}
