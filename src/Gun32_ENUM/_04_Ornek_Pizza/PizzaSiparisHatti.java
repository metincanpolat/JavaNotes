package Gun32_ENUM._04_Ornek_Pizza;


import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        // Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.
        // kenar kalınlığı
        // hamur cinsi
        // malzeme



        ArrayList<Siparis> orders=new ArrayList<>();




        Scanner oku = new Scanner(System.in);
        int secim;

        System.out.println("*********************************");
        System.out.println("Merhaba Ben Alfi \n30 Minutes Pizza'ya Hoşgeldiniz.");
        do {

            System.out.println("********************************");

        //    Musteri musteri1=new Musteri();
            Siparis siparis1 =new Siparis();
            Pizza pizza1=new Pizza();




            System.out.print("\n1- Sipariş Ver \n2- Sepetimi Göster \n3- Çıkış \nLütfen Seçiminizi Yapınız:");

            secim = oku.nextInt();
            switch (secim) {

                case 1:
                    pizza1.kind = kindSecim();

                    pizza1.size = sizeSecim();

                    siparis1.pizza=pizza1;

                    System.out.println("********************************\nSiparişiniz başarıyla sepete eklendi");

                    orders.add(siparis1);break;
                case 2:
                    if (orders.size()>0){
                        System.out.println("********************************\nSiparişiniz:");
                    for (Siparis order : orders)
                        System.out.println(order.pizza.kind +" - "+ order.pizza.size);
                    }
                    else System.out.println("********************************\nSepetiniz Boş");
                    break;
//                case 3:
//                    musteri1=kayit();
//                    orders.add(musteri1);

            }

        } while (secim!=4);






    }
    static Kindo kindSecim()
    {

        System.out.println("********************************");
        System.out.println("Lütfen Pizza Seçiminizi yapınız:");

        for (Kindo kind: Kindo.values())
        {
            System.out.println(kind.num+" - " + kind);
        }

        Scanner oku = new Scanner(System.in);
        int secim= oku.nextInt();
        switch (secim){
            case 1: return Kindo.Margarita;
            case 2: return Kindo.Pepperoni;
            case 3: return Kindo.Vejeteryan;
            case 4: return Kindo.Peynirli;
        }

        return null;
    }
    static Size sizeSecim()
    {
        for (Size size: Size.values())
        {
            System.out.println(size.num+" - " + size);
        }
        Scanner oku=new Scanner(System.in);
        int secim= oku.nextInt();
        switch (secim){
            case 1: return Size.SMALL;
            case 2: return Size.MEDIUM;
            case 3: return Size.LARGE;
        }
        return null;
    }

//    static Musteri kayit()
//    {
//        Scanner okuStr=new Scanner(System.in);
//        Musteri musteri=new Musteri();
//        System.out.println("adınız: ");
//        musteri.adi=okuStr.next();
//        System.out.println("soyadınız");
//        musteri.soyad=okuStr.next();
//
//        return musteri;


  //  }



}