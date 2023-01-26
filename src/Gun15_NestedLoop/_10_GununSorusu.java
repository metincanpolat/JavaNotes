package Gun15_NestedLoop;

public class _10_GununSorusu {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        //    *     4 boşluk 1 yıldız
        //   **     3 boşluk 2 yıldız
        //  ***     2        3
        // ****     1        4
        //*****     0        5
        for (int i=1; i<=5; i++ ) { // i -> 1 2 3 4 5
            for ( int j = 0; j < 5-i; j++) // satır değeri kadar yaz (i)
                System.out.print(" ");

            for (int j=0 ; j<i ; j++)
                    System.out.print("*");
            System.out.println(); // satır işi bitince satır atla
        }







        // Sayının simetrik olduğunu nasıl anlarsın?
        // sayının tersi kendisiyle aynı ise, 121 -> 121
        // sayının sondaki basamağını alacasın, ve onu yeni basamak geldikçe 10 ile çarpıp
        // yeni basamakla çarpacaksın.
        // 12521 -> 1 -> 1*10+2  -> 121*10+5 -> 125*10+2 -> 1252*10+1  -> 12521

    }
}
