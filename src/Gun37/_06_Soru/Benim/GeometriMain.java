package Gun37._06_Soru.Benim;

public class GeometriMain {
    public static void main(String[] args) {

        //Kare, Dikdortken sınıflarından oluşacak bir geometri programı
        //yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
        //(cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.

        Kare k1=new Kare();
        k1.kenar=8;

        k1.cevresi();
        k1.alani();

        Dikdortgen d1=new Dikdortgen();

        d1.kisaKenar=2;
        d1.uzunKenar=6;

        d1.cevresi();
        d1.alani();





    }
}
