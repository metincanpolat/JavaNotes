package Gun43;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now();
        // şu anda benim bulunduğum default zoneId ye göre zamanı verecek;

        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String z : zamanBolgeleri){
            if (z.toLowerCase().contains("ist"))
                System.out.println("z = " + z);
        }

        ZoneId zoneIdLondon = ZoneId.of("Europe/London");
        ZonedDateTime saatLondon = ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + saatLondon);

        ZoneId zoneIdIstanbul = ZoneId.of("Europe/Istanbul");
        ZonedDateTime saatIstanbul = ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("saatIstanbul = " + saatIstanbul);





    }
}
