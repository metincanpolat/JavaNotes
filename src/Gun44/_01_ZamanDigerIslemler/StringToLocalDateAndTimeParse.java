package Gun44._01_ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //Kullanıcıdan alınan ve string durumunda olan bir time veya tarih
        // bilgisinin time veya tarih değişkenine çevrilmesi.
        long startTime=System.currentTimeMillis(); //kodun performansı için pratik
        
        Scanner oku=new Scanner(System.in);
        System.out.println("Tarih Giriniz (25 01 2020) = ");
        String strTarih=oku.nextLine();

        // Kullanıcının gireceği formata göre format oluşturduk.
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        // String formatı bu formatta uygun olmalı. parse ile cevirdik
        LocalDate tarih=LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(f) = " + tarih.format(f));

        long finishTime=System.currentTimeMillis();

        System.out.println("(finishTime-startTime)+\"ms\" = " + (finishTime-startTime)+"ms"); // geçen süreyi ms cinsinden bulduk
        




    }
}
