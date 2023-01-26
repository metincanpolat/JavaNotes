package Gun31_Static_Final._02_FinalModifier.Ornek3;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaattekiDakikaayisi=60;
    final static int birDakikadakiSaniyeSayisi=60;

    public static int toSecond(int gun,int saat,int dak)
    {
        int toplamSaniye=
                gun*Sabitler.birGundekiSaatSayisi*
                        Sabitler.birSaattekiDakikaayisi*
                        Sabitler.birDakikadakiSaniyeSayisi
                        +
                        saat*Sabitler.birSaattekiDakikaayisi*
                                Sabitler.birDakikadakiSaniyeSayisi
                        +
                        dak*Sabitler.birDakikadakiSaniyeSayisi;
        return toplamSaniye;
    }



}
