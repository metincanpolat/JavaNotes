package Gun28._01_Ornek;

public class Utility {
    public static void main(String[] args) {
        int sayiOrn; // int-> tip(class) , sayi -> değişken adı
        //tip     //nesne
        myUtility myUt=new myUtility();
        String strSayi=myUt.getString(356);
        int sayi=myUt.getInt("345");
        // bu methodlar Class a mı nesne ye mi ait
        // evet Nesne ye ait.

        Math.random(); // ben bunun direk nesne tanımlamadan
                       // kendi methodlarımı kullanmak istiyorum.

        String strSayi2=myUtility.getString2(23);
        int sayi2=myUtility.getInt2("34");
        // bu metodlar nesne oluşturmaya ihtiyaç duymayan
        // class a (tipe) ait metodlardır.

        Integer.parseInt("34"); // bu metod tipe ait
        Integer rakam=5;

        // Nesneyi ilgilendiren metodları normal yazıyoruz.
        // Nesneyi ilgilendirmeyen, Tipi ilgilendiren metodları STATIC ile yazıyoruz.



    }
}
