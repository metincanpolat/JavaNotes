package Gun29_Constructor._04_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.


        Banka bank1=new Banka("YKB",35,1925);
        Banka bank2=new Banka("Akbank",36);
        Banka bank3=new Banka("Garanti");
        Banka bank4=new Banka(); // Eğer böyle tanımlamak istersek boş constructor açmamız gerekiyor.
        bank4.adi="DenizBank";
        bank4.subeSayisi=134;



        System.out.println("bank1 = " + bank1);
        System.out.println("bank3 = " + bank3);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank4 = " + bank4);






    }
}
