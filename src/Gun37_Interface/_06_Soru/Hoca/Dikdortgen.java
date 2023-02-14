package Gun37_Interface._06_Soru.Hoca;

public class Dikdortgen implements ISekil{
    @Override
    public double cevresi(int kisaKenar, int uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }

    @Override
    public double alani(int kisaKenar, int uzunKenar) {
        return kisaKenar*uzunKenar;
    }
}
