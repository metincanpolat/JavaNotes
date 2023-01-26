package Gun28._02_Ornek;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        System.out.println(MyMath.getPow(2,3));
        System.out.println(MyMath.getMin(6,4));


        for (int i = 0; i <30; i++) {

        System.out.print(MyMath.getRandom(-100,+100)+"*");
        }

        System.out.println(MyMath.getRandom(6));

        // 2 tane getRandom yaptık. işlem yapacağımız zaman istediğimizi
        // seçebiliriz yazacağımız sayıya göre kendisi otomatik kullanıyor.



//        for (int i = 0; i <30; i++) {
//
//            System.out.print("\n"+(int)Math.random()*((100-(-100))+100)+"*");
//        }



    }


}
