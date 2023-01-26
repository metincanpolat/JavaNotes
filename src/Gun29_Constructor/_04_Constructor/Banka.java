package Gun29_Constructor._04_Constructor;

public class Banka {

    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() {
        this(" ",0,0);
    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    public Banka(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        String donecek= "Banka: " +
                "adi=" + adi;
        if (subeSayisi>0)
            donecek+=", şube sayısı= "+subeSayisi;
        if (kurulusYili>0)
            donecek+=", kuruluş yılı= "+ kurulusYili;

        return donecek;
    }

}

