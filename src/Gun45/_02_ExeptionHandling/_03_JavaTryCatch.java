package Gun45._02_ExeptionHandling;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");

        try { // dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2022, Month.FEBRUARY,30);

        } // hata  olduğu zaman programı kırma
        catch (Exception ex) // ex isimli değişkende oluşan hataların bilgisi atanıyor.
        { // hata olduğunda yapılması istenenler buraya yazılıyor.
            System.out.println("Hata oluştu lütfen tekrar deneyiniz");
            System.out.println(ex.getMessage());
            System.out.println("ex.toString() = " + ex.toString());

            // kendine mail at : gelen datayı ve hatayı
            // veri abanın kalıcı yer yaz
        }

        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");

    }
}
