package Gun27._02_Ornek;

public class Geometri {
    public static void main(String[] args) {

        Dikdortgen sekil=new Dikdortgen();
        sekil.kisaKenar=5;
        sekil.uzunKenar=10;

        int alani=sekil.alan();
        int cevresi= sekil.cevre();

        System.out.println("Çevresi = " + sekil.cevre());
        System.out.println("Alanı = " + sekil.alan());







    }
}
