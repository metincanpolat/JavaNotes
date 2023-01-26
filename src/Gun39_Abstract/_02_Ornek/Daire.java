package Gun39_Abstract._02_Ornek;

public class Daire extends Sekil {

    private int yariCap;

    public Daire(int yariCap) {
        setYariCap(yariCap);
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    double Alan() {
        return Math.PI*Math.pow(yariCap,2);
    }

    @Override
    double Cevre() {
        return 2*Math.PI*yariCap;
    }
}
