package Gun37._06_Soru.Benim;

public class Kare implements IGeometri{
    int kenar;


    @Override
    public void cevresi() {
        System.out.println("Kare Cevresi = "+ 4*kenar);
    }

    @Override
    public void alani() {
        System.out.println("Kare Cevresi = "+ kenar*kenar);

    }
}
