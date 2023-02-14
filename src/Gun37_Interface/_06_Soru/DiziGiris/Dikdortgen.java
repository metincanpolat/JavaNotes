package Gun37_Interface._06_Soru.DiziGiris;

public class Dikdortgen implements ISekil {
    @Override
    public double cevresi(int... dizi) {
        return (dizi[0]+dizi[1])*2;
    }

    @Override
    public double alani(int... dizi) {
        return dizi[0]*dizi[1];
    }
}
