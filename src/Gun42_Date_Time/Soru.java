package Gun42_Date_Time;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Soru {
    public static void main(String[] args) {
        // Canlı dijital saat yapınız

        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime saat=LocalTime.now();

        while (saat.getMinute()<16)
        {
            saat=LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.Wait(1);
        }



    }
}
