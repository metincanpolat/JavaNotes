package Gun36_polymorphism._01_Protected.Paket1;

public class P1Hayvan {

    public String ad; // her paketten, her yerden
    int yas; // sadece kendi paketinden
    protected String cinsi; // default gibi çalışır sadece extend yapılırsa başka paketten erişilebilir.
    private String renk; // sadece kendi class ından erişilebilir.


}
