package Gun39_Abstract._01_Ornek;

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }
    abstract String hizlanmaSuresi();// soyut, gövdesiz, abstract

    public String getMarka() {
        return marka;
    } // somut, gövdeli, concrete

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
