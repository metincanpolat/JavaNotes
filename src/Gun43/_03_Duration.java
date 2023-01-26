package Gun43;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
        // Duration : hem LocalTime hem de LocalDateTime ın kendi aralarındaki farkı
        // verir yani saat in olduğu her zamanlar arasındaki farkı bu şekilde buluyoruz

        //LocalTime
        LocalTime dersBaslangic = LocalTime.of(8,30);
        LocalTime dersBitis = LocalTime.of(11,15);

        Duration GunlukDersSaati=Duration.between(dersBaslangic,dersBitis);
        System.out.println("GunlukDersSaati = " + GunlukDersSaati);

        System.out.println("GunlukDersSaati.toHours() = " + GunlukDersSaati.toHours()); // farkın toplam saat halini
        System.out.println("GunlukDersSaati.toMinutes() = " + GunlukDersSaati.toMinutes()); // farkın toplam dakşka halini
        System.out.println("GunlukDersSaati.toMillis() = " + GunlukDersSaati.toMillis()); // farkın toplam milisaniyehalini

        //LocalDateTime  *** 2 Tarih-saat arasındaki fark ***

        LocalDateTime from=LocalDateTime.of(2022,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();
        
        Duration farkZaman=Duration.between(from,to);

        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());





    }
}
