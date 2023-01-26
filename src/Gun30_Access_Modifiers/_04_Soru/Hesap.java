package Gun30_Access_Modifiers._04_Soru;

import java.util.Scanner;

public class Hesap {
    Scanner okuInt=new Scanner(System.in);

    private int yatan;
    private int cekilen;
    private int bakiye;
    private int sifre=1234; //Bankanın verdiği ilk şifre

    public void sifreDegistirme()
    {
        Scanner okuInt=new Scanner(System.in);
        int sayac=3;
        while (sayac>0){
        System.out.println("Eski şifreyi giriniz:");
        int sifre=okuInt.nextInt();
        if (this.sifre==sifre){
            System.out.println("Yeni şifreyi giriniz: ");
            int yeniSifre=okuInt.nextInt();
            this.sifre=yeniSifre;
            System.out.println("Şifre Başarıyla Değiştirildi.");break;}
        else {
            System.out.println("Hatalı şifre girdniz");
            sayac--;
            System.out.println("Kalan hatalı giriş sayısı= "+sayac);

            if (sayac==3)
                System.out.println("Şifreyi Çok Fazla Hatalı Girdiniz," +
                        "\nLütfen Müşteri Temsilcisi ile görüşünüz");}
        }
    }
    void paraYatirma()
    {
        System.out.println("Yatırmak istediğini tutar= ");
        int yeniPara=okuInt.nextInt();
        this.bakiye+=yeniPara;
        System.out.println(yeniPara+" TL Başarıyla hesabınıza yatırıldı.");
        System.out.println("Yeni Bakiyeniz= "+bakiye+"TL");

    }
    void paraCekme()
    {
        if (bakiye>0){
            System.out.println("Bakiyeniz= "+bakiye+"TL dir."+"\nÇekmek istediğini tutar= ");
            int eksiPara=okuInt.nextInt();
            if (eksiPara<bakiye) {
            this.bakiye -= eksiPara;
            System.out.println("Yeni bakiyeniz= "+bakiye+"TL");}
            else System.out.println("Bakiyeniz yetersizdir.");}
        else System.out.println("Hesabınızda para bulunmamaktadır.");

    }
    void bakiyeSorgulama()
    {
        System.out.println("this.bakiye = " + this.bakiye);
    }







}
