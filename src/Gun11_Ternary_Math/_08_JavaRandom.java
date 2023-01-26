package Gun11_Ternary_Math;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Soru : 0 ile 6(hariç) arasında random sayı üreten programı yazınız.

        double doubleRandomSayi=Math.random(); //0.0 - 0.9999999 arası sayı üretiyor.

        // 0 ile 6 arasında random sayı
        int intRandomSayi=(int) (doubleRandomSayi*6); // 0-5.999999 - (int) -> 0-5
        System.out.println("intRandomSayi = " + intRandomSayi);

        // direkt yöntem
        System.out.println((int) (Math.random()*6)); // 0-5 arası sayı verir




        /* 0,16   0   random sayı ihtimalleri boş işler.
        0,33  1
        0,49  2
        0,66 3
        0,83 4
        0,99 5
 */
    }
}
