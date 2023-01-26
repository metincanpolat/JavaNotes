package Gun44._01_ZamanDigerIslemler;

import java.time.LocalDate;

public class ComparingDataAndTime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        boolean sonraMi = bugun.isAfter(dun); // bugün dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi = bugun.isBefore(dun); // buggün dünden özce mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi = bugun.isEqual(dun); // bugün dün esit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYil = bugun.isLeapYear(); // bugun artik yil mi
        System.out.println("artikYil = " + artikYil);
    }
}
