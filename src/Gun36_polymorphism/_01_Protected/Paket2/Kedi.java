package Gun36_polymorphism._01_Protected.Paket2;

import Gun36_polymorphism._01_Protected.Paket1.P1Hayvan;

public class Kedi extends P1Hayvan {

    public Kedi(String ad,String cinsi) {
        super.ad=ad;
        super.cinsi=cinsi;
        // protectedlara elstra olarak extend yoluyla
        // diğer paketlerden erişilebilir.
    }

}
