package Gun37_Interface._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
        // bir interface in birden fazla class tarafından implemente edilmesi
        Cember c=new Cember();
        c.ciz();
        Dikdortgen d=new Dikdortgen();
        d.ciz();

        //interfacelerden nesne üretilemez fakat referans tipi oluşturulabilir
        // bu bize Polymorfism sağladı
        ICizdirir c2=new Cember();
        c2.ciz(); // direk olarak sadece Interface deki ismi veilmiş olan metodlara erişirsin

        cizdirme(c); //aşağıdaki metoda dikkat
        cizdirme(d);

    }
    public static void cizdirme(ICizdirir iciz)
    {
        iciz.ciz();
    }
}
