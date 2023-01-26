package Gun30_Access_Modifiers._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();

        cal1.id=1; // direk erişim olmaması lazım
                   // sıradan gelen rakam verilmemeli
        cal1.name="ismet";
        cal1.surName="temur";
        //cal1.password=123 //direk erişiliyor
        // hem de kontrolsüz atandı
        // direk erişime kapalı olmalı
        // bunun yerine class a metd ekledim

        cal1.sifreAta("123");
        cal1.sifreAta("fddcf5452dv25d2");

        cal1.sifreGoster();

    }
}
