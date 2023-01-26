package Gun04_Donusumler;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // Kişinin ağırlığnı double, boyunu int olarak degerler veriniz.
        // ve bir satırda boyunuz...ve kilonuz...şeklinde yazınız.
        // vucut kıtle ındexini de bularak yaziniz (kg/boy*boy)

        double kilo=74.5;
        int boy = 181;

        double kitleIndex=kilo/(boy*boy);  // widening genişletme yönünde
        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("boyunuz="+boy+"kilonuz="+kilo);

        int kitleindex2= (int)kilo/(boy*boy); // veri kaybı oluştu. narrow daraltma yönünde
        System.out.println("kitleindex2 = " + kitleindex2);

    }
}
