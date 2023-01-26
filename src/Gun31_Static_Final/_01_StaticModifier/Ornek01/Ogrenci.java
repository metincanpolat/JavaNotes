package Gun31_Static_Final._01_StaticModifier.Ornek01;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yıldırım Ilkokulu"; // sen bitanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin,sınıfın,class ın değişkeni oldu
    // bu şekilde hafızada sadece 1 tane yer tutuyor
    // eğer başına static koymayıp sadece string koysaydık her kullanan sayısı kadar
    // yer ediyor.

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

        // this.okulAdi="Yıldırım Ilkokulu";
        //bunu kaldırdık çünkü hafızada 500 tane yer kaplıyordu,
        //kötü hafıza kullanımı.
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
