package Gun33_Encapsulation._02_Ornek;

public class Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba() { // Bunu koymaz isen aşağıdaki tüm bilgileri
        // tek satrda isteyen constructor ile bağlantı kurarar hata verir
    }

    void setRenk(String renk)
    {
        this.renk=renk;
    }
    void setKapiSayisi(int kapiS)
    {
        if (kapiS>1&&kapiS<8)
            this.kapiSayisi=kapiS;
        else System.out.printf("Hatalı giriş yaptınız");
    }

    public String getRenk() {
        return renk;
    }

    public int getModel() {
        return model;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
    //  this.renk = renk;
    //  this.model = model;
    //  this.motorHacmi = motorHacmi;
    //  this.kapiSayisi = kapiSayisi;
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
    }

    public void setModel(int model)
    {
        this.model = model;
    }

    public void setMotorHacmi(double motorHacmi)
    {
        this.motorHacmi = motorHacmi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
