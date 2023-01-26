package Gun39_Abstract._02_Ornek;

public class Dikdortgen extends Sekil{

    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen(int kisaKenar, int uzunKenar,String name) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
        setName(name);
    }

    @Override
    double Alan() {
        return kisaKenar*uzunKenar;
    }

    @Override
    double Cevre() {
        return (kisaKenar+uzunKenar)*2;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
