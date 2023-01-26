package Gun35._01_Ornek_inheritance;

public class AracPark {
    public static void main(String[] args) {
        // 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
        // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
        // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
        // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
        //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.

        Otobus otobus1=new Otobus("VOLVO","Sarı",4000,68);
        System.out.println("otobus1 = " + otobus1);



    }


}
