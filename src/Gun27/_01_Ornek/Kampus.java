package Gun27._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.

        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1;
        ogr1.tamAd="ismet temur";
        ogr1.okulu=new Okul(); //nesne oldugu için new
        ogr1.okulu.adi="Atatürk Okulu";
        ogr1.okulu.mudurAdi="Hasan Ayana";
        ogr1.okulu.ucreti=1000;

        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.tamAd = " + ogr1.tamAd);
        System.out.println("ogr1.okulu.adi = " + ogr1.okulu.adi);
        System.out.println("ogr1.okulu.mudurAdi = " + ogr1.okulu.mudurAdi);
        System.out.println("ogr1.okulu.ucreti = " + ogr1.okulu.ucreti);


    }
}
