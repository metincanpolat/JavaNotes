package Gun21_Return;

import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak, kullanıcı çıkış seçeneğini seçene kadar
        // sürekli işlemleri yapınız ve her bir menü için gerekli değerleri parametre alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        hesaplamaIslemPanosu();






    }
    public static void hesaplamaIslemPanosu () {
        Scanner oku = new Scanner(System.in);
        int sayi;
        int sayi1, sayi2;
        do {
            System.out.println("\n1-toplama\n" +
                    "2-çıkarma\n" +
                    "3-çarpma\n" +
                    "4-bolme\n" +
                    "5-Faktöryel\n" +
                    "6-Çıkış\n" +
                    "Seçim yapınız: ");
            sayi = oku.nextInt();


            switch (sayi) {
                case 1:
                    System.out.println("ilk sayıyı giriniz= ");
                    sayi1 = oku.nextInt();
                    System.out.println("ikinci sayıyı giriniz= ");
                    sayi2 = oku.nextInt();
                    int toplam = sayi1 + sayi2;
                    System.out.println(toplam);
                    break;


                case 2:
                    System.out.println("ilk sayıyı giriniz= ");
                    sayi1 = oku.nextInt();
                    System.out.println("ikinci sayıyı giriniz= ");
                    sayi2 = oku.nextInt();
                    int fark = sayi1 - sayi2;
                    System.out.println(fark);
                    break;

                case 3:
                    System.out.println("ilk sayıyı giriniz= ");
                    sayi1 = oku.nextInt();
                    System.out.println("ikinci sayıyı giriniz= ");
                    sayi2 = oku.nextInt();
                    int carpim = sayi1 * sayi2;
                    System.out.println(carpim);
                    break;
                case 4:
                    System.out.println("ilk sayıyı giriniz= ");
                    sayi1 = oku.nextInt();
                    System.out.println("ikinci sayıyı giriniz= ");
                    sayi2 = oku.nextInt();
                    int bolme = sayi1 / sayi2;
                    System.out.println("Sonuç="+bolme);
                    int kalan=sayi1%sayi2;
                    System.out.println("Kalan= "+kalan);
                    break;
                case 5:
                    System.out.println("sayıyı giriniz= ");
                    sayi1 = oku.nextInt();
                    int faktoriyel = 1;
                    for (int i = 1; i <= sayi1; i++) {
                        faktoriyel = faktoriyel * i;
                    }
                    System.out.println(faktoriyel);
                    break;

                case 6:
                    System.out.println("İşlemi sonlandırdınız");
                    break;

                default:
                    System.out.println("Hataı giriş yaptınız");break;
            }

        } while (sayi != 6);
    }
}
