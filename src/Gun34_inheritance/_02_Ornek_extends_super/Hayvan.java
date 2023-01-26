package Gun34_inheritance._02_Ornek_extends_super;

public class Hayvan { // base class, parent; programcılık dilindeki isimleri

    private String renk;
    private int kilo;
    private String cinsi;

    public Hayvan(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo = kilo;
        this.cinsi = cinsi;
    }
    public void konustu()
    {
        System.out.println("Hayvan ses çıkardı");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
