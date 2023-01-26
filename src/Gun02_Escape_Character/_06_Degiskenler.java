package Gun02_Escape_Character;

public class _06_Degiskenler {
    public static void main(String[] args) {
        // Degiskenler - Variable
        int sayi; // int(integer) : tam sayi saklayacak kadar hafızada yer ayiriyor ve onun adına sayı diyor
        // degiskenin adi sayı, tipi int, int: tam sayi

        int saYi; // bir harf bile farklı olsa farklı degiskendir.
        int SAYI; // buyuk harf ve kucuk harf tamamen farkli degisken demektir.
        // Java buyuk kucuk harf duyarlı (case sensitive) dildir.

        sayi=5; // sayinin degeri 5 oldu.
        System.out.println("sayi"); // cift tirnak arasindaki her sey ekrana direk yazilir.
        System.out.println(sayi); // degiskenin adını direkt yazarak DEGERINI yazar.

        System.out.println("sayi="+sayi); // sayi=5

        sayi=7; // sayinin degeri 7 oldu.
        int kisakenar=5;
        int uzunkenar=7;

        int cevre=kisakenar+kisakenar+uzunkenar+uzunkenar;
        System.out.println("Cevresi="+cevre);

    }
}
