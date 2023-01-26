package Gun42_Date_Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate sadece gun, ay, yıl bilgisi tutar.

        LocalDate tarih=LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        System.out.println("*********************************");

        // Kendisindeki default var olan formatlar
        System.out.println("ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("(FormatStyle.SHORT)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("(FormatStyle.MEDIUM)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("(FormatStyle.LONG)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("(FormatStyle.FULL)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("*********************************");
        // Localde aldığım tarihi istediğim ülkenin formatına göre, diline göre nasıl gösteririm?
        // örneğin localdeki saati Almanya ya nasıl gösteririz.

        System.out.println("(FormatStyle.SHORT)) = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        // en-US : birincisi dili, ikincisi ülkeyi temsil ediyor, US United States of America
        // en-UK :                                                UK United Kingdom
        // fr-CA : Fransızca Kanada
        // en-CA : Kanada İngilizce

        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();
        for (Locale l : kullanilabilirLokaller){
            System.out.println(" Dil= "+l.getDisplayLanguage()+" Ulke= "+l.getDisplayCountry()
            +" "+l.getDisplayLanguage()+ " "+l.getCountry());
        }

        for (Locale l : kullanilabilirLokaller){
            if (l.getDisplayCountry().toLowerCase().contains("chi")) // istenen ülkeye göre süzüldü
                 System.out.println(" Dil= "+l.getDisplayLanguage()+" Ulke= "+l.getDisplayCountry()
                    +" "+l.getDisplayLanguage()+ " "+l.getCountry());
        }
        Locale lokalCin= new Locale("zh","CN");

        System.out.println("withLocale(lokalCin)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCin)));

        System.out.println("\n *****************İstediğim formatta gösterim*****************");

        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("dd.MM/yyyy");
        System.out.println("tarih = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih = " + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih = " + tarih.format(ozelFormat4));

        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih = " + tarih.format(ozelFormat5));

        System.out.println("Ozel Format ve Dil = " + tarih.format(ozelFormat5.withLocale(Locale.UK)));

        //Harf 	Temsil ettiği parça				Örnek
        //y		Yıl								1996; 96
        //M		Yıl içinde ay						July; Jul; 07
        //w		Yıl içinde hafta					27
        //W		Ay içinde hafta					2
        //D		Yıl içinde gün					189
        //d		Ay içinde gün					10
        //F		Ay içinde haftanın günü			2
        //E		Haftanın günü					Tuesday; Tue
        //a		Sabah/akşam					PM
        //H		Gün içinde saat (0-23)			0
        //k		Gün içinde saat (1-24)			24
        //K		Sabah/akşam için saat (0-11)	0
        //h		Sabah/akşam için saat (1-12)	12
        //m		Saat içinde dakika				30
        //s		Dakika içinde saniye				55
        //S		Milisaniye						978

        System.out.println("\n*******************");
        //Kendimiz bir tarihi nasıl set edebiliriz,oluşturabiliriz, int sayi=5

        LocalDate tarih1=LocalDate.of(2020,6,01);
        LocalDate tarih2=LocalDate.of(2021, Month.DECEMBER,6);
        System.out.println("tarih1 = " + tarih1.format(ozelFormat1));















    }
}
