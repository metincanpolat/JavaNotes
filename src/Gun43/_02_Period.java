package Gun43;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class _02_Period {
    public static void main(String[] args) {

        // 2 tarih arasındaki zaman farkını gösterir
        // LocalDate le için kullanılır.

        LocalDate dogumTarihi = LocalDate.of(1975,3,12);
        LocalDate bugun=LocalDate.now();

        Period fark = Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getMonths() = " + fark.getDays());

        System.out.println(fark.getYears()+ "yaşındasınız.");

        /****************************/

        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        LocalDate ucGunSonra = bugun.plus(period3Gun); // zaman aralığı ekleme
        LocalDate ucAySonra = bugun.plus(period3Ay);

        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);

        System.out.println("*******************************");

        LocalDate kursB=LocalDate.of(2022,7,25);

        Period kursSure=Period.ofMonths(6);

        LocalDate kursBitis=kursB.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        // kurs bitimine gör ne kadar süre kaldı
        Period neKadarSureKaldi=Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        Period devamSuresi=Period.between(kursB,bugun);
        System.out.println("devamSuresi = " + devamSuresi);







    }
}
