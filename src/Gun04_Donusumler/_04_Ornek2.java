package Gun04_Donusumler;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short degisken tanımlayınız,
        // deger atayınız, sonra double degişkeni short değişkene çevirerek,
        // butun degerleri ekrana yazdırınız.

        double sayi1= 3.56;
        short sayi2= 5;
        sayi2=(short)sayi1;

        System.out.println(sayi1 +" "+ sayi2);

        double oran=3.2;
        short kisa=2;

        System.out.println("once kisa = " + kisa);
        kisa=(short)oran; // deger sığabildiği için tam sayı kısmını alır, ama ondalıklı kısım alınamaz.
        System.out.println("sonra kisa = " + kisa);

        oran = 30000000.2;
        kisa=(short) oran;  // short en fazla 32767 degeri alabilir
        System.out.println("kisa = " + kisa);
        // hem tam sayı kısmı sığmıyor, hem de ondalıklı kısım atılamıyor.tamamen deger kayboluyor.




    }
}
