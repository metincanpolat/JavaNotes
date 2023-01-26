package Gun21_Return;

public class _04_Return {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz();              // giden yok, dönen yok
        toplamYaz(4,5);            // giden var, dönen yok (fonksiyonu bir şeye eşitleyebiliyor musun)
        int enb=Math.max(4,5);     // giden var dönen var
        double sayi=Math.random(); // giden yok, dönen var

        /********************************/
        enbYaz(4,5); // giden var 4,5 ama dönen yok

        int dönen=enbBul(4,5); // giden var dönen de var
        System.out.println("dönen = " + dönen);
    }
    public static int enbBul(int sayi1,int sayi2) // dönecek tip int
    {
        int eb=0;
        if (sayi1>sayi2)
            eb=sayi1;
        else
            eb=sayi2;

        return eb; //dönecek olan değişken yazılıyor,fonksiyonun adından önceye de
                    // dönecek olan değişkenin tipi yazılı.
                    // void tipsiz demek onun yerine değişken tipi yazıyoruz.
    }
    public static void enbYaz(int sayi1, int sayi2)
    {
        if (sayi1>sayi2)
            System.out.println("sayi1 = " + sayi1);
        else System.out.println("sayi2 = " + sayi2);
    }

    public static void merhabaYaz()
    {
        System.out.println("Merhaba Dünya");
    }

    public static void toplamYaz(int sayi1, int sayi2)
    {
        System.out.println(sayi1+sayi2);    }





}
