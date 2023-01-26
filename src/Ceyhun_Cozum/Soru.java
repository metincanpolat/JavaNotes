package Ceyhun_Cozum;

// Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Lesson : fields : name, credit (1-10 arasında değer alıyor).
// 2- Student: fields : name, maxCredit, dersleri adında derslerinin listesini tutacak bir liste.
// 3- 3 adet ders oluşturunuz.
// 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
// 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
//    ders eklerken max alabileceği Crediti geçmemeli, geçerse
//    uyarı versin, alabileceğiniz max credi doldu şeklinde.
// 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız. en başta yazdırınız
public class Soru {
    public static void main(String[] args) {
        Lesson.uniKurallari();
        Student student=new Student();
        student.stdKayit();
        student.dersSecim(Lesson.lessonList());
        student.cokluSecim(student.mylist);

    }
}
