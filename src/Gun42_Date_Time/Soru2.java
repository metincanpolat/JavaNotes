package Gun42_Date_Time;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Soru2 {
    public static void main(String[] args) {
        // Alınan saati geriye doğru 60sn saydırınız.
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);

        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");

        LocalTime saat1=LocalTime.of(saat.getHour(), saat.getMinute(),59);
        System.out.println("saat1.format(f) = " + saat1.format(f));

        int dakika=saat.getMinute();
        int saniye=saat.getSecond();
        int st=saat.getHour();

        for (int sn=saniye; sn>=0; sn--){
            saat1=LocalTime.of(st,dakika,sn);
            System.out.print("\r"+saat1.format(f));
            MyFunc.Wait(1);

            if (sn==0)
            {
                dakika--;
                sn=60;
            }
            if (dakika==-1)// Yukarıda dakika -- olduğu için saat değişiminde sorun olur.o yüzden -1
            {
                st--;
                dakika=59;
               // sn=60;
            }
        }

        // önceki soruyu yazzzzzzzzzzzzz




    }
}
