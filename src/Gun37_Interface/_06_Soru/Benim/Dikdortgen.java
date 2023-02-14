package Gun37_Interface._06_Soru.Benim;

public class Dikdortgen implements IGeometri{
    int kisaKenar;
    int uzunKenar;

    @Override
    public void cevresi() {
        System.out.println("Dikdörtgen cevresi = "+ 2*(kisaKenar+uzunKenar));
    }

    @Override
    public void alani() {
        System.out.println("Dikdörtgen alanı = "+ kisaKenar*uzunKenar);
    }



}
