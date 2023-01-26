package Gun30_Access_Modifiers._3_Protected.bir;

public class Doktor {
    protected String adi; //default ile aynı
    String bolumu; // default

    private String sicilNo; //private

    public String hastaneAdi; // public

    Doktor(){ //default

    }

    public Doktor(String adi) { //public
        this.adi = adi;
    }
    void noAta(String no)
    {
        this.sicilNo=no;
    }
    void noyazdir()
    {
        System.out.println(sicilNo);
    }
}
