package Gun28._03_GununSorusu;

public class Universite {
    public static void main(String[] args) {

        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
        // 2- Student: fields : name, maxSaat, dersleri listesini tutacak bir liste.
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Saati geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
        // 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.


        Lesson ders1=new Lesson();
        ders1.name="Tarih101";
        ders1.saat=4;

        Lesson ders2=new Lesson();
        ders2.name="Java101";
        ders2.saat=3;

        Lesson ders3=new Lesson();
        ders3.name="Alg101";
        ders3.saat=6;

        Student ogr1=new Student();

        ogr1.name="Metin Canpolat";
        ogr1.maxLimit=10;

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);

        ogr1.dersleriYazdir();









    }
}
