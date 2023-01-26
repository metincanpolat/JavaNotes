package Gun34_inheritance._02_Ornek_extends_super;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kopek kopek=new Kopek("beyaz",20,"kangal");

        kopek.konustu();
        // önce kendisindekini kullanır, yoksa super e gider.

        Ordek ordek1=new Ordek("siyah",10,"pekin",1);

        ordek1.konustu();


    }
}
