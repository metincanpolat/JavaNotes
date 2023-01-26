package Gun37._06_Soru.DiziGiris;

public class Daire implements ISekil{
    @Override
    public double cevresi(int... dizi) {
        return 2*Math.PI*dizi[0];
    }

    @Override
    public double alani(int... dizi) {
        return Math.PI*(dizi[0]*dizi[0]);
    }


}
