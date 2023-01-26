package Gun27._04_Ornek;

public class EnerjiSA {
    public static void main(String[] args) {
   /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı(fatura)  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

        Musteri kisi1=new Musteri();
        kisi1.name="Metin CANPOLAT";
        kisi1.hesap=new ElektrikHesabi();
        kisi1.hesap.tuketimEkle(3);


        System.out.println("Abone: "+kisi1.name+"\nToplam Tüketim: "+kisi1.hesap.toplamTuketim+"kw"+
                "\nToplam Fatura: "+kisi1.hesap.Fatura()+"TL"+"\nSon Ödeme Tarihi: 07.09.2022");








    }
}
